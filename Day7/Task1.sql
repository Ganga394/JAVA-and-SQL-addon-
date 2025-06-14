CREATE TABLE student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    age INT
);

CREATE TABLE course (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50),
    course_fee DECIMAL(10, 2)
);


INSERT INTO student (student_id, student_name, age) VALUES
(1, 'Ganga', 20),
(2, 'Priyanka', 22),
(3, 'Sowndarya', 19),
(4, 'Chotuu', 21),
(5, 'Devikaa', 23);


INSERT INTO course (course_id, course_name, course_fee) VALUES
(101, 'Web development', 2000.00),
(102, 'Data Science', 1500.00),
(103, 'Data Analyst', 2000.00),
(104, 'Software Development', 1999.00),
(105, 'Full stack', 800.00);


UPDATE course
SET course_fee = 2500.00
WHERE course_name = 'Data Analyst';
