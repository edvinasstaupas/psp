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
INSERT INTO address (city, country, line1, line2, postal_code, region)
VALUES
    ('Vilnius', 'Lithuania', 'Gedimino pr. 1', '',  '00001', 'Vilniaus m. raj.'),
    ('Vilnius', 'Lithuania', 'Gedimino pr. 3', '','00001', 'Vilniaus m. raj.');
INSERT INTO location (name, address_id, tenant_id)
VALUES
    ('Restoranas 1', 1, 1),
    ('Restoranas 2', 2, 1);
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
INSERT INTO time_slot(end_time, start_time, employee_id, location_id, service_id)
VALUES
    ('2022-01-01 20:30:00.000000', '2022-01-01 20:00:00.000000', 1, 1,1),
    ('2022-01-01 21:30:00.000000', '2022-01-01 21:00:00.000000', 2, 1,1);

