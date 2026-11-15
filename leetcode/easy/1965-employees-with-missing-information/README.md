# Employees With Missing Information

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Employees`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| employee_id | int     |
| name        | varchar |
+-------------+---------+
employee_id is the column with unique values for this table.
Each row of this table indicates the name of the employee whose ID is employee_id.

```

 

Table: `Salaries`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| employee_id | int     |
| salary      | int     |
+-------------+---------+
employee_id is the column with unique values for this table.
Each row of this table indicates the salary of the employee whose ID is employee_id.

```

 

Write a solution to report the IDs of all the employees with  **missing information**. The information of an employee is missing if:

- The employee's name is missing, or
- The employee's salary is missing.

Return the result table ordered by `employee_id`  **in ascending order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Employees table:
+-------------+----------+
| employee_id | name     |
+-------------+----------+
| 2           | Crew     |
| 4           | Haven    |
| 5           | Kristian |
+-------------+----------+
Salaries table:
+-------------+--------+
| employee_id | salary |
+-------------+--------+
| 5           | 76071  |
| 1           | 22517  |
| 4           | 63539  |
+-------------+--------+
Output: 
+-------------+
| employee_id |
+-------------+
| 1           |
| 2           |
+-------------+
Explanation: 
Employees 1, 2, 4, and 5 are working at this company.
The name of employee 1 is missing.
The salary of employee 2 is missing.

```

## Solution

**Language:** SQL  
**Runtime:** 110 ms  
**Memory:** 0B  
**Submitted:** 2026-11-15T16:26:20.152Z  

```sql
SELECT T.employee_id
FROM  
  (SELECT * FROM Employees LEFT JOIN Salaries USING(employee_id)
   UNION 
   SELECT * FROM Employees RIGHT JOIN Salaries USING(employee_id))
AS T
WHERE T.salary IS NULL OR T.name IS NULL
ORDER BY employee_id;
```

---

[View on LeetCode](https://leetcode.com/problems/employees-with-missing-information/)