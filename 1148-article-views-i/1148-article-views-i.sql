# Write your MySQL query statement below
SELECT  distinct viewer_id AS id
FROM Views
WHERE author_id = viewer_id
order by id;
