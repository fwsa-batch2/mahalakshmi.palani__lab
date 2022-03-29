
``` sql
create database klassy_restaurant;
```
Query OK, 1 row affected (0.01 sec)
mysql> show databases;

| Database           |
|--------------------|
| college            |
| employee           |
| information_schema |
| klassy_restaurant  |
| mysql              |
| performance_schema |
| sakila             |
| school             |
| student_info       |
| students           |
| sys                |
| temp               |
| views              |
| world              |

15 rows in set (0.01 sec)
mysql> use klassy_restaurant;
Database changed
``` sql
create table users(id int primary key auto_increment,name varchar(20) not null check(length(name)>=3),mailId varchar(50) not null unique check(mailId like("__%@gmail.com")),password varchar(15) not null check(length(password)>=8),role varchar(20) not null);
```
Query OK, 0 rows affected (0.08 sec)

mysql> desc users;

| Field    | Type        | Null | Key | Default | Extra          |
|----------|-------------|------|-----|---------|----------------|
| id       | int         | NO   | PRI | NULL    | auto_increment |
| name     | varchar(20) | NO   |     | NULL    |                |
| mailId   | varchar(50) | NO   | UNI | NULL    |                |
| password | varchar(15) | NO   |     | NULL    |                |
| role     | varchar(20) | NO   |     | NULL    |                |
| phoneno  | bigint      | YES  |     | NULL    |                |


mysql> insert into users values(null,"vaishnavi","vaishu@gmail.com","Vaishu@2003","customer");
Query OK, 1 row affected (0.01 sec)

mysql> insert into users values(null,"meenu","meenu@gmail.com","meenu@chandar","customer");
Query OK, 1 row affected (0.01 sec)

mysql> insert into users values(null,"mahalakshmi","maha@gmail.com","maha@2k23","admin");
Query OK, 1 row affected (0.01 sec)

mysql> select*from users;

| id | name        | mailId           | password      | role     | phoneno    |
|----|-------------|------------------|---------------|----------|------------|
|  1 | vaishnavi   | vaishu@gmail.com | Vaishu@2003   | customer | 6788994431 |
|  2 | meenu       | meenu@gmail.com  | meenu@chandar | customer | 7896544323 |
|  3 | mahalakshmi | maha@gmail.com   | maha@2k23     | admin    | 9789528233 |

5 rows in set (0.02 sec)

``` sql
create table user_address(user_id int ,door_no int , street varchar(20), city varchar(20) not null,state varchar(20) not null, pin_code int not null, foreign key(user_id) references users(id));
```
Query OK, 0 rows affected (0.07 sec)

mysql> desc user_address;

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| user_id  | int         | YES  | MUL | NULL    |       |
| door_no  | int         | YES  |     | NULL    |       |
| street   | varchar(20) | YES  |     | NULL    |       |
| city     | varchar(20) | NO   |     | NULL    |       |
| state    | varchar(20) | NO   |     | NULL    |       |
| pin_code | int         | NO   |     | NULL    |       |

6 rows in set (0.02 sec)

mysql> insert into user_address values(1,20,"rajinistreet","chennai","tamilnadu",600017);
Query OK, 1 row affected (0.01 sec)

mysql> insert into user_address values(2,6,"meenustreet","trichy","tamilnadu",600008);
Query OK, 1 row affected (0.00 sec)

mysql> insert into user_address values(3,2/455,"kovalanstreet","chennai","tamilnadu",600100);
Query OK, 1 row affected (0.00 sec)

mysql> insert into user_address values(3,55,"kovalanstreet","chennai","tamilnadu",600100);
Query OK, 1 row affected (0.01 sec)

mysql> select*from user_address;

| user_id | door_no | street        | city    | state     | pin_code |
|---------|---------|---------------|---------|-----------|----------|
|       1 |      20 | rajinistreet  | chennai | tamilnadu |   600017 |
|       2 |       6 | meenustreet   | trichy  | tamilnadu |   600008 |
|       3 |      55 | kovalanstreet | chennai | tamilnadu |   600100 |

3 rows in set (0.00 sec)
``` sql 
create table menu(menu_id int primary key auto_increment, food_name varchar(100) not null,status varchar(20) not null,created_date timestamp not null default current_timestamp,modified_date timestamp not null default current_timestamp,image text not null,check (status in ('ACTIVE','INACTIVE')));
```
Query OK, 0 rows affected (0.06 sec)

