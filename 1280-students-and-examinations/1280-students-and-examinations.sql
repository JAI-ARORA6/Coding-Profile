# Write your MySQL query statement below
SELECT 
    s.student_id,
    s.student_name,
    sy.subject_name,
    Count(E.STUDENT_ID) as attended_exams
FROM students s
CROSS JOIN SUBJECTS sy
LEFT JOIN Examinations e
ON s.student_id=e.student_id
AND sy.subject_name=e.subject_name
GROUP BY
    s.student_id,
    s.student_name,
    sy.subject_name
ORDER BY s.student_id,sy.subject_name;