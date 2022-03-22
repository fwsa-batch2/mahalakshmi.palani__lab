## Klassy Restaurant :
``` sql
create database klassy;
```
```sql 
use klassy;
```
###### Database changed

``` sql
 create table users(id tinyint primary key auto_increment,name varchar(20) not null check(length(name)>=3),mailId varchar(50) not null unique check(mailId like("__%@gmail.com")),password varchar(15) not null check(length(password)>=8),role varchar(20) not null);
```
###### Query OK, 0 rows affected (0.03 sec) 

``` sql 
desc users; 
```

| Field    | Type        | Null | Key | Default | Extra          |
|:---------|:------------|:-----|:----|:--------|:---------------|
| id       | tinyint     | NO   | PRI | NULL    | auto_increment |
| name     | varchar(20) | NO   |     | NULL    |                |
| mailId   | varchar(50) | NO   | UNI | NULL    |                |
| password | varchar(15) | NO   |     | NULL    |                |
| role     | varchar(20) | NO   |     | NULL    |                |



``` sql
insert into users values(null,"vaishnavi","vaishu@gmail.com","Vaishu@2003","customer");
```
Query OK, 1 row affected (0.01 sec)
``` sql
insert into users values(null,"meenu","meenu@gmail.com","meenu@chandar","customer");
Query OK, 1 row affected (0.01 sec)
```

``` sql
 insert into users values(null,"mahalakshmi","maha@gmail.com","maha@2k23","admin");
Query OK, 1 row affected (0.01 sec)
```
``` sql 
    select*from users;
```

| id | name        | mailId           | password      | role     |
|  1 | vaishnavi   | vaishu@gmail.com | Vaishu@2003   | customer |
|  2 | meenu       | meenu@gmail.com  | meenu@chandar | customer |
|  3 | mahalakshmi | maha@gmail.com   | maha@2k23     | admin    |


``` sql 
create table user_address(user_id tinyint ,door_no int , street varchar(20), city varchar(20) not null,state varchar(20) not null, pin_code int not null, foreign key(user_id) references users(id));
```
Query OK, 0 rows affected (0.05 sec)


mysql> desc user_address;

| Field    | Type        | Null | Key | Default | Extra |
|:---------|:------------|:-----|:----|:--------|:------|
| user_id  | tinyint     | YES  | MUL | NULL    |       |
| door_no  | int         | YES  |     | NULL    |       |
| street   | varchar(20) | YES  |     | NULL    |       |
| city     | varchar(20) | NO   |     | NULL    |       |
| state    | varchar(20) | NO   |     | NULL    |       |
| pin_code | int         | NO   |     | NULL    |       |

6 rows in set (0.00 sec)
mysql> insert into user_address values(1,20,"rajinistreet","chennai","tamilnadu",600017);
Query OK, 1 row affected (0.02 sec)

mysql> insert into user_address values(2,6,"meenustreet","trichy","tamilnadu",600008);
Query OK, 1 row affected (0.01 sec)

mysql> insert into user_address values(3,2/455,"kovalanstreet","chennai","tamilnadu",600100);
Query OK, 1 row affected (0.01 sec)

mysql> insert into user_address values(3,2/455,"kovalanstreet","chennai","tamilnadu",600100);
Query OK, 1 row affected (0.01 sec)
mysql> select*from user_address;

| user_id | door_no | street         | city    | state      | pin_code |
|:--------|:--------|:---------------|:--------|:-----------|:---------|
|       1 |      20 | meenu street   | chennai | tamil nadu |   600017 |
|       2 |       6 | rajini street  | trichy  | tamil nadu |   600008 |
|       3 |      43 | kovalan street | chennai | tamil nadu |   600100 |

3 rows in set (0.00 sec)


``` sql 
create table user_phoneno(user_id tinyint,phone_number int ,foreign key(user_id) references users(id));
```
Query OK, 0 rows affected (0.09 sec)


mysql> desc user_phoneno;

| Field        | Type    | Null | Key | Default | Extra |
|:-------------|:--------|:-----|:----|:--------|:------|
| user_id      | tinyint | YES  | MUL | NULL    |       |
| phone_number | bigint  | NO   |     | NULL    |       |

2 rows in set (0.02 sec)

mysql> insert into user_phoneno(user_id,phone_number) values(1,9234562891);
Query OK, 1 row affected (0.01 sec)

mysql> insert into user_phoneno(user_id,phone_number) values(1,9233256780);
Query OK, 1 row affected (0.00 sec)

mysql> insert into user_phoneno(user_id,phone_number) values(2,9897654330);
Query OK, 1 row affected (0.01 sec)

mysql> insert into user_phoneno(user_id,phone_number) values(3,9789528233),(3,9080227642);
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select*from user_phonno;

| user_id | phone_number |
|:--------|:-------------|
|       1 |   9234562891 |
|       1 |   9233256780 |
|       2 |   9897654330 |
|       3 |   9789528233 |
|       3 |   90802276:2 |

5 rows in set (0.00 sec)

``` sql 
desc menu;
```

