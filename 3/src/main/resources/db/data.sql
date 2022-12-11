insert into role (id, name)
values (1, 'EMPLOYEE'),
       (2, 'CUSTOMER'),
       (3, 'ADMIN');
insert into users (id, username, password, tenant_id)
values ('1', 'employee', '{bcrypt}$2a$12$l6aRIhm9qqnEmBQQvWOb8OOaKhlL7pEZjwM5GLC.Qc1WQ1ovhwPGW', 1),
       ('2', 'customer', '{bcrypt}$2a$12$1BOJEhlhicYSKhioUf7zz.WXCv8ItHI821iW9h8ahp3kUdOXB6jMi', 1),
       ('3', 'admin', '{bcrypt}$2a$12$PDm06RVyE.QTeX87xYn/Y.AgWrpaELjsYn36fZV/TdAVxwTSytXaG', 1);
insert into users_authorities
values ('1', 1),
       ('2', 2),
       ('3', 2),
       ('3', 3);
-- insert into AUTHOR (id, isbn, name)
-- values (1, 9781782924142, 'J. K. Rowling'),
--        (2, 9781782924143, 'Suzanne Collins');
-- insert into BOOK (id, isbn, author_id, title, published_at)
-- values (1, 9780439064873, 1, 'Harry Potter and the Chamber of Secrets', CURRENT_DATE),
--        (2, 9780439064874, 1, 'Harry Potter and the Goblet of Fire', CURRENT_DATE),
--        (3, 9780439064875, 1, 'Harry Potter and the Half Blood Prince', '2020-10-25'),
--        (4, 9780439064876, 1, 'Harry Potter and the Deathly Hallows', '2020-10-25'),
--        (5, 9780439064877, 2, 'The Hunger Games', '2020-10-25'),
--        (6, 9780439064878, 2, 'The Hunger Games Catching Fire', '2020-10-25');
-- insert into LIBRARY (id, name)
-- values (1, 'LNB');
-- insert into COPY (id, book_id, library_id, is_taken, is_reserved)
-- values (1, 1, 1, false, false);
-- insert into COPY (id, book_id, library_id, is_taken, is_reserved, taken_by_user_id, due_at)
-- values (2, 5, 1, true, false, 1, CURRENT_DATE);
-- insert into COPY (id, book_id, library_id, is_taken, is_reserved, taken_by_user_id, due_at)
-- values (3, 6, 1, true, false, 1, '2021-12-15');
-- insert into COPY (id, book_id, library_id, is_taken, is_reserved, taken_by_user_id, due_at)
-- values (4, 4, 1, true, true, 1, '2021-12-02');
