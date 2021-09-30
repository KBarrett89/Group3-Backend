drop table if exists vehicle_registration CASCADE;
drop table if exists citizen CASCADE;
drop table if exists subscriber_records CASCADE;
drop table if exists anprcamera CASCADE;
drop table if exists anprobservations CASCADE;

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

create table citizen (
	citizenID bigint not null primary key,
	forename varchar(100),
	surname varchar(100),
	home_address varchar(100),
	date_of_birth varchar(100),
	place_of_birth varchar(100),
	sex varchar(10)
);

create table subscriber_records (
	forename varchar(100),
	surname varchar(100),
	date_of_birth date,
	address varchar(100),
	phone_number varchar(100) primary key,
	network varchar(100)
);

create table anprcamera (
	anpr_id int not null primary key,
	street_name varchar(100),
	latitude decimal(8, 5),
	longitude decimal(8, 5)
);

create table anprobservations (
	anprpoint_id int,
	time_stamp timestamp(3),
	vehicle_registrationno varchar(100),
	anprcamera_anpr_id int
);
	


