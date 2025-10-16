select * from departments;
--Unlike MySQL or SQL Server, Oracle does NOT support multi-row INSERT statements in a single query (using commas).
INSERT INTO Departments (dept_id, dept_name)
VALUES (101, 'HR');
INSERT INTO Departments (dept_id, dept_name)
VALUES (102, 'IT');
INSERT INTO Departments (dept_id, dept_name)
VALUES (103, 'Finance');

---------------------------------------

CREATE TABLE Employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(50),
    dept_id INT,
    salary DECIMAL(10,2),
    manager_id INT,
    hire_date DATE,
    FOREIGN KEY (dept_id) REFERENCES Departments(dept_id)
);

select * from employees;

INSERT INTO Employees (emp_id, name, dept_id, salary, manager_id, hire_date)
VALUES (1, 'John', 101, 50000, 3, TO_DATE('2018-02-14', 'YYYY-MM-DD'));

INSERT INTO Employees (emp_id, name, dept_id, salary, manager_id, hire_date)
VALUES (2, 'Sarah', 102, 60000, 4, TO_DATE('2019-04-20', 'YYYY-MM-DD'));

INSERT INTO Employees (emp_id, name, dept_id, salary, manager_id, hire_date)
VALUES (3, 'Mike', 101, 80000, NULL, TO_DATE('2015-06-01', 'YYYY-MM-DD'));

INSERT INTO Employees (emp_id, name, dept_id, salary, manager_id, hire_date)
VALUES (4, 'Rachel', 103, 90000, NULL, TO_DATE('2014-07-11', 'YYYY-MM-DD'));

INSERT INTO Employees (emp_id, name, dept_id, salary, manager_id, hire_date)
VALUES (5, 'David', 102, 55000, 4, TO_DATE('2020-09-10', 'YYYY-MM-DD'));

-----------------------------------------------XXX---------------------------------------------------------
-- Tables : Employees, Departments

-- Question 1 : Display all columns from the Employees table.
select * from employees;
-- Question 2 : Display only name and salary of employees.
select name, salary from employees;
-- Question 3 : Show all department names from the Departments table.
select DEPT_NAME from departments;
-- Question 4 : Display unique department IDs from Employees.
select DISTINCT DEPT_ID from employees;
-- Question 5 : Show employees who work in department 101.
select * from employees where dept_id = '101';
-- Question 6 : Find employees with salary greater than 60000.
select * from employees where salary > 60000;
-- Question 7 : Find employees with salary between 50000 and 80000.
select * from employees where salary BETWEEN 50000 and 80000;
-- Question 8 : Show employees whose name starts with ‘S’.
select * from employees where name like 'S%';
-- Question 9 : Show employees whose name ends with ‘h’.
select * from employees where name like '%h';
-- Question 10 : Display employees hired after 2018.
select * from employees where hire_date > TO_DATE('2018-01-01', 'YYYY-MM-DD');
-- Question 11 : Display employees not working in department 102.
select * from employees where dept_id != 102;
-- Question 12 : Sort employees by salary (ascending).
select * from employees order by salary ASC;
-- Question 13 : Sort employees by salary (descending).
select * from employees order by salary DESC;
-- Question 14 : Display top 3 highest-paid employees.
SELECT * FROM (SELECT * FROM employees ORDER BY salary DESC)WHERE ROWNUM <= 3;
-- Question 15 : Display all employees where manager_id is NULL.
select * from employees where manager_id is null;
-- Question 16 : Find employees in departments 101 or 103.
select * from employees where dept_id IN (101, 103);
-- Question 17 : Find employees whose name contains the letter ‘a’.
select * from employees where name like '%a%';
-- Question 18 : Find employees hired between 2015 and 2019.
select * from employees where hire_date BETWEEN TO_DATE('2015-01-01', 'YYYY-MM-DD') and TO_DATE('2019-01-01', 'YYYY-MM-DD');
-- Question 19 : Show employees with salary not equal to 55000.
select * from employees where salary != 55000;
-- Question 20 : Display employees with salary in (50000, 60000, 90000).
select * from employees where salary in (50000, 60000, 90000);
-- Question 21 : Show employees whose name has 5 characters.
select * from  employees where name like '_____';
-- Question 22 : Find employees not in department 101.
select * from employees where dept_id not in (101);
-- Question 23 : Show employees with manager_id IS NOT NULL.
select * from employees where manager_id is not null;
-- Question 24 : Find employees whose salary is less than average salary.
select * from employees where salary < (select avg(salary) from employees);
-- Question 25 : Display employees whose name starts with 'R' or 'S'.
select * from employees where name like 'R%' or name like 'S%';