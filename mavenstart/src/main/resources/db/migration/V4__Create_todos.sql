create table todos (
    id int unsigned primary key  auto_increment,
    text varchar(100) not null,
    done bit
);
insert into todos (text, done) values ('Cos do zrobienia 1', 1);
insert into todos (text, done) values ('Cos do zrobienia 2', 0);