# Write your MySQL query statement below
WITH cte
AS (
    SELECT 
        id,
        request_at AS Day,
        IF(status!='completed', 1, 0) AS Cancelled
    FROM Trips 
    WHERE client_id IN (SELECT users_id FROM Users WHERE banned='No')
        AND driver_id IN (SELECT users_id FROM Users WHERE banned='No')
        AND request_at BETWEEN '2013-10-01' AND '2013-10-03'
)

SELECT 
    Day, 
    ROUND(SUM(Cancelled) / COUNT(id), 2) AS 'Cancellation Rate'
FROM cte
GROUP BY Day