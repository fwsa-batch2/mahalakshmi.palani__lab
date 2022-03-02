### Feature 1: Student Registration:
```insert into students values(null,"pavi","pavi@gmail.com",7896564344,"pavi@mani","F","2000:3:27",'2008-01-01 00:00:01');```
 select*from students;

| id   | name      | email               | mobile_no  | password     | gender | dob   |created_date        |
|------|-----------|---------------------|------------|--------------|--------|------------|---------------------|
| 1001 | poorani   | Poorani@gmail.com   | 7865439821 | poorani@babu | F      | 2003-02-27 | 2008-01-01 00:00:01 |
| 1002 | sangeetha | sangeetha@gmail.com | 8765432991 | sangee@ram   | F      | 2003-02-27 | 2008-01-01 00:00:01 |
| 1003 | vaishnavi | vaishu@gmail.com    | 9876432991 | vaishu@mani  | F      | 2003-02-27 | 2008-01-01 00:00:01 |
| 1005 | maha      | maha@gmail.com      | 9789528233 | maha@lakshmi | F      | 2003-02-27 | 2008-01-01 00:00:01 |
| 1006 | pavi      | pavi@gmail.com      | 7896564344 | pavi@mani    | F      | 2000-03-27 | 2008-01-01 00:00:01 |

5 rows in set (0.01 sec)
### Feature 2: List All Students:
```select name from students;```
+-----------+
| name      |
+-----------+
| poorani   |
| sangeetha |
| vaishnavi |
| maha      |
| pavi      |
+-----------+
5 rows in set (0.00 sec)

### Feature 3: Login with email and password:
### Feature 4: Update Password:
```update students set password = "maha@palani"  where id = 1005;```
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

### Feature 5: Enroll Student into Class:
```insert into student_class values(1,1001,10,'ACTIVE');```
Query OK, 1 row affected (0.02 sec)

mysql> insert into student_class values(2,1002,10,'ACTIVE');
Query OK, 1 row affected (0.01 sec)

mysql> insert into student_class values(3,1003,10,'ACTIVE');
Query OK, 1 row affected (0.01 sec)
### Feature 6: Find Students who are studying in 5th standard.
```select students.name,student_class.class from students inner join student_class on students.id = student_class.student_id where class = '12';```
+------+-------+
| name | class |
+------+-------+
| maha |    12 |
+------+-------+
1 row in set (0.00 sec)

### Feature 7: Update Student Class information ( Update student from 5th standard to 6th standard.)
```update student_class set class = 12 where id = 5;```
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |       1001 |    10 | ACTIVE   |
|  2 |       1002 |    10 | ACTIVE   |
|  3 |       1003 |    10 | ACTIVE   |
|  4 |       1005 |    12 | ACTIVE   |
|  5 |       1006 |    12 | INACTIVE |
+----+------------+-------+----------+
5 rows in set (0.01 sec)
