USE products;

DELIMITER $$

CREATE PROCEDURE products.generate_product_offerings()
BEGIN
    DECLARE i INT DEFAULT 1;

    WHILE i <= 1000 DO
        INSERT INTO product_offerings (name, price, color)
        VALUES (
            CONCAT('Product ', LPAD(i, 4, '0')),
            FLOOR(100 + RAND() * 9901),
            ELT(
                FLOOR(1 + RAND() * 10),
                'Red',
                'Blue',
                'Green',
                'Black',
                'White',
                'Yellow',
                'Purple',
                'Orange',
                'Gray',
                'Pink'
            )
        );

        SET i = i + 1;
    END WHILE;
END$$;

DELIMITER ;

CALL products.generate_product_offerings;

DROP PROCEDURE IF EXISTS products.generate_product_offerings;

SELECT VERSION();

SHOW PROCEDURE STATUS
WHERE Db = 'products';

DELIMITER $$

CREATE PROCEDURE products.delete_product_offerings()
BEGIN
    DELETE FROM product_offerings;
END$$

DELIMITER ;

DROP PROCEDURE IF EXISTS products.delete_product_offerings;

-- random create product_details table:

create table product_details


CREATE TABLE product_offering_details (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    details_id INT NOT NULL,
    offerings_id INT NOT NULL,
    description VARCHAR(500),

    CONSTRAINT fk_pod_details
        FOREIGN KEY (details_id)
        REFERENCES product_details(id),

    CONSTRAINT fk_pod_offerings
        FOREIGN KEY (offerings_id)
        REFERENCES product_offerings(id)
);


DELIMITER $$

CREATE PROCEDURE generate_product_offering_details()
BEGIN
    DECLARE i INT DEFAULT 1;

    WHILE i <= 100 DO

        INSERT INTO product_offering_details
            (details_id, offerings_id, description)
        VALUES
        (
            FLOOR(6000 + RAND() * 11),      -- 6000 to 6010
            FLOOR(6000 + RAND() * 101),     -- 6000 to 6100
            CONCAT(
                'Product offering detail ',
                i
            )
        );

        SET i = i + 1;
    END WHILE;
END$$

DELIMITER ;


DELETE FROM product_offering_details;

CALL generate_product_offering_details();


SELECT
    MIN(details_id),
    MAX(details_id),
    MIN(offerings_id),
    MAX(offerings_id)
FROM product_offering_details;

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6000, 6000, 'Product detail 6000 for offering 6000');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6000, 6001, 'Product detail 6000 for offering 6001');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6001, 6002, 'Product detail 6001 for offering 6002');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6001, 6003, 'Product detail 6001 for offering 6003');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6002, 6004, 'Product detail 6002 for offering 6004');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6002, 6005, 'Product detail 6002 for offering 6005');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6003, 6006, 'Product detail 6003 for offering 6006');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6003, 6007, 'Product detail 6003 for offering 6007');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6004, 6008, 'Product detail 6004 for offering 6008');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6004, 6009, 'Product detail 6004 for offering 6009');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6005, 6010, 'Product detail 6005 for offering 6010');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6005, 6011, 'Product detail 6005 for offering 6011');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6006, 6012, 'Product detail 6006 for offering 6012');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6006, 6013, 'Product detail 6006 for offering 6013');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6007, 6014, 'Product detail 6007 for offering 6014');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6007, 6015, 'Product detail 6007 for offering 6015');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6008, 6016, 'Product detail 6008 for offering 6016');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6008, 6017, 'Product detail 6008 for offering 6017');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6009, 6018, 'Product detail 6009 for offering 6018');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6009, 6019, 'Product detail 6009 for offering 6019');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6010, 6020, 'Product detail 6010 for offering 6020');

INSERT INTO product_offering_details
    (details_id, offerings_id, description)
VALUES
(6010, 6021, 'Product detail 6010 for offering 6021');