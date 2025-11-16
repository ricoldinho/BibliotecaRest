-- Insertar autores primero
INSERT INTO autores (nombre, apellido1, apellido2, nacionalidad) VALUES 
('Miguel', 'de Cervantes', NULL, 'española'),
('Gabriel', 'García Márquez', NULL, 'colombiana'),
('George', 'Orwell', NULL, 'británica'),
('Aldous', 'Huxley', NULL, 'británica'),
('Jane', 'Austen', NULL, 'británica'),
('Harper', 'Lee', NULL, 'estadounidense'),
('F. Scott', 'Fitzgerald', NULL, 'estadounidense'),
('Herman', 'Melville', NULL, 'estadounidense'),
('León', 'Tolstói', NULL, 'rusa'),
('Fyodor', 'Dostoevsky', NULL, 'rusa'),
('Homero', 'Epicus', NULL, 'griega'),
('William', 'Shakespeare', NULL, 'británica'),
('Antoine', 'de Saint-Exupéry', NULL, 'francesa'),
('Vladimir', 'Nabokov', NULL, 'rusa'),
('James', 'Joyce', NULL, 'irlandesa'),
('Marcel', 'Proust', NULL, 'francesa'),
('Albert', 'Camus', NULL, 'francesa'),
('Franz', 'Kafka', NULL, 'checa'),
('John', 'Steinbeck', NULL, 'estadounidense'),
('J.D.', 'Salinger', NULL, 'estadounidense'),
('J.R.R.', 'Tolkien', NULL, 'británica'),
('Frank', 'Herbert', NULL, 'estadounidense'),
('Isaac', 'Asimov', NULL, 'rusa-estadounidense'),
('George R.R.', 'Martin', NULL, 'estadounidense'),
('J.K.', 'Rowling', NULL, 'británica'),
('Patrick', 'Rothfuss', NULL, 'estadounidense'),
('Ray', 'Bradbury', NULL, 'estadounidense'),
('Philip K.', 'Dick', NULL, 'estadounidense'),
('William', 'Gibson', NULL, 'estadounidense'),
('Robert', 'Jordan', NULL, 'estadounidense'),
('Dan', 'Simmons', NULL, 'estadounidense'),
('Terry', 'Pratchett', NULL, 'británica'),
('Ursula K.', 'Le Guin', NULL, 'estadounidense'),
('Arthur C.', 'Clarke', NULL, 'británica'),
('Mary', 'Shelley', NULL, 'británica'),
('Bram', 'Stoker', NULL, 'irlandesa'),
('Juan Gómez', 'Jurado', NULL, 'española'),
('Carlos Ruiz', 'Zafón', NULL, 'española'),
('Dan', 'Brown', NULL, 'estadounidense'),
('Yuval Noah', 'Harari', NULL, 'israelí'),
('James', 'Clear', NULL, 'estadounidense'),
('Gillian', 'Flynn', NULL, 'estadounidense'),
('Paula', 'Hawkins', NULL, 'británica'),
('Ken', 'Follett', NULL, 'británica'),
('Fernando', 'Aramburu', NULL, 'española'),
('Paulo', 'Coelho', NULL, 'portuguesa'),
('Khaled', 'Hosseini', NULL, 'afgana'),
('Ildefonso', 'Falcones', NULL, 'española'),
('María', 'Dueñas', NULL, 'española'),
('Delia', 'Owens', NULL, 'estadounidense'),
('Stieg', 'Larsson', NULL, 'sueca'),
('Mark', 'Manson', NULL, 'estadounidense'),
('Neil', 'Gaiman', NULL, 'británica'),
('Cormac', 'McCarthy', NULL, 'estadounidense'),
('Ian', 'McEwan', NULL, 'británica'),
('Yann', 'Martel', NULL, 'canadiense'),
('Andy', 'Weir', NULL, 'estadounidense'),
('Celeste', 'Ng', NULL, 'estadounidense'),
('Alex', 'Michaelides', NULL, 'británica-chipriota'),
('Sally', 'Rooney', NULL, 'irlandesa'),
('Kazuo', 'Ishiguro', NULL, 'británica'),
('Bonnie', 'Garmus', NULL, 'estadounidense'),
('Matt', 'Haig', NULL, 'británica'),
('Madeline', 'Miller', NULL, 'estadounidense'),
('Julio', 'Cortázar', NULL, 'argentina'),
('Jorge Luis', 'Borges', NULL, 'argentina'),
('Juan', 'Rulfo', NULL, 'mexicana'),
('Isabel', 'Allende', NULL, 'chilena'),
('Gustave', 'Flaubert', NULL, 'francesa'),
('Charles', 'Dickens', NULL, 'británica'),
('Emily', 'Brontë', NULL, 'británica'),
('Charlotte', 'Brontë', NULL, 'británica'),
('Joseph', 'Conrad', NULL, 'polaca'),
('Ernest', 'Hemingway', NULL, 'estadounidense'),
('Jack', 'Kerouac', NULL, 'estadounidense'),
('Kurt', 'Vonnegut', NULL, 'estadounidense'),
('William', 'Faulkner', NULL, 'estadounidense'),
('Richard', 'Dawkins', NULL, 'británica'),
('Stephen', 'Hawking', NULL, 'británica'),
('Daniel', 'Kahneman', NULL, 'israelí'),
('Viktor', 'Frankl', NULL, 'austriaca'),
('Carl', 'Sagan', NULL, 'estadounidense'),
('Jordan B.', 'Peterson', NULL, 'canadiense'),
('Eckhart', 'Tolle', NULL, 'canadiense'),
('Jared', 'Diamond', NULL, 'estadounidense'),
('Nassim Nicholas', 'Taleb', NULL, 'libanesa'),
('manuel', 'rivas', NULL, 'española'),
('fernando', 'trujillo', NULL, 'española');

