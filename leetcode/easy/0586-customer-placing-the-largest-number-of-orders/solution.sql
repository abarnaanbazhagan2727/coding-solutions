# Write your MySQL query statement below
select customer_number
from(
    select customer_number,
    rank() over (order by count( *) desc) as rk
    from Orders
    group by customer_number
)as temp
limit 1