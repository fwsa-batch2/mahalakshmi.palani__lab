    
mysql> desc student_class;

| Field      | Type        | Null | Key | Default | Extra          |
|------------|-------------|------|-----|---------|----------------|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |

4 rows in set (0.01 sec)

mysql> desc  students;

| Field        | Type         | Null | Key | Default           | Extra             |
|--------------|--------------|------|-----|-------------------|-------------------|
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(100) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | char(1)      | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

8 rows in set (0.00 sec)

mysql> show tables;

| Tables_in_student_info |
|------------------------|
| student_class          |
| students               |

2 rows in set (0.01 sec) 

Feature 1: Student Registration   
insert into students(name,email,mobile_no,password,gender,dob)values("viji","viji@gmail.com",8976543987,"viji@1999",'F','1999-8-18');
Query OK, 1 row affected (0.01 sec)

mysql> select*from students;

| id | name | email          | mobile_no  | password  | gender | dob        | created_date        |
|----|------|----------------|------------|-----------|--------|------------|---------------------|
|  1 | viji | viji@gmail.com | 8976543987 | viji@1999 | F      | 1999-08-18 | 2022-03-03 12:28:34 |

1 row in set (0.00 sec)

Feature 2: List All Students:
mysql> select name from students;

| name |
|------|
| viji |
| pavi |
| maha |

3 rows in set (0.00 sec)

Feature 3: Login with email and password:
mysql> select email,password from students where email = "viji@gmail.com" and password = "viji@1999";

| email          | password  |
|----------------|-----------|
| viji@gmail.com | viji@1999 |

1 row in set (0.00 sec)

Feature 4: Update Password:
mysql> update students set password = "viji@99" where password = "viji@1999";
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from students;

| id | name | email          | mobile_no  | password  | gender | dob        | created_date        |
|----|------|----------------|------------|-----------|--------|------------|---------------------|
|  1 | viji | viji@gmail.com | 8976543987 | viji@99   | F      | 1999-08-18 | 2022-03-03 12:28:34 |
|  2 | pavi | pavi@gmail.com | 8765473987 | pavi@2000 | F      | 2000-03-27 | 2022-03-03 12:31:44 |
|  3 | maha | maha@gmail.com | 8875489527 | maha@2000 | F      | 2000-11-23 | 2022-03-03 12:43:34 |

3 rows in set (0.00 sec)

Feature 5: Enroll Student into Class(insert student values) enroll means adding:

mysql> insert into student_class(student_id,class,status) values(1,5,'ACTIVE');
Query OK, 1 row affected (0.01 sec)

mysql> insert into student_class(student_id,class,status) values(2,6,'INACTIVE');
Query OK, 1 row affected (0.01 sec)

mysql> insert into student_class(student_id,class,status) values(2,5,'ACTIVE');
Query OK, 1 row affected (0.01 sec)

mysql> select*from student_class;

| id | student_id | class | status   |
|----|------------|-------|----------|
|  1 |          1 |     5 | ACTIVE   |
|  2 |          2 |     6 | INACTIVE |
|  3 |          3 |     5 | ACTIVE   |

3 rows in set (0.00 sec)

For 6th question: Find Students who are studying in 5th standard:

mysql> select students.name,student_class.class  from students inner join student_class on students.id = student_class.student_id where class =5;

| name | class |
|------|-------|
| viji |     5 |
| maha |     5 |

2 rows in set (0.00 sec)
Feature 7: Update Student Class information #Update student from 5th standard to 6th standard:
mysql> update student_class set class = 6  where class = 5;
Query OK, 2 rows affected (0.01 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> select*from student_class;

| id | student_id | class | status   |
|----|------------|-------|----------|
|  1 |          1 |     6 | ACTIVE   |
|  2 |          2 |     6 | INACTIVE |
|  3 |          3 |     6 | ACTIVE   |

3 rows in set (0.01 sec)

Feature 8: Student withdrawn from a Class:
mysql> delete from student_class where id = 2;
Query OK, 1 row affected (0.01 sec)

mysql> select*from student_class;

| id | student_id | class | status |
|----|------------|-------|--------|
|  1 |          1 |     6 | ACTIVE |
|  3 |          3 |     6 | ACTIVE |

2 rows in set (0.00 sec)
Feature 9: Find student details who have not updated their Date Of Birth :
mysql> select dob from students where dob = null;
Empty set (0.01 sec)

Feature 10: Find Total no of students actively studying in this school:

mysql> select count(*),status from student_class where status ='ACTIVE';

| count(*) | status |
|----------|--------|
|        2 | ACTIVE |

1 row in set (0.00 sec)
Feature 11: Find Total no of students actively studying in each class:

mysql> select count(*),class from student_class where status = 'active'group by class;

| count(*) | class |
|----------|-------|
|        2 |     6 |
|        1 |     5 |

2 rows in set (0.00 sec)
    
Feature 12: Find Total no of students actively studying each class which has less than 5 students.

mysql> select count(status),class from student_class where status = 'active'group by  class having count(class)<5;

| count(status) | class |
|---------------|-------|
|             2 |     6 |
|             1 |     5 |

2 rows in set (0.00 sec)

mysql> select count(status),class from student_class where status = 'active'group by  class having count(class)>5;
Empty set (0.00 sec)

    
Feature 13: Display student and class details #Using Joins (Inner Join)* Using Subqueries ( Scalar SubQuery):

mysql> select *from students inner join student_class on  students.id = student_class.student_id;

| id | name | email          | mobile_no  | password  | gender | dob        | created_date        | id | student_id | class | status |
|----|------|----------------|------------|-----------|--------|------------|---------------------|----|------------|-------|--------|
|  1 | viji | viji@gmail.com | 8976543987 | viji@99   | F      | 1999-08-18 | 2022-03-03 12:28:34 |  1 |          1 |     6 | ACTIVE |
|  3 | maha | maha@gmail.com | 8875489527 | maha@2000 | F      | 2000-11-23 | 2022-03-03 12:43:34 |  2 |          3 |     5 | active |
|  3 | maha | maha@gmail.com | 8875489527 | maha@2000 | F      | 2000-11-23 | 2022-03-03 12:43:34 |  3 |          3 |     6 | ACTIVE |

3 rows in set (0.01 sec)

Feature 14: Display Student Details for the given input class #
Class : 5th Standard

mysql> select *from students inner join student_class on  students.id = student_class.student_id where student_class.class = 5;

| id | name | email          | mobile_no  | password  | gender | dob        | created_date        | id | student_id | class | status |
|----|------|----------------|------------|-----------|--------|------------|---------------------|----|------------|-------|--------|
|  3 | maha | maha@gmail.com | 8875489527 | maha@2000 | F      | 2000-11-23 | 2022-03-03 12:43:34 |  2 |          3 |     5 | active |

1 row in set (0.00 sec)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     