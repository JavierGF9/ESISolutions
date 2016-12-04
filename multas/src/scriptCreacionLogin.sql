CREATE TABLE `login` (
	`user` varchar(255),
	`pass` varchar(255) NOT NULL,
	PRIMARY KEY (`user`)
);

INSERT INTO `login` VALUES ("esi", "esi");
