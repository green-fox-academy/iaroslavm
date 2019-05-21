create database movieDB;
use movieDB;
create table movies(
id int auto_increment primary key,
title varchar(30) not null,
year int not null,
director varchar(30) not null,
actor varchar(30) not null
);
create table reviewers(
rid int auto_increment primary key,
name varchar(30) not null,
rating int,
date date,
mid int not null,
FOREIGN KEY (mid) REFERENCES movies(id)
);
show databases;
insert into movies (title,year,director,actor) 
values ("Good movie", 2001,"Good Boy","Salmon of Doubt"),
("So so movie", 2011,"Good Boy","Salmon of Doubt"),
("Ok movie", 1999,"Great Boy","Cheese Gouda"),
("Good movie 2", 2002,"Other Guy","Salmon of Doubt"),
("Ok movie 2", 2001,"Great Boy","Cheese Gouda"),
("Awesome movie", 2010,"Yet Another Boy","Salmon of Doubt"),
("Awesome movie 2", 2012,"Yet Another Boy","Salmon of Doubt"),
("Old movie", 1995,"Yet Another Boy","Cheese Gouda"),
("Very Old movie", 1995,"Yet Another Boy","Cheese Gouda");

select * from movies order by year desc;
update movies set year=1990 where id=9;
SET SQL_SAFE_UPDATES = 0;

insert into reviewers(name,rating, date, mid)
values("Just Movie Reviewer", 5, "2005-08-22",9),
("Movie Reviewer", 5, "2005-08-22",7),
("First Movie Reviewer", 5, "2001-05-22",4),
("Ultimate Movie Reviewer", 5, "2005-08-21",4),
("The Movie Reviewer", 5, "2005-08-22",3),
("Another Movie Reviewer", 5, "2005-08-22",6),
("Another Movie Reviewer", 5, "2005-08-22",5),
("Another Movie Reviewer", 5, "2005-08-22",2),
("Just Movie Reviewer", 5, "2015-08-22",2),
("Fast Movie Reviewer", 5, "2001-08-22",3),
("Ultimate Movie Reviewer", 5, "1999-08-22",2),
("Ultimate Movie Reviewer", 5, "1999-08-22",7),
("Fast Movie Reviewer", 5, "1999-08-22",7),
("Kosher Movie Reviewer", 5, "1999-08-22",2),
("Furious Movie Reviewer", 5, "2005-08-22",2),
("Kosher Movie Reviewer", 5, "2010-08-22",2),
("Kosher Movie Reviewer", 5, "2015-08-22",3),
("Just Movie Reviewer", 5, "1999-08-22",8),
("Another Movie Reviewer", 5, "1998-08-22",8),
("Furious Movie Reviewer", 5, "1998-08-22",9);

select * from reviewers;

select movies.title, reviewers.name from movies, reviewers where movies.id=reviewers.mid and reviewers.name="Kosher Movie Reviewer";
select movies.title, movies.director, movies.year from movies where movies.actor="Cheese Gouda" or movies.actor="Salmon of Doubt" order by movies.year asc;

