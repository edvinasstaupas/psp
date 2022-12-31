insert into role (id, name)
values (1, 'EMPLOYEE'),
       (2, 'CUSTOMER'),
       (3, 'ADMIN');
insert into tenant (id, name)
values (1, 'test_tenant');
insert into users (id, username, password, tenant_id)
values ('1', 'employee', '$2a$12$l6aRIhm9qqnEmBQQvWOb8OOaKhlL7pEZjwM5GLC.Qc1WQ1ovhwPGW', 1),
       ('2', 'customer', '$2a$12$1BOJEhlhicYSKhioUf7zz.WXCv8ItHI821iW9h8ahp3kUdOXB6jMi', 1),
       ('3', 'admin', '$2a$12$PDm06RVyE.QTeX87xYn/Y.AgWrpaELjsYn36fZV/TdAVxwTSytXaG', 1);
-- passwordai yra pirma username raide (employee password yra 'e')
insert into users_roles
values ('1', 1),
       ('2', 2),
       ('3', 2),
       ('3', 3);
INSERT INTO employee (date_deleted, date_hired, user_id)
VALUES
    ('2022-01-01 00:00:00.000000', '2021-01-01 00:00:00.000000', '3'),
    ('2022-02-01 00:00:00.000000', '2021-02-01 00:00:00.000000', '3'),
    ('2022-03-01 00:00:00.000000', '2021-03-01 00:00:00.000000', '3'),
    ('2022-04-01 00:00:00.000000', '2021-04-01 00:00:00.000000', '3'),
    ('2022-05-01 00:00:00.000000', '2021-05-01 00:00:00.000000', '3');
INSERT INTO customer (email, name, password, user_id)
VALUES
    ('test.mail@mail.com', 'test', 'testPass', '2');
INSERT INTO tax_rate (name, rate, tenant_id)
VALUES ('VAT', 0.15, 1),
       ('GST', 0.10, 1),
       ('PST', 0.05, 1),
       ('HST', 0.13, 1);
INSERT INTO service (duration_mins, name, tax_rate, tenant_id)
VALUES (60, 'Haircut', 1, 1),
       (30, 'Manicure', 2, 1),
       (45, 'Massage', 3, 1),
       (60, 'Facial', 4, 1);
INSERT INTO address (city, country, line1, line2, postal_code, region)
VALUES ('New York', 'United States', '123 Main Street', 'Suite 456', '10001', 'NY'),
       ('Los Angeles', 'United States', '456 Broadway', 'Suite 789', '90001', 'CA'),
       ('London', 'United Kingdom', '789 Oxford Street', '', 'W1A 1AA', 'Greater London');

INSERT INTO location (name, address_id, tenant_id)
VALUES ('Warehouse A', 1, 1),
       ('Retail Store B', 2,1),
       ('Office C', 3, 1);

INSERT INTO time_slot(end_time, start_time, employee_id, location_id, service_id)
VALUES
    ('2022-01-01 20:30:00.000000', '2022-01-01 20:00:00.000000', 1, 1,1),
    ('2022-01-01 21:30:00.000000', '2022-01-01 21:00:00.000000', 2, 1,1);
INSERT INTO brand(tenant_id, name)
VALUES
    (1, 'testBrand');
INSERT INTO product(tenant_id, name, is_disabled, brand_id, tax_rate_id)
VALUES
    (1, 'testProduct',false, 1, 1);
insert into cart (customer_id, date_created, last_accessed, id) values (1, '2022-01-01 20:30:00.000000', '2022-01-01 20:30:00.000000', 1);
INSERT INTO orders (tips_amount, total, customer_id, employee_id, tenant_id)
VALUES (5.00, 25.00, 1, 1, 1),
       (10.00, 50.00, 1, 2, 1),
       (3.00, 15.00, 1, 3, 1),
       (7.00, 35.00, 1, 4, 1);
INSERT INTO order_item (discount_rate, name, notes, quantity, tax_rate, total, unit_price, order_id, product_id, service_id)
VALUES (0.00, 'Product 1', '', 1, 0.00, 10.00, 10.00, 1, 1, NULL),
       (0.00, 'Service 2', '', 2, 0.00, 20.00, 10.00, 2, NULL, 2),
       (0.00, 'Service 1', '', 1, 0.00, 100.00, 100.00, 3, NULL, 1),
       (0.00, 'Product 2', '', 3, 0.00, 30.00, 10.00, 4, 1, NULL),
       (0.00, 'Product 3', '', 4, 0.00, 40.00, 10.00, 1, 1, NULL),
       (0.00, 'Service 3', '', 5, 0.00, 500.00, 100.00, 2, NULL, 3),
       (0.00, 'Service 4', '', 6, 0.00, 600.00, 100.00, 3, NULL, 4),
       (0.00, 'Product 4', '', 7, 0.00, 70.00, 10.00, 4, 1, NULL),
       (0.00, 'Product 5', '', 8, 0.00, 80.00, 10.00, 3, 1, NULL),
       (0.00, 'Service 5', '', 9, 0.00, 900.00, 100.00, 1, NULL, 2),
       (0.00, 'Service 6', '', 10, 0.00, 1000.00, 100.00, 2, NULL, 4);
