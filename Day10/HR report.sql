CREATE TABLE Employees (
    EmployeeID int PRIMARY KEY,
    Name varchar(50),
    Department varchar(50),
    Salary int(10),
    HireDate DATE
);

INSERT INTO Employees (EmployeeID, Name, Department, Salary, HireDate) VALUES
(1, 'Chotu', 'IT', 70000, '2021-05-10'),
(2, 'Shasti', 'HR', 50000, '2022-01-15'),
(3, 'Ganga', 'IT', 76000, '2020-07-01'),
(4, 'Devika', 'Finance', 65000, '2023-03-20');

SELECT Department,
       COUNT(*),
       AVG(Salary),
       MIN(HireDate) 
FROM Employees
GROUP BY Department;
