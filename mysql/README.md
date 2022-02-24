# MySQL
### MySQL SHOW DATABASES Statement:
>SHOW DATABASES;
---

| Database           |
|--------------------|
| db1                |
| information_schema |
| mysql              |
| performance_schema |
| sakila             |
| school             |
| students           |
| sys                |
| visiters           |
| world              |

10 rows in set (0.00 sec)
### The MySQL USE DATABASE Statement:
>USE school;
---
### MySQL CREATE TABLE Statement;
>create table student_info(id int primary key auto_increment, name varchar(20),DOB date UNIQUE );
---
Query OK, 0 rows affected (0.04 sec)
### MySQL SHOW TABLES Statement:
>SHOW TABLES;
---
| Tables_in_school |
|------------------|
| student_info     |

1 row in set (0.00 sec)
### MySQL DESCRIBE TABLE Statement:
>DESC student_info;
```DESCRIBE student_info;```
---
| Field | Type        | Null | Key | Default | Extra          |
|-------|-------------|------|-----|---------|----------------|
| id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(20) | YES  |     | NULL    |                |
| DOB   | date        | YES  | UNI | NULL    |                |

3 rows in set (0.01 sec)
### MySQL INSERT INTO Statement:
>insert into student_info values(1,"maha","2000-11-23");
```insert into student_info (name,DOB) values("pavi","2000-3-27");```
---
Query OK, 1 row affected (0.01 sec)
###  MySQL SELECT Statement:
```SELECT * FROM student_info;```
---

| id | name | DOB        |
|----|------|------------|
|  1 | maha | 2000-11-23 |
|  2 | pavi | 2000-03-27 |
|  3 | viji | 1999-08-15 |

3 rows in set (0.00 sec)
### MySQL WHERE Clause:

```SELECT * FROM student_info WHERE Id='1';```
---

| id | name | DOB        |
|----|------|------------|
|  1 | maha | 2000-11-23 |

1 row in set (0.01 sec)

