create database PF

use PF 

create table Users(
Id_Nombre int primary key identity (1, 1) not null, 
Persona varchar(50) not null, 
Puntaje varchar (50) not null 


);