drop table if exists vehicle_registration CASCADE;
drop table if exists citizen CASCADE;
drop table if exists subscriber_records CASCADE;
drop table if exists anprobservations CASCADE;
drop table if exists anprcamera CASCADE;

create table vehicle_registration
(
	registrationid integer not null primary key, 
	registration_date varchar(100), 
	vehicle_registrationno varchar(100),
	make varchar(100),
	model varchar(100),
	colour varchar(100),
	forename varchar(100),
	surname varchar(100),
	address varchar(100),
	date_of_birth varchar(100),
	driver_licenceid varchar(100)
);

create table citizen
(
	citizenid bigint not null primary key,
	forename varchar(100),
	surname varchar(100),
	home_Address varchar(100),
	date_Of_Birth date,
	place_Of_Birth varchar(100),
	sex varchar(10)
);

create table subscriber_records
(
	forename varchar(100),
	surname varchar(100),
	date_Of_Birth date,
	address varchar(100),
	phone_Number varchar(100) primary key,
	network varchar(100)
);

create table anprcamera
(
	anpr_Id int not null primary key,
	street_Name varchar(100),
	latitude decimal(18, 5),
	longitude decimal(19, 8)
);

create table anprobservations
(
	anprpoint_id int,
	time_stamp timestamp(3),
	vehicle_RegistrationNo varchar(100),
	anprcamera_anpr_id int
);
	
	
	
	
