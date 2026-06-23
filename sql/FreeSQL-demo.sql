select * from  scott.dept;

select round(avg(sal)) from scott.emp;

select * from scott.emp where sal >= (select round(avg(sal))from scott.emp);

select deptno,round(avg(sal)) from scott.emp group by deptno order by deptno;

select * from scott.emp o where sal >=(select round(avg(sal))from scott.emp i where i.deptno=o.deptno) order  by deptno;

select count(*) from scott.emp group by deptno order by deptno desc;

select deptno,count(*) from scott.emp group by deptno order by deptno desc FETCH FIRST 1 ROW WITH TIES;

select deptno,sum(sal) s from scott.emp group by deptno order by s desc FETCH FIRST 1 ROW ONLY ;

select deptno,max(sal),min(sal) from scott.emp group by deptno order by deptno;

SELECT e.empno,e.ename AS emp_name, m.empno AS mgr_empno,m.ename AS mgr_name,sm.empno             AS skip_mgr_empno,
       sm.ename  AS skip_mgr_name
FROM scott.emp e
LEFT JOIN scott.emp m  ON e.mgr = m.empno
LEFT JOIN scott.emp sm ON m.mgr = sm.empno
ORDER BY e.empno;