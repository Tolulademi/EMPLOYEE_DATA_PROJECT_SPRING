CREATE USER 'employee_user'@'localhost' IDENTIFIED BY 'employee123';

GRANT ALL PRIVILEGES ON employee_db.* To 'employee_user'@'localhost';

FLUSH PRIVILEGES;

CREATE  DATABASE employee_db;