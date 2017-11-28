DROP TABLE IF EXISTS CAR;
CREATE TABLE CAR(
	CHESIS_NUMBER BIGINT AUTO_INCREMENT PRIMARY KEY,
	MODEL VARCHAR(10),
	COLOR VARCHAR(10),
	MILEAGE DECIMAL,
	MAX_SPEED NUMBER(3)
);

DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER(
	CUSTOMER_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	FIRST_NAME VARCHAR(20),
	LAST_NAME VARCHAR(25),
	AGE NUMBER(3),
	GENDER VARCHAR(10),
	ADDRESS VARCHAR(100),
	OCCUPATION VARCHAR(20)

);


DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE EMPLOYEE(
	EMP_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	EMP_NAME VARCHAR(30),
	EMP_EMAIL VARCHAR(30),
	EMP_PHONE NUMBER(12),

);

