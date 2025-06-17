CREATE TABLE Sales (
    SaleID int PRIMARY KEY,
    ProductID int,
    SaleDate DATE,
    Quantity int,
    TotalAmount int(10)
);

INSERT INTO Sales (SaleID, ProductID, SaleDate, Quantity, TotalAmount) VALUES
(1, 101, '2024-06-01', 2, 400),
(2, 102, '2024-06-01', 1, 150),
(3, 101, '2024-06-02', 3, 600),
(4, 103, '2024-06-02', 2, 300);

SELECT ProductID,
       SUM(Quantity) AS TotalQuantity,
       SUM(TotalAmount) AS TotalSales
FROM Sales
GROUP BY ProductID;

SELECT SaleDate,
       SUM(TotalAmount) AS DailySales
FROM Sales
GROUP BY SaleDate;