| Field         | Type        | Null | Key | Default           | Extra             |
|:--------------|:------------|:-----|:----|:------------------|:------------------|
| id            | tinyint     | NO   | PRI | NULL              | auto_increment    |
| food_name     | varchar(20) | NO   | UNI | NULL              |                   |
| status        | varchar(20) | NO   |     | NULL              |                   |
| created_date  | timestamp   | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| modified_date | timestamp   | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

5 rows in set (0.01 sec)
``` sql 
select*from menu;
```

| id | food_name | status      | created_date        | modified_date       |
|:---|:----------|:------------|:--------------------|:--------------------|
|  1 | Dosa      | available   | 2022-03-17 15:40:27 | 2022-03-17 15:40:27 |
|  2 | Idly      | available   | 2022-03-17 15:40:46 | 2022-03-17 15:40:46 |
|  3 | Medu vada | available   | 2022-03-17 15:41:03 | 2022-03-17 15:41:03 |
|  4 | Pongal    | available   | 2022-03-17 15:41:40 | 2022-03-17 15:41:40 |
|  5 | Panayaram | unavailable | 2022-03-17 15:42:15 | 2022-03-17 15:42:15 |

5 rows in set (0.01 sec)

``` sql
create table menu_price(id tinyint auto_increment primary key, menu_id tinyint,price int,created_date timestamp not null default current_timestamp, foreign key(menu_id) references menu(id));
```
Query OK, 0 rows affected (0.03 sec)

mysql> desc menu_price;

| Field        | Type      | Null | Key | Default           | Extra             |
|:-------------|:----------|:-----|:----|:------------------|:------------------|
| id           | tinyint   | NO   | PRI | NULL              | auto_increment    |
| menu_id      | tinyint   | YES  | MUL | NULL              |                   |
| price        | int       | YES  |     | NULL              |                   |
| created_date | timestamp | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

4 rows in set (0.01 sec)
mysql> select*from menu_price;

| id | menu_id | price | created_date        |
|:---|:--------|:------|:--------------------|
|  1 |       1 |   100 | 2022-03-21 15:58:05 |
|  2 |       2 |    50 | 2022-03-21 16:01:46 |
|  3 |       3 |    20 | 2022-03-21 16:01:58 |
|  4 |       4 |    45 | 2022-03-21 16:02:30 |
|  5 |       5 |    35 | 2022-03-21 16:02:30 |

5 rows in set (0.01 sec)
``` sql
create table orders(id tinyint primary key auto_increment, price_id tinyint, user_id tinyint,foreign key(user_id) references users(id), foreign key(price_id) references menu_price(id));
```
Query OK, 0 rows affected (0.06 sec)

mysql> desc orders;

| Field    | Type    | Null | Key | Default | Extra          |
|----------|---------|------|-----|---------|----------------|
| id       | tinyint | NO   | PRI | NULL    | auto_increment |
| price_id | tinyint | YES  | MUL | NULL    |                |
| user_id  | tinyint | YES  | MUL | NULL    |                |

3 rows in set (0.01 sec)

mysql> insert into orders values(null,1,1);
Query OK, 1 row affected (0.01 sec)

mysql> insert into orders values(null,2,2);
Query OK, 1 row affected (0.01 sec)

mysql> select*from orders;

| id | price_id | user_id |
|----|----------|---------|
|  1 |        1 |       1 |
|  2 |        2 |       2 |

2 rows in set (0.00 sec)

``` sql
create table ordered_items(order_id tinyint,food_id tinyint, qty tinyint, foreign key(order_id) references orders(id),foreign key(food_id) references menu(id));
```
Query OK, 0 rows affected (0.05 sec)

mysql> insert into ordered_items values(1,1,2);
Query OK, 1 row affected (0.02 sec)

mysql> insert into ordered_items values(1,2,1);
Query OK, 1 row affected (0.01 sec)

mysql> select*from ordered_items;

| order_id | food_id | qty  |
|----------|---------|------|
|        1 |       1 |    2 |
|        1 |       2 |    1 |

2 rows in set (0.00 sec)

``` sql
create table review(user_id tinyint not null,rating tinyint check( rating >= 1 and rating <=5) not null,review text not null, foreign key(user_id) references users(id));
```
Query OK, 0 rows affected (0.05 sec)

mysql> desc review;

| Field   | Type    | Null | Key | Default | Extra |
|---------|---------|------|-----|---------|-------|
| user_id | tinyint | NO   | MUL | NULL    |       |
| rating  | tinyint | NO   |     | NULL    |       |
| review  | text    | NO   |     | NULL    |       |

3 rows in set (0.02 sec)



mysql> insert into review values(1,4,"very good restaurant and i like idly");
Query OK, 1 row affected (0.01 sec)

mysql> insert into review values(2,5,"Great place to hangout with friends!! and gave us good recommendations.");
Query OK, 1 row affected (0.01 sec)

mysql> select*from review;

| user_id | rating | review                                                                  |
|---------|--------|-------------------------------------------------------------------------|
|       1 |      4 | very good restaurant and i like idly                                    |
|       2 |      5 | Great place to hangout with friends!! and gave us good recommendations. |

2 rows in set (0.00 sec)

