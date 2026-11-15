select
    user_id as buyer_id,
    join_date,
    sum(odr) as orders_in_2019
from
    (select
        u.user_id,
        u.join_date,
        case when year(order_date) = 2019 then 1 else 0 end as odr
    from users u
    left join Orders o
        on u.user_id = o.buyer_id) a
group by buyer_id, join_date
order by buyer_id;   