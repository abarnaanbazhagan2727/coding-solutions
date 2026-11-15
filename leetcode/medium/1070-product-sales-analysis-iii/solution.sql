SELECT 
    product_id, 
    MIN(year) AS first_year, 
    quantity, 
    price
FROM sales
GROUP BY product_id;