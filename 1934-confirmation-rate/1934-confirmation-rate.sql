# Write your MySQL query statement below
SELECT s.user_id,
    ROUND(
        COALESCE(
            SUM(CASE WHEN c.action='confirmed' THEN 1 ELSE 0 END)
            / NULLIF(COUNT(C.user_id),0),0
        ),2) AS confirmation_rate

    FROM signups s
    LEFT JOIN Confirmations c
        ON s.uSer_id=c.user_id
    GROUP BY s.user_id;        
