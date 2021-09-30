drop table if exists vehicle_registration CASCADE;

create table vehicle_registration
(
	registrationid integer not null primary key, 
	registration_date varchar(100), 
	vehicle_registrationno varchar(100),
	car_make varchar(100),
	car_model varchar(100),
	car_colour varchar(100),
	forename varchar(100),
	surname varchar(100),
	address varchar(100),
	date_of_birth varchar(100),
	driver_licenseid varchar(100)
);