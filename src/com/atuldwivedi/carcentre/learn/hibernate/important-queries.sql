/*
 * JM3001_CAR - starts
 */

DROP TABLE IF EXISTS JM3001_CAR;
CREATE TABLE JM3001_CAR 
  ( 
     MODEL_NUMBER NUMBER(6) PRIMARY KEY, 
     NAME         VARCHAR(20), 
     COLOR        VARCHAR(10) 
  );
/*
 * JM3001_CAR - ends
 */
  
  
/*
 * JM3001_CAR_IDENTITY - starts
 */

DROP TABLE IF EXISTS JM3001_CAR_IDENTITY;
CREATE TABLE JM3001_CAR_IDENTITY 
  ( 
     MODEL_NUMBER BIGINT(6) AUTO_INCREMENT PRIMARY KEY, 
     NAME         VARCHAR(20), 
     COLOR        VARCHAR(10) 
  );
 
ALTER TABLE JM3001_CAR_IDENTITY ALTER COLUMN MODEL_NUMBER RESTART WITH 1004; 
/*
 * JM3001_CAR_IDENTITY - ends
 */


/*
 * JM3001_CAR_SEQUENCE - starts
 */
DROP TABLE IF EXISTS JM3001_CAR_SEQUENCE;
CREATE TABLE JM3001_CAR_SEQUENCE 
  ( 
     MODEL_NUMBER BIGINT(6) PRIMARY KEY, 
     NAME         VARCHAR(20), 
     COLOR        VARCHAR(10) 
  );
CREATE SEQUENCE SEQ_MODEL_NUMBER;
ALTER SEQUENCE SEQ_MODEL_NUMBER RESTART WITH 2;
/*
 * JM3001_CAR_SEQUENCE - ends
 */