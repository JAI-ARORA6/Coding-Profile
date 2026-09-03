# Write your MySQL query statement below
select id,Count(*) as num
FROM (
    SELECT requester_id AS ID
    FROM RequestAccepted
    
    UNION ALL
    
    SELECT accepter_id
    FROM RequestAccepted) t

    GROUP BY id
    ORDER BY num DESC
    LIMIT 1