mysql> desc menu;

| Field         | Type         | Null | Key | Default           | Extra             |
|---------------|--------------|------|-----|-------------------|-------------------|
| menu_id       | int          | NO   | PRI | NULL              | auto_increment    |
| food_name     | varchar(100) | NO   |     | NULL              |                   |
| status        | varchar(20)  | NO   |     | NULL              |                   |
| created_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| modified_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| image         | text         | NO   |     | NULL              |                   |

| Field         | Type         | Null | Key | Default           | Extra             |
|---------------|--------------|------|-----|-------------------|-------------------|
| menu_id       | int          | NO   | PRI | NULL              | auto_increment    |
| food_name     | varchar(100) | NO   |     | NULL              |                   |
| status        | varchar(20)  | NO   |     | NULL              |                   |
| created_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| modified_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| image         | varchar(255) | YES  |     | NULL              |                   |


6 rows in set (0.02 sec)

mysql> insert into menu(food_name,status,image)  values("Dosa","Active","https://vismaifood.com/storage/app/uploads/public/8b4/19e/427/thumb__700_0_0_0_auto.jpg ");
Query OK, 1 row affected (0.01 sec)

mysql> insert into menu(food_name,status,image)  values("Idly","Active","https://vismaifood.com/storage/app/uploads/public/8b4/19e/427/thumb__700_0_0_0_auto.jpg https://i0.wp.com/cookingfromheart.com/wp-content/uploads/2016/08/Idli-5.jpg?resize=683%2C1024");
Query OK, 1 row affected (0.01 sec)

mysql> insert into menu(food_name,status,image)  values("Medu vada","Active"," https://3.bp.blogspot.com/-iq_B__z5Za8/XLleMc-NVwI/AAAAAAAAQOM/8GxvXabQgz4huPLrbrf_v1_evCM9ow8AgCLcBGAs/s1600/Uddina_Vada_6.jpg ");
Query OK, 1 row affected (0.01 sec)

mysql> insert into menu(food_name,status,image)  values("Pongal","Active","https://static.toiimg.com/photo/61051454.cms ");
Query OK, 1 row affected (0.01 sec)

mysql> select*from menu;

| menu_id | food_name | status | created_date        | modified_date       | image                                                                                                                                                                                  |
|---------|-----------|--------|---------------------|---------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|       1 | Dosa      | Active | 2022-03-25 07:40:10 | 2022-03-25 07:40:10 | https://vismaifood.com/storage/app/uploads/public/8b4/19e/427/thumb__700_0_0_0_auto.jpg                                                                                                |
|       2 | Idly      | Active | 2022-03-25 07:41:13 | 2022-03-25 07:41:13 | https://vismaifood.com/storage/app/uploads/public/8b4/19e/427/thumb__700_0_0_0_auto.jpg https://i0.wp.com/cookingfromheart.com/wp-content/uploads/2016/08/Idli-5.jpg?resize=683%2C1024 |
|       3 | Medu vada | Active | 2022-03-25 07:42:47 | 2022-03-25 07:42:47 |  https://3.bp.blogspot.com/-iq_B__z5Za8/XLleMc-NVwI/AAAAAAAAQOM/8GxvXabQgz4huPLrbrf_v1_evCM9ow8AgCLcBGAs/s1600/Uddina_Vada_6.jpg                                                       |
|       4 | Pongal    | Active | 2022-03-25 07:45:18 | 2022-03-25 07:45:18 | https://static.toiimg.com/photo/61051454.cms                                                                                                                                           |

4 rows in set (0.01 sec)

mysql>

``` sql
 create table menu_price(id int auto_increment primary key, menu_id int,price int,created_date timestamp not null default current_timestamp, foreign key(menu_id) references menu(menu_id));
 ```
Query OK, 0 rows affected (0.07 sec)

mysql> desc menu_price;
+
| Field        | Type      | Null | Key | Default           | Extra             |
|--------------|-----------|------|-----|-------------------|-------------------|
| id           | int       | NO   | PRI | NULL              | auto_increment    |
| menu_id      | int       | YES  | MUL | NULL              |                   |
| price        | int       | YES  |     | NULL              |                   |
| created_date | timestamp | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

4 rows in set (0.01 sec)

