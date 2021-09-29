insert into `vehicle_registration` 
	(`registrationid`, `registration_date`, `vehicle_registrationno`, `make`, `model`, `colour`, `forename`, `surname`, `address`, `date_of_birth`, `driver_licenceid`) 
values 
	('1', '2000-01-01', '1QW1 234', 'Audi', 'A5', 'Black', 'Jon', 'Smith', '13 Baker Street', '2002-01-01', '300201');

insert into `citizen`
        (`citizenid`, `place_of_birth`, `forename`, `surname`, `date_of_birth`, `home_address`, `sex`)
values
        ('1', 'London', 'Joan', 'Wills', '2000-05-01', '120B Finchley Road', 'Female'),
	('2', 'London', 'Jon', 'Smith', '2002-01-01', '13 Baker Street', 'Male');

insert into `Subscriber_Records`
        (`phone_number`, `forename`, `surname`, `date_of_birth`, `address`, `network`)
values
        ('07924332432', 'Jon', 'Smith', '2002-01-01', '13 Baker Street', 'Vodafone');

insert into `ANPRCamera`
        (`anpr_Id`, `street_name`, `latitude`, `longitude`)
values
        ('1', 'Watling Street', '90.78', '654.89'),
	('2', 'Edgware road', '100.78', '667.5');

insert into `ANPRObservations`
        (`anprpoint_id`, `time_stamp`, `vehicle_registrationno`, `anprcamera_anpr_id`)
values
        ('1', '2020-05-12T18:04:23+00:00', '1QW1 234', '1'),
	('2', '2020-05-12T18:15:26+00:00', 'WE23 335', '1'),
	('3', '2020-05-12T18:34:27+00:00', '1QW1 234', '1'),
	('4', '2020-05-12T18:37:28+00:00', 'ER45 456', '1'),
	('5', '2020-05-12T18:45:29+00:00', '1QW1 234', '1');

SELECT * FROM VEHICLE_REGISTRATION;
SELECT * FROM CITIZEN;
SELECT * FROM SUBSCRIBER_RECORDS;
SELECT * FROM ANPROBSERVATIONS;
SELECT * FROM ANPRCAMERA;
