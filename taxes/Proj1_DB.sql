create SCHEMA `taxes`;

CREATE TABLE `taxes`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(32) NOT NULL,
  `last_name` VARCHAR(32) not NULL,
  `employee_id` varchar(32) Not null,
  `Administrator` bit not null,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `employee_id_UNIQUE` (`employee_id` ASC) VISIBLE);
  
  CREATE TABLE `taxes`.`employment_sector` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `employment_sector` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `employment_sector_UNIQUE` (`employment_sector` ASC) VISIBLE);
  
  CREATE TABLE `taxes`.`filing_status` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `filing_status` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `filing_status_UNIQUE` (`filing_status` ASC) VISIBLE);
  
  INSERT INTO filing_status(filing_status) VALUES('Single'), ('Married filing Jointly'), ('Married filing Separately'), ('Head of HouseHold'), ('Qualifying Surviving Spouse');
  INSERT INTO employment_sector(employment_sector) VALUES('Healthcare'), ('Information Technology'), ('Education'), ('Manufacturing'), ('Construction'), ('Engineering'), ('Finance'),
  ('Retail'),('Real Estate'),('Government'),('Transportation and Logistics'),('Tourism and Hospitality'),('Arts and Design'),('Business  and Management'),('Community and Social Services'),
  ('Energy and Utilities'),('Environment and Agriculture'),('Charity and Volunteering');
  
  CREATE TABLE `taxes`.`client` (
   `first_name` VARCHAR(32) NOT NULL,
   `middle_name` VARCHAR(32) NOT NULL,
   `last_name` VARCHAR(32) not NULL,
   `social_security_number` int NOT NULL,
   `date_of_birth` Date Not null,
   `street_address` VARCHAR(64) NOT NULL,
   `city` VARCHAR(32) NOT NULL,
   `state` VARCHAR(32) NOT NULL,
   `adjusted_gross_income` int NOT NULL,
   `withheld income tax` int NOT NULL,
   `tax_return` int NOT NULL,
   `employee_id1` int not null,
   `employment_sect` int not null,
   `filing_stat` int not null,
   PRIMARY KEY (`social_security_number`),
   UNIQUE INDEX `social_security_number_UNIQUE` (`social_security_number` ASC) VISIBLE,
   CONSTRAINT `employye_id2`
     FOREIGN KEY (`employee_id1`)
     REFERENCES `taxes`.`employee_id` (`id`)
     ON DELETE CASCADE
     ON UPDATE CASCADE,
   CONSTRAINT `employment_sect1`
    FOREIGN KEY (`employment_sec`)
    REFERENCES `taxes`.`employment_sector` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `filing_stat1`
    FOREIGN KEY (`filing_stat`)
    REFERENCES `taxes`.`filing_status` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
  