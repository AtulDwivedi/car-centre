DROP SCHEMA IF EXISTS JM3001_ONETOONE_BI;

CREATE SCHEMA JM3001_ONETOONE_BI;

CREATE TABLE JM3001_ONETOONE_BI.CAR(
	ID BIGINT AUTO_INCREMENT,
	NAME VARCHAR(10),
	PRIMARY KEY(ID),
);

CREATE TABLE JM3001_ONETOONE_BI.CAR_DETAIL(
	ID BIGINT AUTO_INCREMENT,
	COLOR VARCHAR(10),
	MILEAGE DECIMAL,
	ABS BOOLEAN,
	CAR_ID BIGINT,
	PRIMARY KEY(ID)
);

ALTER TABLE JM3001_ONETOONE_BI.CAR_DETAIL
ADD CONSTRAINT FK_CAR_DETAIL_CAR_ID
FOREIGN KEY (CAR_ID) REFERENCES JM3001_ONETOONE_BI.CAR;