INSERT INTO STUDENT VALUES
(1,'Wolf','Gupta','9999999999'),
(2,'Bruce','Wayne','8888888888'),
(3,'Peter','Parker','7777777777'),
(4,'Tony','Stark','6666666666'),
(5,'Deadpool','Singh','5555555555');

INSERT INTO DEPARTMENT VALUES 
('CSE','North Wing'),
('ECE','South Wing'),
('MEC','East Wing'),
('CIV','West Wing');

INSERT INTO INSTRUCTOR VALUES
(1,'CSE','Harry Potter','Daniel','Radcliffe','1111111111'),
(2,'CSE','Hermoine Granger','Emma','Watson','2222222222'),
(3,'ECE','Ron Weasely','Rupert','Grint','3333333333'),
(4,'ECE','Draco Malfoy','Tom','Felton','4444444444'),
(5,'MEC','Ginny Weasely','Bonnie','Wright','1212121212'),
(6,'CIV','Albus Sumbledore','Richard','Harris','3434343434');

INSERT INTO COURSE VALUES
(1,'CSE',10,1,'Algorithms'),
(2,'CSE',20,2,'Data Structures'),
(3,'ECE',30,3,'Wires'),
(4,'ECE',40,4,'Bulbs'),
(5,'MEC',50,5,'Cars'),
(6,'CIV',60,6,'Bridges');

INSERT INTO COURSE_STUDENT VALUES
(1,1),
(1,2),
(1,3),
(1,4),
(1,5),
(1,6),
(2,1),
(2,2),
(2,3),
(3,1),
(3,2),
(3,3),
(3,4),
(4,1),
(4,2),
(5,6);