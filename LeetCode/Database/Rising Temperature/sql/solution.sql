# Write your MySQL query statement below
# Write your MySQL query statement below
select e.id from Weather e join Weather m on datediff(e.recordDate,m.recorddate)=1
and e.temperature>m.temperature ;