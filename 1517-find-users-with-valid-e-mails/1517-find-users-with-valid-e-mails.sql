# Write your MySQL query statement below
SELECT user_id,name,mail
FROM Users
Where mail REGEXP '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode\\.com$'  
AND mail LIKE BINARY '%@leetcode.com';