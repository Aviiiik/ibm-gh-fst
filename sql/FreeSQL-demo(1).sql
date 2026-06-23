CREATE TABLE salesman(
    salesman_id INT NOT NULL,
    salesman_name VARCHAR2(20),
    salesman_city VARCHAR2(20),
    commission INT
);

-- Insert rows
INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View original data
SELECT * FROM salesman;

--------------------------------------------------
-- SAVEPOINT 1
SAVEPOINT sp1;

-- Delete one row
DELETE FROM salesman
WHERE salesman_id = 5003;

SELECT * FROM salesman;

--------------------------------------------------
-- SAVEPOINT 2
SAVEPOINT sp2;

-- Delete one row
DELETE FROM salesman
WHERE salesman_id = 5007;

SELECT * FROM salesman;

--------------------------------------------------
-- SAVEPOINT 3
SAVEPOINT sp3;

-- Delete one row
DELETE FROM salesman
WHERE salesman_id = 5006;

SELECT * FROM salesman;

--------------------------------------------------
-- SAVEPOINT 4
SAVEPOINT sp4;

-- Delete one row
DELETE FROM salesman
WHERE salesman_id = 5005;


SELECT * FROM salesman;


ROLLBACK TO sp3;
SELECT * FROM salesman;

ROLLBACK TO sp2;
SELECT * FROM salesman;

ROLLBACK TO sp1;
SELECT * FROM salesman;


COMMIT;