-- Insertar libros sin la columna autor (ahora solo con autores_id)
INSERT INTO libros (titulo, isbn, precio, moneda, editorial, fecha_lanzamiento) VALUES
('Don Quijote de la Mancha', '9788420412146', 24.95, 'EUR', 'Alfaguara', '1605-01-16'),
('Cien Años de Soledad', '9780307474728', 21.50, 'EUR', 'Sudamericana', '1967-05-30'),
('1984', '9780451524935', 15.99, 'USD', 'Signet Classics', '1949-06-08'),
('Un mundo feliz', '9780060850524', 14.50, 'USD', 'Harper Perennial', '1932-01-01'),
('Orgullo y Prejuicio', '9780141439518', 12.99, 'EUR', 'Penguin Clásicos', '1813-01-28'),
('Matar un ruiseñor', '9780061120084', 16.99, 'USD', 'HarperCollins', '1960-07-11'),
('El Gran Gatsby', '9780743273565', 14.00, 'USD', 'Scribner', '1925-04-10'),
('Moby Dick', '9780142437247', 18.50, 'USD', 'Penguin Classics', '1851-10-18'),
('Guerra y Paz', '9780140447934', 29.99, 'EUR', 'Penguin Classics', '1869-01-01'),
('Crimen y Castigo', '9780140449136', 17.90, 'EUR', 'Penguin Classics', '1866-01-01'),
('La Odisea', '9780140268867', 15.00, 'EUR', 'Penguin Clásicos', '1800-01-01'),
('Hamlet', '9780743477123', 9.99, 'USD', 'Simon & Schuster', '1603-01-01'),
('El Principito', '9780156012195', 13.50, 'EUR', 'Salamandra', '1943-04-01'),
('Lolita', '9780679723165', 16.00, 'USD', 'Vintage', '1955-09-15'),
('Ulises', '9780679722762', 22.00, 'USD', 'Vintage', '1922-02-02'),
('En Busca del Tiempo Perdido', '9780142437964', 35.00, 'EUR', 'Penguin Classics', '1913-01-01'),
('El Extranjero', '9780679720218', 14.99, 'USD', 'Vintage', '1942-01-01'),
('El Proceso', '9780805210400', 15.50, 'EUR', 'Schocken', '1925-01-01'),
('Las uvas de la ira', '9780143039433', 17.00, 'USD', 'Penguin Classics', '1939-04-14'),
('El guardián entre el centeno', '9780316769488', 13.99, 'USD', 'Little, Brown', '1951-07-16'),
('El Señor de los Anillos: La Comunidad del Anillo', '9780618640157', 22.99, 'EUR', 'Minotauro', '1954-07-29'),
('El Hobbit', '9780618260300', 18.99, 'EUR', 'Minotauro', '1937-09-21'),
('Dune', '9780441172719', 19.95, 'USD', 'Ace Books', '1965-08-01'),
('Fundación', '9780553293357', 16.50, 'USD', 'Bantam Spectra', '1951-01-01'),
('Juego de Tronos', '9780553588484', 24.00, 'EUR', 'Gigamesh', '1996-08-01'),
('Harry Potter y la piedra filosofal', '9788478884452', 20.00, 'EUR', 'Salamandra', '1997-06-26'),
('El nombre del viento', '9788401337206', 23.50, 'EUR', 'Plaza & Janés', '2007-03-27'),
('Crónicas Marcianas', '9780743277563', 15.00, 'USD', 'Simon & Schuster', '1950-05-04'),
('¿Sueñan los androides con ovejas eléctricas?', '9780345404473', 14.99, 'USD', 'Del Rey', '1968-01-01'),
('Neuromante', '9780441569595', 16.99, 'USD', 'Ace Books', '1984-07-01'),
('El fin de la eternidad', '9780553293358', 18.20, 'EUR', 'Debolsillo', '1955-01-01'),
('Fahrenheit 451', '9781451673319', 14.99, 'USD', 'Simon & Schuster', '1953-10-19'),
('El Silmarillion', '9780618391110', 20.50, 'EUR', 'Minotauro', '1977-09-15'),
('La Rueda del Tiempo: El Ojo del Mundo', '9780812511819', 25.99, 'EUR', 'Timun Mas', '1990-01-15'),
('Hyperion', '9780553283686', 17.80, 'USD', 'Bantam Spectra', '1989-05-26'),
('El color de la magia', '9780062225672', 13.99, 'EUR', 'Debolsillo', '1983-11-24'),
('La mano izquierda de la oscuridad', '9780441478125', 16.00, 'USD', 'Ace Books', '1969-03-01'),
('2001: Una odisea espacial', '9780451457998', 15.50, 'USD', 'Roc', '1968-04-01'),
('Frankenstein', '9780486282114', 10.99, 'EUR', 'Dover Thrift', '1818-01-01'),
('Drácula', '9780486411095', 11.99, 'EUR', 'Dover Thrift', '1897-05-26'),
('Reina Roja', '9788466664417', 21.90, 'EUR', 'Ediciones B', '2018-11-08'),
('La Sombra del Viento', '9780143126393', 19.95, 'EUR', 'Planeta', '2001-01-01'),
('El Código Da Vinci', '9780307474278', 18.00, 'USD', 'Anchor', '2003-03-18'),
('Sapiens: De animales a dioses', '9780062316097', 25.99, 'USD', 'Harper', '2015-02-10'),
('Hábitos Atómicos', '9780735211292', 24.00, 'USD', 'Avery', '2018-10-16'),
('Perdida (Gone Girl)', '9780307588371', 17.00, 'USD', 'Crown', '2012-06-05'),
('La chica del tren', '9781594634024', 16.99, 'EUR', 'Planeta', '2015-01-13'),
('Los pilares de la Tierra', '9780451419575', 28.00, 'EUR', 'Plaza & Janés', '1989-01-01'),
('Patria', '9788490663196', 22.90, 'EUR', 'Tusquets', '2016-09-06'),
('El Alquimista', '9780061122415', 14.99, 'EUR', 'Planeta', '1988-01-01'),
('Cometas en el cielo', '9781594631931', 16.00, 'USD', 'Riverhead Books', '2003-05-29'),
('La catedral del mar', '9788499088031', 23.45, 'EUR', 'Grijalbo', '2006-03-01'),
('El tiempo entre costuras', '9788499980753', 21.80, 'EUR', 'Temas de Hoy', '2009-06-09'),
('Donde cantan los cangrejos', '9780735219090', 18.00, 'USD', 'G.P. Putnam''s Sons', '2018-08-14'),
('Los hombres que no amaban a las mujeres', '9780307454553', 17.50, 'EUR', 'Destino', '2005-08-01'),
('El sutil arte de que (casi) todo te importe una mi*rda', '9780062457714', 19.99, 'USD', 'Harper', '2016-09-13'),
('American Gods', '9780380789030', 16.99, 'USD', 'HarperTorch', '2001-06-19'),
('La carretera', '9780307387899', 15.00, 'USD', 'Vintage', '2006-09-26'),
('Expiación', '9780307387158', 16.00, 'USD', 'Anchor', '2001-01-01'),
('La vida de Pi', '9780156027328', 15.50, 'USD', 'Mariner Books', '2001-09-11'),
('El marciano', '9780553418026', 15.99, 'USD', 'Crown', '2014-02-11'),
('Todo lo que no te conté', '9781594206037', 16.50, 'USD', 'Penguin Press', '2014-06-26'),
('La paciente silenciosa', '9781250301697', 20.99, 'EUR', 'Alfaguara', '2019-02-05'),
('Gente normal', '9781984822178', 17.00, 'USD', 'Hogarth', '2019-04-16'),
('El Proyecto Hail Mary', '9780593135204', 22.50, 'USD', 'Ballantine Books', '2021-05-04'),
('Klara y el Sol', '9780593318171', 21.00, 'EUR', 'Anagrama', '2021-03-02'),
('Lecciones de química', '9780385547345', 23.00, 'EUR', 'Planeta', '2022-04-05'),
('La biblioteca de la medianoche', '9780525559474', 19.99, 'USD', 'Viking', '2020-09-29'),
('Circe', '9780316556347', 17.99, 'USD', 'Little, Brown', '2018-04-10'),
('Rayuela', '9788420420325', 20.50, 'EUR', 'Alfaguara', '1963-06-28'),
('Ficciones', '9780802130303', 14.00, 'EUR', 'Alianza', '1944-01-01'),
('Pedro Páramo', '9788437604183', 12.50, 'EUR', 'Cátedra', '1955-01-01'),
('La casa de los espíritus', '9780553383804', 18.00, 'EUR', 'Plaza & Janés', '1982-01-01'),
('Anna Karenina', '9780143035008', 19.00, 'EUR', 'Penguin Classics', '1877-01-01'),
('Madame Bovary', '9780140449129', 14.50, 'EUR', 'Penguin Classics', '1856-01-01'),
('Los hermanos Karamazov', '9780140449242', 21.00, 'EUR', 'Penguin Classics', '1880-01-01'),
('Grandes Esperanzas', '9780141439563', 15.00, 'EUR', 'Penguin Clásicos', '1861-01-01'),
('Cumbres Borrascosas', '9780141439556', 13.90, 'EUR', 'Penguin Clásicos', '1847-12-01'),
('Jane Eyre', '9780141441146', 14.20, 'EUR', 'Penguin Clásicos', '1847-10-16'),
('El corazón de las tinieblas', '9780141441672', 11.99, 'USD', 'Penguin Classics', '1899-01-01'),
('Por quién doblan las campanas', '9780684803357', 17.99, 'USD', 'Scribner', '1940-10-21'),
('Al este del Edén', '9780140186390', 18.50, 'USD', 'Penguin Classics', '1952-09-01'),
('En el camino', '9780140283297', 16.00, 'USD', 'Penguin Classics', '1957-09-05'),
('Matadero cinco', '9780385333849', 15.00, 'USD', 'Dial Press', '1969-03-31'),
('El ruido y la furia', '9780679732242', 15.50, 'USD', 'Vintage', '1929-10-07'),
('Meridiano de sangre', '9780679728757', 16.99, 'USD', 'Vintage', '1985-04-01'),
('El gen egoísta', '9780199291151', 19.99, 'USD', 'Oxford University Press', '1976-01-01'),
('Breve historia del tiempo', '9780553380163', 18.99, 'USD', 'Bantam', '1988-04-01'),
('Pensar rápido, pensar despacio', '9780374533557', 20.00, 'USD', 'Farrar, Straus and Giroux', '2011-10-25'),
('El hombre en busca de sentido', '9780807014271', 14.50, 'EUR', 'Herder', '1946-01-01'),
('Cosmos', '9780345539434', 25.00, 'USD', 'Ballantine Books', '1980-01-01'),
('12 Reglas para Vivir', '9780345816023', 22.00, 'EUR', 'Planeta', '2018-01-16'),
('Homo Deus: Breve historia del mañana', '9780062464316', 24.99, 'USD', 'Harper', '2017-02-21'),
('El poder del ahora', '9781577314806', 16.00, 'USD', 'New World Library', '1997-01-01'),
('Armas, gérmenes y acero', '9780393317558', 19.99, 'USD', 'W. W. Norton', '1997-01-01'),
('El cisne negro', '9780812973815', 18.50, 'USD', 'Random House', '2007-04-17');

