CREATE TABLE Students (
    student_id int PRIMARY KEY,
    name varchar(100),
    class varchar(10)
);

INSERT INTO Students (student_id, name, class)
VALUES
(1, 'Ganga', '11A'),
(2, 'Devika', '11A'),
(3, 'Chotu', '11B');

CREATE TABLE Marks (
    mark_id int PRIMARY KEY,
    student_id int,
    subject varchar(50),
    marks int,
    FOREIGN KEY (student_id) REFERENCES Students(student_id)
);

INSERT INTO Marks (mark_id, student_id, subject, marks)
VALUES
(101, 1, 'Ssos', 85),
(102, 1, 'Oracle', 90),
(103, 2, 'Ssos', 75),
(104, 2, 'Oracle', 80),
(105, 3, 'Ssos', 95),
(106, 3, 'Oracle', 88);

SELECT s.student_id, s.name, s.class, m.subject, m.marks
FROM Students s
JOIN Marks m ON s.student_id = m.student_id;
