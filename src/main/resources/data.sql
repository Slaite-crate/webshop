INSERT INTO company (name)
VALUES
('Black Stone'),
('KEA');

INSERT INTO category(name)
VALUES
('Viskende vare'),
('Ikke så viskende vare'),
('Shhhh'),
('Stille');

INSERT INTO product(description,name,price,company_id)
VALUES
('Coloured plaster','KC12 Beige Berry',200.95,1),
('Coloured plaster','KC14 Warm Teracotta',200.95,1),
('Coloured plaster','KC15 Dark Plum',200.95,1);

INSERT INTO PRODUCT_CATEGORY (product_id, category_id)
VALUES
(1,1),
(1,2),
(1,4),
(2,1),
(2,3);

INSERT INTO company_description (description, product_id)
VALUES
('KC12 is the first Nordic coloured plaster with a specially developed Topcoat', 1),
('It creates tactile and beautiful walls, which can be maintained and cared for just like a regular painted wall Shine 10.', 2),
('One set consists of 10L KC15 filler + 1L Topcoat. ​',3);
UPDATE product SET company_description_id = 1 WHERE id = 1;
UPDATE product SET company_description_id = 2 WHERE id = 2;
UPDATE product SET company_description_id = 3 WHERE id = 3;
