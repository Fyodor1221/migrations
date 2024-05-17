select * from jdbc_dao.ORDERS as O
join jdbc_dao.CUSTOMERS as C on C.id = O.customer_id
where name = :name