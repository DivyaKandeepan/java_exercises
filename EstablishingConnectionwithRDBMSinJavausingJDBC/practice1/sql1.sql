create database salesdata;
use salesdata;

create table sales(salesid int primary key,firstname varchar(14),City varchar(20),Commission decimal(6,2));
insert into sales values(1001,"Peei","London",12);
insert into sales values(1002,"Serres","San Jose",13);
insert into sales values(1004,"Judith","London",11);
insert into sales values(1007,"riflin","Barcelona",15);
insert into sales values(1003,"axelRod","NewWork",10);
insert into sales values(1004,"Fran","London",26);
insert into sales values(1008,"john","London",0);
insert into sales values(1000,"Charles","Florida",null);

CREATE TABLE customers (
  customer_id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  LastName VARCHAR(50) NOT NULL,
  city VARCHAR(50),
  rating INT,
  salesid INT NOT NULL
);

INSERT INTO customers VALUES
  (2001, 'Hoffman', 'Anny', 'London', 100, 1001),
  (2002, 'Giovanni', 'Jenny', 'Rome', 200, 1003),
  (2003, 'Liu', 'Williams', 'SanJose', 100, 1002),
  (2004, 'Grass', 'Harry', 'Berlin', 300, 1002),
  (2005, 'Clemens', 'John', 'London', 200, 1001),
  (2006, 'Cisneros', 'Fanny', 'SanJose', 200, 1007),
  (2007, 'Pereira', 'Jonathan', 'Rome', 300, 1004);

CREATE TABLE orders (
  order_id INT PRIMARY KEY,
  amount DECIMAL(10, 2),
  order_date DATE,
  customer_id INT,
  FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

INSERT INTO orders VALUES
  (3001, 123, STR_TO_DATE('01-03-2020', '%d-%m-%Y'), 2005),
  (3003, 187, STR_TO_DATE('02-10-2020', '%d-%m-%Y'), 2001),
  (3002, 100, STR_TO_DATE('30-07-2000', '%d-%m-%Y'), 2007),
  (3005, 201, STR_TO_DATE('09-10-2011', '%d-%m-%Y'), 2003),
  (3009, 145, STR_TO_DATE('10-10-2012', '%d-%m-%Y'), 2005),
  (3007, 167, STR_TO_DATE('02-04-2020', '%d-%m-%Y'), 2002),
  (3008, 189, STR_TO_DATE('06-03-2020', '%d-%m-%Y'), 2002),
  (3010, 200, STR_TO_DATE('23-02-2012', '%d-%m-%Y'), 2006),
  (3011, 100, STR_TO_DATE('18-09-2000', '%d-%m-%Y'), 2004);



DELETE FROM orders WHERE order_id = 3011;
DELETE FROM salespersons WHERE commission_rate = 0;
UPDATE orders SET amount = amount * 1.2 WHERE amount < 100;
CREATE INDEX idx_ratings ON customers (rating);
UPDATE salespersons SET commission_rate = 28 WHERE commission_rate = 26;
UPDATE customers SET rating = 150 WHERE rating = 100;

/*Exersise 4*/
SELECT * FROM customers WHERE city IS NULL;
SELECT * FROM salespersons WHERE name LIKE 'P__L%';
SELECT * FROM customers WHERE city IN ('San Jose', 'Brazil', 'London');
SELECT * FROM customers WHERE name LIKE 'A%' OR name LIKE 'G%';
SELECT city, MAX(rating) AS highest_rating FROM customers GROUP BY city;
SELECT * FROM salespersons s WHERE s.city IN ('Barcelona', 'London');
SELECT * FROM orders o WHERE o.order_date BETWEEN '2020-10-03' AND '2020-12-04';
SELECT SUM(amount) AS total_purchases FROM orders;
SELECT COUNT(rating) AS non_null_ratings FROM customers WHERE rating IS NOT NULL;


/* Exercise 4A */
SELECT SUM(amount) AS total_purchases FROM orders;
SELECT COUNT(rating) AS non_null_ratings FROM customers WHERE rating IS NOT NULL;
SELECT CONCAT(UPPER(LEFT(name, 1)), LOWER(SUBSTRING(name, 2))) AS full_name FROM customers;
SELECT * FROM customers WHERE rating BETWEEN 200 AND 300;
SELECT * FROM customers ORDER BY name;
SELECT * FROM orders ORDER BY amount DESC;
SELECT AVG(amount) AS average_amount FROM orders;

/* Exercise 4B*/

SELECT city, COUNT(*) AS customer_count FROM customers GROUP BY city;
SELECT city, COUNT(*) AS customer_count FROM customers GROUP BY city ORDER BY city DESC;
SELECT * FROM orders WHERE MONTH(order_date) = 4;
SELECT * FROM orders ORDER BY amount DESC LIMIT 5;
SELECT name, commission_rate FROM salespersons ORDER BY commission_rate DESC LIMIT 1;
SELECT name, commission_rate FROM salespersons ORDER BY commission_rate ASC LIMIT 3;











