### MySQL ALTER TABLE Statement :
* ADD COLUMN:
```ALTER TABLE student_info ADD age int(2);```
---
* MODIFY COLUMN:
#### syntax:
ALTER TABLE table_name
RENAME COLUMN old_name TO new_name;
```ALTER TABLE student_info RENAME COLUMN age to section ;``
* DROP COLUMN:
```alter table student_info drop section;```
### MySQL UPDATE Statement:
UPDATE statement is used to modify the existing records in a table.
```update student_info set DOB ="2000-8-18", name = "gayathri" where id = 3;```
---
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0
### MySQL DROP TABLE Statement:

### MySQL Constraints:
* NOT NULL - Ensures that a column cannot have a NULL value
* UNIQUE - Ensures that all values in a column are different
* PRIMARY KEY - A combination of a NOT NULL and UNIQUE. Uniquely identifies each row in a table
* FOREIGN KEY - Prevents actions that would destroy links between tables
* CHECK - Ensures that the values in a column satisfies a specific condition
* DEFAULT - Sets a default value for a column if no value is specified
* CREATE INDEX - Used to create and retrieve data from the database very quickly

``` create table student_info(id int auto_increment,name varchar(20) not null,DOB date unique not null, primary key(id));```

Query OK, 0 rows affected (0.04 sec)
 
#### foreign key:
``` create table mark_list(id int not null, mark int not null, section varchar(1) default 'B', foreign key (id) references student_info(id));```

Query OK, 0 rows affected (0.07 sec)
----
```insert into mark_list values(2,99,default);```

Query OK, 1 row affected (0.01 sec)
----

``` select*from mark_list;```

| id | mark | section |
|----|------|---------|
|  1 |   99 | B       |
|  2 |   99 | B       |

2 rows in set (0.00 sec)

### JOINS:
#### table1 mark_list:

| id | mark | section |
|----|------|---------|
|  1 |   99 | B       |
|  2 |   99 | B       |
|  3 |   86 | B       |

3 rows in set (0.00 sec)

#### table2 student_info:

| id | name      | DOB        |
|----|-----------|------------|
|  1 | maha      | 2000-11-23 |
|  2 | viji      | 1999-08-15 |
|  3 | pavi      | 2000-03-27 |
|  4 | gayathiri | 2000-08-17 |
|  5 | sharmi    | 2000-01-13 |

5 rows in set (0.00 sec)
#### INNER JOIN:
The INNER JOIN keyword selects records that have matching values in both tables.
Syntax:
  ``` select*from mark_list inner join student_info on mark_list.id = student_info.id;```
  (or)
  ```select*from mark_list join student_info on mark_list.id = student_info.id;```
----

   
    | id | mark | section | id | name | DOB        |
    |----|------|---------|----|------|------------|
    |  1 |   99 | B       |  1 | maha | 2000-11-23 |
    |  2 |   99 | B       |  2 | viji | 1999-08-15 |
    |  3 |   86 | B       |  3 | pavi | 2000-03-27 |
   
    3 rows in set (0.00 sec)
### LEFT JOIN :
* The LEFT JOIN keyword returns all records from the left table (table1), and the matching records (if any) from the right table (table2).
* The rows for which there is no matching row on right side, the result-set will contain null. 
Syntax:
``` select*from mark_list left join student_info on mark_list.id = student_info.id;```

| id | mark | section | id   | name | DOB        |
|----|------|---------|------|------|------------|
|  1 |   99 | B       |    1 | maha | 2000-11-23 |
|  2 |   99 | B       |    2 | viji | 1999-08-15 |
|  3 |   86 | B       |    3 | pavi | 2000-03-27 |

3 rows in set (0.00 sec)

### RIGHT JOIN:
 ```select*from mark_list right join student_info on mark_list.id = student_info.id;```
----

| id   | mark | section | id | name      | DOB        |
|------|------|---------|----|-----------|------------|
|    1 |   99 | B       |  1 | maha      | 2000-11-23 |
|    2 |   99 | B       |  2 | viji      | 1999-08-15 |
|    3 |   86 | B       |  3 | pavi      | 2000-03-27 |
| NULL | NULL | NULL    |  4 | gayathiri | 2000-08-17 |
| NULL | NULL | NULL    |  5 | sharmi    | 2000-01-13 |

5 rows in set (0.01 sec)

### MySQL UNION Operator:
```select*from mark_list right join student_info on mark_list.id = student_info.id union  select*from mark_list left join student_info on mark_list.id = student_info.id;```
----

| id   | mark | section | id   | name      | DOB        |
|------|------|---------|------|-----------|------------|
|    1 |   99 | B       |    1 | maha      | 2000-11-23 |
|    2 |   99 | B       |    2 | viji      | 1999-08-15 |
|    3 |   86 | B       |    3 | pavi      | 2000-03-27 |
| NULL | NULL | NULL    |    4 | gayathiri | 2000-08-17 |
| NULL | NULL | NULL    |    5 | sharmi    | 2000-01-13 |

5 rows in set (0.01 sec)

### MySQL Aliases:
```select*from mark_list As m1 right join student_info As m2 on m1.id = m2.id ;```
----

| id   | mark | section | id | name      | DOB        |
|------|------|---------|----|-----------|------------|
|    1 |   99 | B       |  1 | maha      | 2000-11-23 |
|    2 |   99 | B       |  2 | viji      | 1999-08-15 |
|    3 |   86 | B       |  3 | pavi      | 2000-03-27 |
| NULL | NULL | NULL    |  4 | gayathiri | 2000-08-17 |
| NULL | NULL | NULL    |  5 | sharmi    | 2000-01-13 |

5 rows in set (0.00 sec)
### MySQL AND, OR and NOT Operators:

```select*from student_info where name = "maha" And id = 1;```

| id | name | DOB        |
+----+------+------------+
|  1 | maha | 2000-11-23 |

1 row in set (0.01 sec)

``` select*from student_info where name = "maha" And id = 8;```
Empty set (0.00 sec)
----
```select*from student_info where name = "maha" Or id = 8;```
----

| id | name | DOB        |
|----|------|------------|
|  1 | maha | 2000-11-23 |

1 row in set (0.00 sec)

```select*from student_info where not name = "maha";```
----

| id | name      | DOB        |
|----|-----------|------------|
|  2 | viji      | 1999-08-15 |
|  3 | pavi      | 2000-03-27 |
|  4 | gayathiri | 2000-08-17 |
|  5 | sharmi    | 2000-01-13 |

4 rows in set (0.00 sec)
### MySQL LIKE Operator:
```select*from student_info where name like  '%i';```

| id | name      | DOB        |
|----|-----------|------------|
|  2 | viji      | 1999-08-15 |
|  3 | pavi      | 2000-03-27 |
|  4 | gayathiri | 2000-08-17 |
|  5 | sharmi    | 2000-01-13 |

4 rows in set (0.01 sec)

### MySQL IN Operator:
```select*from student_info where  name in('maha','pavi');```

| id | name | DOB        |
|----|------|------------|
|  1 | maha | 2000-11-23 |
|  3 | pavi | 2000-03-27 |

2 rows in set (0.00 sec)

### Aggregate functions in SQL:
```select min(mark) from mark_list;```

| min(mark) |
|-----------|
|        86 |

1 row in set (0.01 sec)

```select max(mark) from mark_list;```

| max(mark) |
|-----------|
|        99 |

1 row in set (0.00 sec)

```select sum(mark) from mark_list;```

| sum(mark) |
|-----------|
|       284 |

1 row in set (0.01 sec)

```select count(mark) from mark_list;```

| count(mark) |
|-------------|
|           3 |

1 row in set (0.02 sec)

```select avg(mark) from mark_list;```

| avg(mark) |
|-----------|
|   94.6667 |

1 row in set (0.00 sec)

### MySQL BETWEEN Operator:
```select*from mark_list where mark between 70 and 90;```

| id | mark | section |
|----|------|---------|
|  3 |   86 | B       |

1 row in set (0.00 sec)
```select*from student_info where id between 2 and 9;```

| id | name      | DOB        |
|----|-----------|------------|
|  2 | viji      | 1999-08-15 |
|  3 | pavi      | 2000-03-27 |
|  4 | gayathiri | 2000-08-17 |
|  5 | sharmi    | 2000-01-13 |

4 rows in set (0.00 sec)
### MySQL ORDER BY Keyword:
```select*from student_info order by name;```

| id | name      | DOB        |
|----|-----------|------------|
|  4 | gayathiri | 2000-08-17 |
|  1 | maha      | 2000-11-23 |
|  3 | pavi      | 2000-03-27 |
|  5 | sharmi    | 2000-01-13 |
|  2 | viji      | 1999-08-15 |

5 rows in set (0.01 sec)



