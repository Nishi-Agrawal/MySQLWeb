use mysqlweb;
CREATE table usertable (
	id int PRIMARY KEY AUTO_INCREMENT,
    username varchar(15) NOT NULL,
    password varchar(20) NOT NULL,
    email varchar(50) UNIQUE NOT NULL,
    status char,
    activation_key varchar(15),
    forgot_key varchar(15),
    first_name varchar(20),
    last_name varchar(20),
    gender char,
    age int,
    create_date TIMESTAMP,
    activation_date TIMESTAMP,
    CONSTRAINT checking_username CHECK(LENGTH(username) >= 5),
    CONSTRAINT check_password CHECK(LENGTH(password) >= 8)
    );
    
SELECT * FROM usertable;
insert into usertable(username, password, email)
values( 'nishi', 'Nishisjsjdwj', 'nishi12');

delete from usertable where id=1;
