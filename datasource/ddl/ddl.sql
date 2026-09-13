-- products.product_details definition

CREATE TABLE `product_details` (
  `id` int NOT NULL,
  `weight` int NOT NULL,
  `feature` varchar(500) DEFAULT NULL,
  `power` varchar(100) DEFAULT NULL,
  `brand` varchar(100) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `video` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_product_detail_offerings` FOREIGN KEY (`id`) REFERENCES `product_offerings` (`id`),
  CONSTRAINT `product_details_chk_1` CHECK ((`weight` >= 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- products.product_offerings definition

CREATE TABLE `product_offerings` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `price` int NOT NULL,
  `color` varchar(255) DEFAULT NULL,
  `status` varchar(20) DEFAULT 'INACTIVE',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7005 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- products.product_offering_details definition

CREATE TABLE `product_offering_details` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `details_id` int NOT NULL,
  `offerings_id` int NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_pod_details` (`details_id`),
  KEY `fk_pod_offerings` (`offerings_id`),
  CONSTRAINT `fk_pod_details` FOREIGN KEY (`details_id`) REFERENCES `product_details` (`id`),
  CONSTRAINT `fk_pod_offerings` FOREIGN KEY (`offerings_id`) REFERENCES `product_offerings` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


