DROP TABLE IF EXISTS exchange_value;

CREATE TABLE exchange_value (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  currency_from VARCHAR(250) NOT NULL,
  currency_to VARCHAR(250) NOT NULL,
  conversion_index FLOAT(10) NOT NULL,
  port INT(32) NOT NULL
);