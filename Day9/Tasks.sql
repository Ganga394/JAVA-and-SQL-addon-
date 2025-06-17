CREATE TABLE Students (
    StudentID int PRIMARY KEY,
    StudentName varchar(100),
    Marks int
);
CREATE TABLE Courses (
    CourseID int PRIMARY KEY,
    CourseName varchar(100),
    Fees int(10)
);
CREATE TABLE Books (
    BookID int PRIMARY KEY,
    Title varchar(200),
    Author varchar(100)
);
INSERT INTO Students (StudentID, StudentName, Marks) VALUES
(1, 'Ganga', 85),
(2, 'Devika', 78),
(3, 'Chotu', 90),
(4, 'Shasti', 82);

INSERT INTO Courses (CourseID, CourseName, Fees) VALUES
(1, 'Maths', 500),
(2, 'Economics', 450),
(3, 'Computer', 600);

INSERT INTO Books (BookID, Title, Author) VALUES
(1, 'Introduction to Science', 'John Smith'),
(2, 'Advanced Mathematics', 'Jane Doe'),
(3, 'Science Experiments', 'Albert Newton'),
(4, 'Literature Basics', 'Emily Bronte');

SELECT * FROM Students
WHERE Marks > 80;

SELECT * FROM Courses
ORDER BY Fees ASC;

SELECT * FROM Books
WHERE Title LIKE '%Science%';
