/*----------------------------------------------------------------------------------
Filename			: tmdpbo.sql
Programer			: Reinaldy Rahmadian
Date    			: 2016/04/29
Email				: Reinaldy.Rahmadian@gmail.com
Deskripsi			: basis data
----------------------------------------------------------------------------------*/


create database tmdpbo; --nama database
use tmdpbo; --gunakan database

/*buat tabel tenergi*/
create table tenergi(
	username varchar(200) primary key,
	energi varchar(100) not null
);