-- Crear relaciones muchos-a-muchos entre libros y autores
-- Asignamos los autores a los libros según el orden de inserción
INSERT INTO libro_autores (libro_id, autor_id) VALUES
-- Don Quijote -> Miguel de Cervantes
(1, 1),
-- Cien Años de Soledad -> Gabriel García Márquez
(2, 2),
-- 1984 -> George Orwell
(3, 3),
-- Un mundo feliz -> Aldous Huxley
(4, 4),
-- Orgullo y Prejuicio -> Jane Austen
(5, 5),
-- Matar un ruiseñor -> Harper Lee
(6, 6),
-- El Gran Gatsby -> F. Scott Fitzgerald
(7, 7),
-- Moby Dick -> Herman Melville
(8, 8),
-- Guerra y Paz -> León Tolstói
(9, 9),
-- Crimen y Castigo -> Fyodor Dostoevsky
(10, 10),
-- La Odisea -> Homero
(11, 11),
-- Hamlet -> William Shakespeare
(12, 12),
-- El Principito -> Antoine de Saint-Exupéry
(13, 13),
-- Lolita -> Vladimir Nabokov
(14, 14),
-- Ulises -> James Joyce
(15, 15),
-- En Busca del Tiempo Perdido -> Marcel Proust
(16, 16),
-- El Extranjero -> Albert Camus
(17, 17),
-- El Proceso -> Franz Kafka
(18, 18),
-- Las uvas de la ira -> John Steinbeck
(19, 19),
-- El guardián entre el centeno -> J.D. Salinger
(20, 20),
-- El Señor de los Anillos: La Comunidad del Anillo -> J.R.R. Tolkien
(21, 21),
-- El Hobbit -> J.R.R. Tolkien
(22, 21),
-- Dune -> Frank Herbert
(23, 22),
-- Fundación -> Isaac Asimov
(24, 23),
-- Juego de Tronos -> George R.R. Martin
(25, 24),
-- Harry Potter y la piedra filosofal -> J.K. Rowling
(26, 25),
-- El nombre del viento -> Patrick Rothfuss
(27, 26),
-- Crónicas Marcianas -> Ray Bradbury
(28, 27),
-- ¿Sueñan los androides con ovejas eléctricas? -> Philip K. Dick
(29, 28),
-- Neuromante -> William Gibson
(30, 29),
-- El fin de la eternidad -> Isaac Asimov
(31, 23),
-- Fahrenheit 451 -> Ray Bradbury
(32, 27),
-- El Silmarillion -> J.R.R. Tolkien
(33, 21),
-- La Rueda del Tiempo: El Ojo del Mundo -> Robert Jordan
(34, 30),
-- Hyperion -> Dan Simmons
(35, 31),
-- El color de la magia -> Terry Pratchett
(36, 32),
-- La mano izquierda de la oscuridad -> Ursula K. Le Guin
(37, 33),
-- 2001: Una odisea espacial -> Arthur C. Clarke
(38, 34),
-- Frankenstein -> Mary Shelley
(39, 35),
-- Drácula -> Bram Stoker
(40, 36),
-- Reina Roja -> Juan Gómez Jurado
(41, 37),
-- La Sombra del Viento -> Carlos Ruiz Zafón
(42, 38),
-- El Código Da Vinci -> Dan Brown
(43, 39),
-- Sapiens: De animales a dioses -> Yuval Noah Harari
(44, 40),
-- Hábitos Atómicos -> James Clear
(45, 41),
-- Perdida (Gone Girl) -> Gillian Flynn
(46, 42),
-- La chica del tren -> Paula Hawkins
(47, 43),
-- Los pilares de la Tierra -> Ken Follett
(48, 44),
-- Patria -> Fernando Aramburu
(49, 45),
-- El Alquimista -> Paulo Coelho
(50, 46),
-- Cometas en el cielo -> Khaled Hosseini
(51, 47),
-- La catedral del mar -> Ildefonso Falcones
(52, 48),
-- El tiempo entre costuras -> María Dueñas
(53, 49),
-- Donde cantan los cangrejos -> Delia Owens
(54, 50),
-- Los hombres que no amaban a las mujeres -> Stieg Larsson
(55, 51),
-- El sutil arte de que (casi) todo te importe una mi*rda -> Mark Manson
(56, 52),
-- American Gods -> Neil Gaiman
(57, 53),
-- La carretera -> Cormac McCarthy
(58, 54),
-- Expiación -> Ian McEwan
(59, 55),
-- La vida de Pi -> Yann Martel
(60, 56),
-- El marciano -> Andy Weir
(61, 57),
-- Todo lo que no te conté -> Celeste Ng
(62, 58),
-- La paciente silenciosa -> Alex Michaelides
(63, 59),
-- Gente normal -> Sally Rooney
(64, 60),
-- El Proyecto Hail Mary -> Andy Weir
(65, 57),
-- Klara y el Sol -> Kazuo Ishiguro
(66, 61),
-- Lecciones de química -> Bonnie Garmus
(67, 62),
-- La biblioteca de la medianoche -> Matt Haig
(68, 63),
-- Circe -> Madeline Miller
(69, 64),
-- Rayuela -> Julio Cortázar
(70, 65),
-- Ficciones -> Jorge Luis Borges
(71, 66),
-- Pedro Páramo -> Juan Rulfo
(72, 67),
-- La casa de los espíritus -> Isabel Allende
(73, 68),
-- Anna Karenina -> León Tolstói
(74, 9),
-- Madame Bovary -> Gustave Flaubert
(75, 69),
-- Los hermanos Karamazov -> Fyodor Dostoevsky
(76, 10),
-- Grandes Esperanzas -> Charles Dickens
(77, 70),
-- Cumbres Borrascosas -> Emily Brontë
(78, 71),
-- Jane Eyre -> Charlotte Brontë
(79, 72),
-- El corazón de las tinieblas -> Joseph Conrad
(80, 73),
-- Por quién doblan las campanas -> Ernest Hemingway
(81, 74),
-- Al este del Edén -> John Steinbeck
(82, 19),
-- En el camino -> Jack Kerouac
(83, 75),
-- Matadero cinco -> Kurt Vonnegut
(84, 76),
-- El ruido y la furia -> William Faulkner
(85, 77),
-- Meridiano de sangre -> Cormac McCarthy
(86, 54),
-- El gen egoísta -> Richard Dawkins
(87, 78),
-- Breve historia del tiempo -> Stephen Hawking
(88, 79),
-- Pensar rápido, pensar despacio -> Daniel Kahneman
(89, 80),
-- El hombre en busca de sentido -> Viktor Frankl
(90, 81),
-- Cosmos -> Carl Sagan
(91, 82),
-- 12 Reglas para Vivir -> Jordan B. Peterson
(92, 83),
-- Homo Deus: Breve historia del mañana -> Yuval Noah Harari
(93, 40),
-- El poder del ahora -> Eckhart Tolle
(94, 84),
-- Armas, gérmenes y acero -> Jared Diamond
(95, 85),
-- El cisne negro -> Nassim Nicholas Taleb
(96, 86);