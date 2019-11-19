CREATE TABLE `jps_tanakh` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `page` int(11) NOT NULL,
  `book_name` varchar(50) NOT NULL,
  `chapter` int(11) NOT NULL,
  `verse_x` int(11) NOT NULL,
  `verse_y` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=871 DEFAULT CHARSET=utf8;


CREATE TABLE `torah_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(50) DEFAULT NULL,
  `eng_book_name` varchar(50) DEFAULT NULL,
  `tran_book_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;
CREATE TABLE `torah_verse` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_id` int(11) NOT NULL,
  `verse` varchar(600) DEFAULT NULL,
  `eng_verse` varchar(600) DEFAULT NULL,
  `tran_verse` varchar(600) DEFAULT NULL,
  `num_chapter` int(11) NOT NULL,
  `num_verse` int(11) NOT NULL,
  `created_by` varchar(45) NOT NULL,
  `created_date` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `modifed_by` varchar(45) DEFAULT NULL,
  `modified_date` timestamp(6) NULL DEFAULT NULL,
  `h_chapter` varchar(45) DEFAULT NULL,
  `h_verse` varchar(45) DEFAULT NULL,
  `num_value` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `torah_verse_ix1` (`num_value`),
  KEY `torah_verse_ix2` (`book_id`,`num_chapter`,`num_verse`),
  CONSTRAINT `torah_verse_fk1` FOREIGN KEY (`book_id`) REFERENCES `torah_book` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66717 DEFAULT CHARSET=utf8;

CREATE TABLE `torah_verse_word` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `verse_id` int(11) NOT NULL,
  `word` varchar(45) DEFAULT NULL,
  `tran_word` varchar(45) DEFAULT NULL,
  `num_value` int(11) DEFAULT NULL,
  `num_index` int(11) DEFAULT NULL,
  `created_by` varchar(45) NOT NULL,
  `created_date` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `modified_by` varchar(45) DEFAULT NULL,
  `modified_date` timestamp(6) NULL DEFAULT NULL,
  `eng_translation` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `torah_verse_word_fk1` (`verse_id`),
  KEY `torah_verse_word_ix1` (`num_value`),
  CONSTRAINT `torah_verse_word_fk1` FOREIGN KEY (`verse_id`) REFERENCES `torah_verse` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=680198 DEFAULT CHARSET=utf8;

