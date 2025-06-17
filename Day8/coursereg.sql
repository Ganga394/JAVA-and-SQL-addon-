CREATE TABLE Students (
    student_id int PRIMARY KEY,
    name varchar(50),
    email varchar(100) UNIQUE,
    enrollment_year int
);
CREATE TABLE Courses (
    course_id int PRIMARY KEY,
    course_name varchar(100),
);
CREATE TABLE Registrations (
    registration_id int PRIMARY KEY,
    registration_date DATE,
);
INSERT INTO Students VALUES (1, 'Ganga', 'ganga@gmail.com', 2023);
INSERT INTO Students VALUES (2, 'Devika', 'devi@gmail.com', 2023);

INSERT INTO Courses VALUES (01, 'BCA');
INSERT INTO Courses VALUES (02, 'Bsc CT');

INSERT INTO Registrations VALUES (1, '2023-04-05'), 
INSERT INTO Registrations VALUES (2, '2023-05-10');
