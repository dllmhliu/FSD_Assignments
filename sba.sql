
CREATE DATABASE IF NOT EXISTS `sba`
USE `sba`;

CREATE TABLE IF NOT EXISTS `t_mentor_calendar` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `mentor_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `mentor_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `training_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE IF NOT EXISTS `t_mentor_skill` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `skill_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `skill_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `mentor_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `mentor_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE IF NOT EXISTS `t_payment` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `training_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `skill_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `skill_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `mentor_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `mentor_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `amount` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE IF NOT EXISTS `t_technology` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `skill_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE IF NOT EXISTS `t_training` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `skill_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `skill_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `mentor_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `mentor_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `fees` decimal(10,0) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `status` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `progress` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE IF NOT EXISTS `t_user` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `pwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `role` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `experience` int(11) DEFAULT NULL,
  `amount` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE IF NOT EXISTS `t_user_training` (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `user_id` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `user_name` varchar(50) COLLATE utf8mb4_bin NOT NULL,
  `mentor_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `mentor_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `training_id` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `status` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
