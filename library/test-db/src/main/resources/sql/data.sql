INSERT INTO lib_book (authors, title, genre)
VALUES ('Тромгар Железноголовый', 'Алдуин есть', 2), ('Венегрус Монона', 'Амулет королей', 1),
('Ффулке', 'Астрология', 3), ('Пелларн Асси', 'Братья тьмы', 13), ('Биография Барензи', 'Стерн Гамбодж', 10);

INSERT INTO lib_reader(first_name, last_name, patronymic, date_of_registry)
VALUES('Септимий', 'Сегоний', 'Александрович', '2020-02-01'), ('Эйла', 'Охотница', 'Ивановна', '2020-01-01'),
('Йордис', 'Баббета', 'Александровна', '2020-02-04'), ('Цицерон', 'Партурнакс', 'Павлович', '2020-01-15');

INSERT INTO lib_book (authors, title, genre, reader_id)
VALUES ('Ульфрик Бервестник', 'Война в скайриме', 2, 1);