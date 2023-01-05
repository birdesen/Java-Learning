/*1.test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), 
birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
2.Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
3.Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
4.Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
*/
--1
CREATE TABLE employee(
	id INTEGER NOT NULL,
	name VARCHAR(50),
	email VARCHAR(100),
	birthday DATE
);

--2
insert into employee (id, name, email, birthday) values (1, 'Geoffry', 'gbritee0@shutterfly.com', '1980-03-23');
insert into employee (id, name, email, birthday) values (2, 'Louise', 'loglethorpe1@cbslocal.com', '1980-02-13');
insert into employee (id, name, email, birthday) values (3, 'Stinky', 'saltofts2@addthis.com', '1976-12-08');
insert into employee (id, name, email, birthday) values (4, 'Dodie', 'dlyons3@netlog.com', '1981-07-09');
insert into employee (id, name, email, birthday) values (5, 'Chuck', 'crosenauer4@istockphoto.com', '1973-12-19');
insert into employee (id, name, email, birthday) values (6, 'Camey', 'cfeather5@foxnews.com', '1958-12-11');
insert into employee (id, name, email, birthday) values (7, 'Almira', 'atoombes6@phoca.cz', '1966-02-01');
insert into employee (id, name, email, birthday) values (8, 'Angelia', 'aslowley7@cyberchimps.com', '1950-11-09');
insert into employee (id, name, email, birthday) values (9, 'Phylis', 'pzanardii8@ocn.ne.jp', '2002-01-26');
insert into employee (id, name, email, birthday) values (10, 'Dusty', 'dsleeman9@ucoz.com', '1997-08-02');
insert into employee (id, name, email, birthday) values (11, 'Monroe', 'mkupisa@google.ca', '1964-03-29');
insert into employee (id, name, email, birthday) values (12, 'Boyce', 'blebrumb@taobao.com', '2003-09-03');
insert into employee (id, name, email, birthday) values (13, 'Rip', 'rpecholdc@seesaa.net', '1971-05-19');
insert into employee (id, name, email, birthday) values (14, 'Hastie', 'hbossinghamd@dedecms.com', '1986-05-24');
insert into employee (id, name, email, birthday) values (15, 'Georgina', 'gbasilonee@marketwatch.com', '1994-02-26');
insert into employee (id, name, email, birthday) values (16, 'Junette', 'jsharphurstf@hhs.gov', '2001-02-13');
insert into employee (id, name, email, birthday) values (17, 'Asia', 'aheasleyg@epa.gov', '1951-11-14');
insert into employee (id, name, email, birthday) values (18, 'Michaelina', 'mstovingh@studiopress.com', '1957-05-28');
insert into employee (id, name, email, birthday) values (19, 'Kurtis', 'kmartelloi@buzzfeed.com', '1989-10-02');
insert into employee (id, name, email, birthday) values (20, 'Benedicto', 'bbowsteadj@paypal.com', '1964-05-05');
insert into employee (id, name, email, birthday) values (21, 'Merlina', 'mgreenshielsk@berkeley.edu', '1979-05-04');
insert into employee (id, name, email, birthday) values (22, 'Tracie', 'tcollumbinel@google.ca', '1974-09-24');
insert into employee (id, name, email, birthday) values (23, 'Leola', 'leykelm@cocolog-nifty.com', '1992-01-07');
insert into employee (id, name, email, birthday) values (24, 'Benny', 'bmattocksn@springer.com', '1970-07-15');
insert into employee (id, name, email, birthday) values (25, 'Freddie', 'fwillacoto@paginegialle.it', '1978-07-22');
insert into employee (id, name, email, birthday) values (26, 'Otha', 'omaddamsp@ustream.tv', '1999-10-25');
insert into employee (id, name, email, birthday) values (27, 'Elisabet', 'eturnq@webnode.com', '1960-03-13');
insert into employee (id, name, email, birthday) values (28, 'Kaylee', 'kfidelerr@walmart.com', '1977-12-03');
insert into employee (id, name, email, birthday) values (29, 'Teodorico', 'tgrigoriscus@usa.gov', '1982-03-14');
insert into employee (id, name, email, birthday) values (30, 'Fitzgerald', 'fflishert@opera.com', '1959-05-20');
insert into employee (id, name, email, birthday) values (31, 'Brittaney', 'bmarchingtonu@jalbum.net', '1957-06-03');
insert into employee (id, name, email, birthday) values (32, 'Kendell', 'kbarkessv@va.gov', '1991-09-20');
insert into employee (id, name, email, birthday) values (33, 'Duky', 'dlayfieldw@dagondesign.com', '1952-01-27');
insert into employee (id, name, email, birthday) values (34, 'Ernesto', 'evardenx@cafepress.com', '1988-07-24');
insert into employee (id, name, email, birthday) values (35, 'Devland', 'dprattey@weather.com', '1958-12-12');
insert into employee (id, name, email, birthday) values (36, 'Janot', 'jmcgrirlz@discuz.net', '1965-07-28');
insert into employee (id, name, email, birthday) values (37, 'Margaretha', 'mstoneham10@unc.edu', '1968-01-10');
insert into employee (id, name, email, birthday) values (38, 'Kerry', 'kdilks11@dion.ne.jp', '1984-12-24');
insert into employee (id, name, email, birthday) values (39, 'Alfy', 'abjorkan12@woothemes.com', '1955-07-09');
insert into employee (id, name, email, birthday) values (40, 'Fidela', 'fsinnock13@whitehouse.gov', '1953-02-01');
insert into employee (id, name, email, birthday) values (41, 'Archaimbaud', 'abonehill14@baidu.com', '1969-07-30');
insert into employee (id, name, email, birthday) values (42, 'Grange', 'galldis15@amazon.co.jp', '1987-06-13');
insert into employee (id, name, email, birthday) values (43, 'Enoch', 'ecashley16@disqus.com', '1960-11-05');
insert into employee (id, name, email, birthday) values (44, 'Dore', 'dathelstan17@gravatar.com', '1963-04-24');
insert into employee (id, name, email, birthday) values (45, 'Cherida', 'cbassingden18@netscape.com', '2002-11-04');
insert into employee (id, name, email, birthday) values (46, 'Karlotte', 'khadaway19@e-recht24.de', '1997-05-20');
insert into employee (id, name, email, birthday) values (47, 'Brent', 'bfrancescuzzi1a@github.io', '1985-08-07');
insert into employee (id, name, email, birthday) values (48, 'Rand', 'rbudden1b@blogs.com', '1998-01-04');
insert into employee (id, name, email, birthday) values (49, 'Larissa', 'lanstey1c@xrea.com', '1994-04-10');
insert into employee (id, name, email, birthday) values (50, 'Ivett', 'ikluger1d@sogou.com', '1989-04-20');

--3
UPDATE employee SET name = 'Barbara' WHERE id = 3;
UPDATE employee SET birthday = '1970-03-11' WHERE id = 5;
UPDATE employee SET email = 'larissa@gmail.com' WHERE id = 49;
UPDATE employee SET name = 'Ivett' WHERE id = 50;
UPDATE employee SET email = 'cilginbrent@hotmail.com' WHERE id = 47;

--4
DELETE FROM employee WHERE id = 6;
DELETE FROM employee WHERE name = 'Duky';
DELETE FROM employee WHERE email = 'mstovingh@studiopress.com';
DELETE FROM employee WHERE birthday = '1982-03-14';
