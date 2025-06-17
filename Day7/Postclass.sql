
CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    Name varchar(50),
    DepartmentID int,
    Salary int(10, 2),
);

CREATE TABLE Department (
    DepartmentID int PRIMARY KEY,
    DepartmentName varchar(100) NOT NULL
);

INSERT INTO Department (DepartmentID, DepartmentName) VALUES
(1, 'Web development'),
(2, 'Software development'),
(3, 'Marketing'),
(4, 'Physio');

INSERT INTO Employee (EmployeeID, Name, DepartmentID, Salary) VALUES
(01, 'Ganga', 3, 80000.00),
(02, 'Devika', 1, 75000.00),
(03, 'Chotu', 2, 71000.00),
(04, 'Shasti', 4, 68000.00);
