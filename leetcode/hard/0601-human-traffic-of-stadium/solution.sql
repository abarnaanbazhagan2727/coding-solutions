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