CREATE TABLE customers (
    id int PRIMARY KEY AUTOINCREMENT,
    name varchar NOT NULL,
    email varchar
);

INSERT INTO customers (name, email) VALUES
('Ganga', 'ganga@gmail.com'),
('Devika', 'devika@gmail.com'),
('Chotu', 'chotu@gmail.com');

CREATE TABLE products (
    id int PRIMARY KEY AUTOINCREMENT,
    title varchar NOT NULL,
    category varchar
);

INSERT INTO products (title, category) VALUES
('Laptop', 'Electronics'),
('Sofa', 'Furniture'),
('A4sheets', 'Stationery');

CREATE TABLE orders (
    id int PRIMARY KEY AUTOINCREMENT,
    customer_id int,
    product_id int,
    quantity int,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO orders (customer_id, product_id, quantity, order_date) VALUES
(01, 1, 2, '2025-05-11'),
(02, 3, 8, '2025-05-19'),
(03, 2, 6, '2025-05-25');

--multi-table query app with filter
SELECT
    orders.id AS order_id,
    customers.name AS customer_name,
    products.title AS product_title,
    products.category AS product_category,
    orders.quantity,
    orders.order_date
FROM orders
JOIN customers ON orders.customer_id = customers.id
JOIN products ON orders.product_id = products.id
WHERE
    (customers.name LIKE '%Ganga%' OR '%Ganga%' = '%%') 
    AND (products.category = 'Electronics' OR 'Electronics' = '') 
    AND (orders.order_date >= '2025-06-01' OR '2025-06-01' = '') 
    AND (orders.order_date <= '2025-06-30' OR '2025-06-30' = '') 
;
