# Human Traffic of Stadium

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Table: `Stadium`

```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| visit_date    | date    |
| people        | int     |
+---------------+---------+
visit_date is the column with unique values for this table.
Each row of this table contains the visit date and visit id to the stadium with the number of people during the visit.
As the id increases, the date increases as well.

```

 

Write a solution to display the records with three or more rows with  **consecutive**  `id`'s, and the number of people is greater than or equal to 100 for each.

Return the result table ordered by `visit_date` in  **ascending order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Stadium table:
+------+------------+-----------+
| id   | visit_date | people    |
+------+------------+-----------+
| 1    | 2017-01-01 | 10        |
| 2    | 2017-01-02 | 109       |
| 3    | 2017-01-03 | 150       |
| 4    | 2017-01-04 | 99        |
| 5    | 2017-01-05 | 145       |
| 6    | 2017-01-06 | 1455      |
| 7    | 2017-01-07 | 199       |
| 8    | 2017-01-09 | 188       |
+------+------------+-----------+
Output: 
+------+------------+-----------+
| id   | visit_date | people    |
+------+------------+-----------+
| 5    | 2017-01-05 | 145       |
| 6    | 2017-01-06 | 1455      |
| 7    | 2017-01-07 | 199       |
| 8    | 2017-01-09 | 188       |
+------+------------+-----------+
Explanation: 
The four rows with ids 5, 6, 7, and 8 have consecutive ids and each of them has >= 100 people attended. Note that row 8 was included even though the visit_date was not the next day after row 7.
The rows with ids 2 and 3 are not included because we need at least three consecutive ids.

```

## Solution

**Language:** SQL  
**Runtime:** 113 ms  
**Memory:** 0B  
**Submitted:** 2026-11-15T15:54:24.921Z  

```sql
# Write your MySQL query statement below
select id,visit_date,people
from(
    select id,visit_date,people,
    lead(id)over(order by id asc) as nex_id,
    lead(id,2) over(order by id asc) as nex_id2,
    lag(id) over(order by id asc) as prev_id,
    lag(id,2) over(order by id asc) as prev_id2,
    lead(people) over(order by id asc) as nex_day_ppl,
    lead(people,2) over(order by id asc) as nex_day_ppl2,
    lag(people) over(order by id asc) as prev_day_ppl,
    lag(people,2) over(order by id asc) as prev_day_ppl2
    from Stadium
    
)as temp
where (temp.nex_id-temp.id=1
    and abs(temp.id-temp.nex_id2)=2 
    and temp.people>=100
    and temp.nex_day_ppl>=100
    and temp.nex_day_ppl2>=100)
    or
    (
    abs(temp.prev_id-temp.id)=1
    and abs(temp.id-temp.prev_id2)=2 
    and temp.people>=100
    and temp.prev_day_ppl>=100
    and temp.prev_day_ppl2>=100
    )
    or
    (
    abs(temp.prev_id-temp.id)=1
    and abs(temp.id-temp.nex_id)=1 
    and temp.people>=100
    and temp.prev_day_ppl>=100
    and temp.nex_day_ppl>=100
    )
order by visit_date asc
```

---

[View on LeetCode](https://leetcode.com/problems/human-traffic-of-stadium/)