mysql> insert into menu_price(menu_id,price) values(1,45);
Query OK, 1 row affected (0.01 sec)

mysql> insert into menu_price(menu_id,price) values(2,50),(3,10);
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> insert into menu_price(menu_id,price) values(4,55);
Query OK, 1 row affected (0.01 sec)

mysql> select*from menu_price;

| id | menu_id | price | created_date        |
|----|---------|-------|---------------------|
|  1 |       1 |    45 | 2022-03-25 12:15:30 |
|  2 |       2 |    50 | 2022-03-25 12:16:03 |
|  3 |       3 |    10 | 2022-03-25 12:16:03 |
|  4 |       4 |    55 | 2022-03-25 12:16:31 |

4 rows in set (0.00 sec)


``` sql
create table orders(id int primary key auto_increment, price_id int, user_id int,foreign key(user_id) references users(id), foreign key(price_id) references menu_price(id));
```
Query OK, 0 rows affected (0.09 sec)

mysql> desc orders;




| Field        | Type      | Null | Key | Default           | Extra             |
|--------------|-----------|------|-----|-------------------|-------------------|
| id           | int       | NO   | PRI | NULL              | auto_increment    |
| price_id     | int       | YES  | MUL | NULL              |                   |
| user_id      | int       | YES  | MUL | NULL              |                   |
| ordered_date | timestamp | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
+
3 rows in set (0.01 sec)

mysql> insert into orders values(null,1,1);
Query OK, 1 row affected (0.01 sec)

mysql> insert into orders values(null,2,2);
Query OK, 1 row affected (0.01 sec)

mysql> select*from orders;

| id | price_id | user_id | ordered_date        |
|----|----------|---------|---------------------|
|  1 |        1 |       1 | 2022-03-29 07:06:46 |
|  2 |        2 |       2 | 2022-03-29 07:06:46 |


2 rows in set (0.00 sec)

mysql>

``` sql
 create table ordered_items(order_id int,menu_id int, qty int, foreign key(order_id) references orders(id),foreign key(menu_id) references menu(menu_id));
 ```
Query OK, 0 rows affected (0.07 sec)

mysql> desc ordered_items;

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| order_id | int         | YES  | MUL | NULL    |       |
| menu_id  | int         | YES  | MUL | NULL    |       |
| qty      | int         | YES  |     | NULL    |       |
| status   | varchar(20) | NO   |     | NULL    |       |


3 rows in set (0.02 sec)

mysql> insert into ordered_items values(1,1,2);
Query OK, 1 row affected (0.01 sec)

mysql> insert into ordered_items values(1,2,1);
Query OK, 1 row affected (0.01 sec)

mysql> select*from ordered_items;


| order_id | menu_id | qty  | status     |
|----------|---------|------|------------|
|        1 |       1 |    2 | delivered  |
|        1 |       2 |    1 | on the way |


2 rows in set (0.00 sec)

```sql
create table review(user_id int not null,rating int check( rating >= 1 and rating <=5) not null,review text not null, foreign key(user_id) references users(id));
```
Query OK, 0 rows affected (0.05 sec)

mysql> desc review;

| Field   | Type | Null | Key | Default | Extra |
|---------|------|------|-----|---------|-------|
| user_id | int  | NO   | MUL | NULL    |       |
| rating  | int  | NO   |     | NULL    |       |
| review  | text | NO   |     | NULL    |       |

3 rows in set (0.01 sec)

mysql> insert into review values(1,4,"very good restaurant and i like this restaurant idly");
Query OK, 1 row affected (0.01 sec)

mysql> insert into review values(2,5,"Great place to hangout with friends!! and gave us good recommendations.")
    -> ;
Query OK, 1 row affected (0.01 sec)

mysql> select*from review;

| user_id | rating | review                                                                  |
|---------|--------|-------------------------------------------------------------------------|
|       1 |      4 | very good restaurant and i like this restaurant idly                    |
|       2 |      5 | Great place to hangout with friends!! and gave us good recommendations. |

2 rows in set (0.00 sec)

![Screenshot (154)](https://user-images.githubusercontent.com/82790009/159881507-e5ee8577-90fb-42dd-b075-8d2ce49495bf.png)
![Screenshot (159)](https://user-images.githubusercontent.com/82790009/160518263-f801d2be-6eb5-4904-8ee0-c34fef9b4865.png)


