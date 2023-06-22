create database SalesRep;
use SalesRep;
CREATE TABLE SalesRep (
  Rep_ID INT PRIMARY KEY,
  Name VARCHAR(50),
  City VARCHAR(50),
  Commission DOUBLE
);

CREATE TABLE Consumer (
  Consumer_ID INT PRIMARY KEY,
  Consumer_Name VARCHAR(50),
  City VARCHAR(50),
  Grade VARCHAR(50),
  Rep_ID INT,
  FOREIGN KEY (Rep_ID) REFERENCES SalesRep (Rep_ID)
);

CREATE TABLE Invoice (
  Invoice_ID INT PRIMARY KEY,
  Invoice_amount DOUBLE,
  Invoice_Date DATE,
  Consumer_ID INT,
  Rep_ID INT,
  FOREIGN KEY (Consumer_ID) REFERENCES Consumer (Consumer_ID),
  FOREIGN KEY (Rep_ID) REFERENCES SalesRep (Rep_ID)
);

INSERT INTO SalesRep (Rep_ID, Name, City, Commission)
VALUES (1001, 'John Doe', 'Bangalore', 0.15),
       (1002, 'Jane Smith', 'Kolkata', 0.12),
       (1003, 'David Johnson', 'Mumbai', 0.10);
INSERT INTO Consumer (Consumer_ID, Consumer_Name, City, Grade, Rep_ID)
VALUES (2001, 'ABC Corporation', 'Bangalore', 'A', 1001),
       (2002, 'XYZ Industries', 'Kolkata', 'B', 1002),
       (2003, 'PQR Enterprises', 'Chennai', 'C', 1003);
INSERT INTO Invoice (Invoice_ID, Invoice_amount, Invoice_Date, Consumer_ID, Rep_ID)
VALUES (3001, 5000.00, '2023-05-01', 2001, 1001),
       (3002, 7000.00, '2023-05-05', 2002, 1002),
       (3003, 3000.00, '2023-05-10', 2003, 1003);

SELECT Consumer_ID, Consumer_Name, City, Grade, Rep_ID
FROM Consumer
WHERE City IN ('Bangalore', 'Kolkata');

SELECT Invoice_ID, Invoice_Date, Consumer_ID, Rep_ID, Invoice_amount
FROM Invoice
WHERE Invoice_amount > 5000;

SELECT Rep_ID, Name, City, Commission
FROM SalesRep
WHERE City LIKE '%T';

SELECT Name, City, Commission
FROM SalesRep;

SELECT Invoice_Date, Rep_ID, Invoice_ID, Invoice_amount
FROM Invoice;

SELECT Consumer_ID, Consumer_Name, City, Grade
FROM Consumer
ORDER BY Consumer_Name ASC;






                     deallocate prepare		Q			Q						