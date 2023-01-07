/*Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1.film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film 
uzunluğundan fazla kaç tane film vardır?
2.film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
3.film tablosunda en düşük rental_rate ve en düşük replacement_cost değerlerine sahip filmleri 
sıralayınız.
4.payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
*/
--1
SELECT length FROM film 
WHERE length > 
(
	SELECT AVG(LENGTH) FROM film
);

--2
SELECT COUNT(film) FROM film 
WHERE rental_rate = 
(
	SELECT MAX(rental_rate) FROM film 
);

--3
SELECT title FROM film 
WHERE rental_rate = 
(
	SELECT MIN(rental_rate) FROM film
) 
AND replacement_cost = 
(
	SELECT MIN(replacement_cost) FROM film
);

--4
SELECT first_name, last_name, COUNT(payment_id) FROM payment
INNER JOIN customer ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id
ORDER BY COUNT(payment_id) DESC;

