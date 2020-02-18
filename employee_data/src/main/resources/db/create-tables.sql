use employee_db;

CREATE TABLE `employee`(
	`employee_id` INT(11) NOT NULL AUTO_INCREMENT,
	`firstname` VARCHAR(45) NOT NULL,
	`lastname` VARCHAR(45)  NOT NULL,
	`date_of_birth` DATE DEFAULT  NULL,
	`email` VARCHAR(45) NOT NULL,
	`Phonenumber` VARCHAR(45) NOT NULL,
	
	PRIMARY KEY(`employee_id`)
	
)ENGINE=InnoDB;
	
	