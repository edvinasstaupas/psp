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
insert into bundle (id, name, price, tenant_id)
values (1, 'Bundle 1', 10, 1),
       (2, 'Bundle 2', 20, 1);
insert into brand (id, name, tenant_id)
values (1, 'Brand 1', 1),
       (2, 'Brand 2', 1);
insert into tax_rate (id, name, rate, tenant_id)
values (1, 'Tax rate 1', 0.21, 1),
       (2, 'Tax rate 2', 0.21, 1);
insert into product (id, name, price, is_disabled, brand_id, tax_rate_id, tenant_id)
values (1, 'Product 1', 1, false, 1, 1, 1),
       (2, 'Product 2', 2, false, 2, 1, 1);
insert into bundle_product (bundle_id, product_id)
values (1, 1),
       (1, 2),
       (2, 1);