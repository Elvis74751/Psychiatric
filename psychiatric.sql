-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2023 at 12:21 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `psychiatric`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateSalary` (IN `param1` CHAR(4))   Begin 
	UPDATE department 
	Set yearly_expenses = (SELECT SUM(yearly_salary)
				    FROM payroll
				    WHERE department_id LIKE param1)
	WHERE department_id LIKE param1;
	
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `department_id` char(4) NOT NULL,
  `department_name` char(50) DEFAULT NULL,
  `department_head` char(35) DEFAULT NULL,
  `Yearly_Expenses` decimal(15,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`department_id`, `department_name`, `department_head`, `Yearly_Expenses`) VALUES
('AD23', 'Adult Impatient Department', 'Selena Rodriguez', '52000.00'),
('AD78', 'Administration Department', 'Matthew Pitt', '96000.00'),
('EOD8', 'Eating Order Department', 'Jasper Cage', '90000.00'),
('ET98', 'Education and training', 'April Ludgate', '87000.00'),
('FS64', 'Family services', 'Claudia Ornelas', '76000.00'),
('FSD4', 'Food Services Department', 'Israel Pacheco', '60000.00'),
('OPD4', 'Outpatient Department', 'Omar Del Cruz', '150000.00'),
('PDE0', 'Psychiatric Emergency department', 'Asia Ustayev', '200000.00'),
('SAE2', 'Substance Abuse and Addiction Department', 'Melanie Rameriez', '100000.00'),
('TP90', 'Therapy and psychiatry', 'Ron Swanson', '90000.00');

-- --------------------------------------------------------

--
-- Table structure for table `lab`
--

CREATE TABLE `lab` (
  `lab_id` char(6) NOT NULL,
  `patient_id` char(6) DEFAULT NULL,
  `staff_id` char(6) DEFAULT NULL,
  `lab_date` date DEFAULT NULL,
  `test_type` varchar(150) DEFAULT NULL,
  `patient_weight` varchar(7) DEFAULT NULL,
  `patient_height` varchar(7) DEFAULT NULL,
  `patient_blood_pressure` varchar(7) DEFAULT NULL,
  `conclusion` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lab`
--

INSERT INTO `lab` (`lab_id`, `patient_id`, `staff_id`, `lab_date`, `test_type`, `patient_weight`, `patient_height`, `patient_blood_pressure`, `conclusion`) VALUES
('BWAWEK', 'ZK54ML', 'EM048J', '2023-03-27', 'General, STI, and Complete Blood Count', '176.20', '5’7', '140/100', 'Patient has a high blood pressure and tested positive for chlamydia.'),
('BWDKSA', 'ZRS56S', 'EM894J', '2023-03-28', 'General, Pregnancy, STI, and Complete Blood Count', '180.23', '5’6', '120/80', 'Patient came back with normal blood pressure and her results for her pregnancy, drugs, and STI came negative. She had a low level of vitamin D and appeared to be anemic.'),
('BWDLXO', 'ZIJ12K', 'EM79F0', '2023-03-20', 'General, Pregnancy, STI, and Complete Blood Count', '201.88', '6’2', '140/90', 'Patients blood pressure was very high, but all other results came back in the normal range.'),
('BWGNMY', 'ZO21K9', 'EM79F0', '2023-01-04', 'General, STI, and Complete Blood Count', '256.90', '6’5', '126/82', 'Patient has a slightly elevated blood pressure level and tested negative for any STIs.'),
('BWIDKS', 'ZLG89T', 'EM1278', '2023-04-03', 'General, STI, and Complete Blood Count', '128.45', '5’5', '140/85', 'Patients blood pressure was high for age, weight, and height. aDoctor will consult him, all other blood work was satisfactory'),
('BWJFOV', 'ZKT77J', 'EM135K', '2023-04-02', 'General, STI, and Complete Blood Count', '175.98', '5’10', '110/80', 'Patient tested positive for chlamydia but negative for everything else. Appears to be in good health.'),
('BWKGLO', 'ZQK23H', 'EM890G', '0000-00-00', 'General, STI, and Complete Blood Count', '123.54', '5’2', '110/70', 'Patient showed healthy ranges in all results'),
('BWOKFP', 'Z408HJ', 'EM12P9', '2023-03-13', 'General, Pregnancy, STI, and Complete Blood Count', '180.66', '6’4', '130/87', 'Patients blood pressure was higher than recommended, doctor was consulted and patient informed. Patient also tested positive for pregnancy, 4 weeks along.'),
('BWQUSD', 'ZLO23Q', 'EMG39X', '2023-03-30', 'General, Pregnancy, STI, and Complete Blood Count', '110.06', '4’11', '110/70', 'Patients blood work showed that her iron was low, blood pressure is normal and all other blood work came back normal.'),
('BWSDAL', 'ZILG25', 'EMK12E', '2023-02-07', 'General, Pregnancy, STI, and Complete Blood Count', '132.60', '5’0', '90/80', 'Patients blood pressure and all other bloodwork came back normal, no concerns besides a slightly  low vitamin c level.');

-- --------------------------------------------------------

--
-- Table structure for table `medication`
--

CREATE TABLE `medication` (
  `med_id` char(8) NOT NULL,
  `med_name` char(15) DEFAULT NULL,
  `med_type` char(15) DEFAULT NULL,
  `med_price` decimal(3,2) DEFAULT NULL,
  `med_brand` char(15) DEFAULT NULL,
  `med_decription` char(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medication`
--

INSERT INTO `medication` (`med_id`, `med_name`, `med_type`, `med_price`, `med_brand`, `med_decription`) VALUES
('ZO2390FD', 'Aripiprazole', 'antipsychotic', '1.20', 'Abilify', 'Abilify is used to treat depression, bipolar, and schizophrenia when taken with other medications'),
('ZO242389', 'Sertraline', 'antidepressant', '0.89', 'Zoloft', 'Used to treat anxiety, depression, and OCD'),
('ZO323432', 'Lithium', 'Mood Stabilizer', '0.97', 'Eskalith', 'Lithium can reduce the severity/frequency of manic episodes and help treat bipolar disorder'),
('ZO32WR8E', 'Quetiapine', 'Antipsychotic', '2.40', 'seroquel', 'Quetiapine can help with depression, bipolar disorder, and schizophrenia'),
('ZO3820JI', 'Bupropion', 'Antidepressant', '2.75', 'Wellbutrin', 'bupropion is used to help treat depression and help people to quit smoking'),
('ZO4439FD', 'Lorazepam', 'Anxiolytic', '1.50', 'Ativan', 'Lorazepam can help with insomnia, seizures, and anxiety disorder'),
('ZO473HG8', 'Alprazolam', 'Anxiolytic', '1.20', 'Xanax', 'Alprazolam can be used to help with anxiety, depression, and panic disorder'),
('ZO850GD0', 'Fluoxetine', 'Antidepressant', '2.00', 'Prozac', 'Fluoxetine can help with OCD, panic disorder, and depression'),
('ZO89SW2M', 'Risperidone', 'Antipsychotic', '2.80', 'Risperdal', ' Risperidone is used to help treat bipolar disorder, schizophrenia, and help treat irritability for those in the autism spectrum.'),
('ZONOU89D', 'Valproic Acid', 'Mood Stabilizer', '2.50', 'Depakote', 'Valproic acis is used to help with migraines, bipolar disorder, and epilepsy');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patient_id` char(6) NOT NULL,
  `patient_address` varchar(150) DEFAULT NULL,
  `patient_last` varchar(25) DEFAULT NULL,
  `patient_first` varchar(25) DEFAULT NULL,
  `patient_ssn` decimal(9,0) DEFAULT NULL,
  `patient_phone` decimal(10,0) DEFAULT NULL,
  `patient_gender` char(1) DEFAULT NULL CHECK (`patient_gender` = 'M' or `patient_gender` = 'F'),
  `patient_dob` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patient_id`, `patient_address`, `patient_last`, `patient_first`, `patient_ssn`, `patient_phone`, `patient_gender`, `patient_dob`) VALUES
('Z408HJ', '2641 Jerome Ave Bronx NY 10468', 'Robles', 'Mary', '201187354', '7184508388', 'M', '1975-05-07'),
('ZIJ12K', '1536 Deer pk ave Deer Park NY 11729', 'Peterson', 'Abigail', '30221888', '6312421996', 'F', '1993-11-11'),
('ZILG25', '171 1st ave New York NY 10003', 'Smith', 'Jane', '25449009', '7182032189', 'F', '1984-05-17'),
('ZK54ML', '6 Suydam St, Brooklyn, NY 11221', 'Smith', 'John', '209755776', '9172621171', 'M', '1996-09-09'),
('ZKT77J', '14 Wall Street , New York, NY, 10005', 'Clark', 'Kent', '67378446', '6468580229', 'M', '1986-05-06'),
('ZLG89T', '36 E 81St, New York NY 10028', 'Egan', 'Patrick', '120645511', '5087679223', 'M', '1991-01-08'),
('ZLO23Q', '50 creek stone circle San Jose 95035', 'Thorne', 'Amy', '98776000', '7189022345', 'F', '1988-10-20'),
('ZO21K9', '139 Smith St, Brooklyn, NY 11201', 'Jones', 'Jay', '622880447', '3476768890', 'M', '1986-12-28'),
('ZQK23H', '35 61st St Queens NY 11377', 'Winchester', 'Dean', '102776800', '7185930264', 'M', '1968-03-30'),
('ZRS56S', '100 Henry street, Brooklyn, ny, 11201', 'Nguyen', 'Hannah', '465772115', '4082621171', 'F', '1992-04-02');

-- --------------------------------------------------------

--
-- Table structure for table `patient_report`
--

CREATE TABLE `patient_report` (
  `Report_id` char(9) NOT NULL,
  `patient_id` char(6) DEFAULT NULL,
  `summary` varchar(300) DEFAULT NULL,
  `safety_comments` varchar(300) DEFAULT NULL,
  `goal_plan` varchar(300) DEFAULT NULL,
  `diagnosis` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient_report`
--

INSERT INTO `patient_report` (`Report_id`, `patient_id`, `summary`, `safety_comments`, `goal_plan`, `diagnosis`) VALUES
('PSY5630NO', 'ZLG89T', 'patient is a 32 year old  man who was admitted after punching a cop while intoxicated at a bar, ex - military.', 'Patient has no safety concerns, he calmed down after sobering up but has a history of drunken arrests.', 'His goal is to increase his coping skills to deescalate before he erupts.', 'Show signs of PTSD'),
('PSY649AUM', 'Z408HJ', 'patient is a 48 year old mother of two who tried to commit suicide. Patient was found by her husband and attempted to overdose on sleeping medication. Patient has a history of previous hospitalizations.', 'patient is currently not a harm to self', 'patients goal plan is to learn how to deal with intrusive thoughts and depressive episodes.', 'patient has been diagnosed with anxiety, depression, and ptsd'),
('PSY746XZC', 'ZRS56S', ' patient is a 31 year old female who was admitted after being found wandering through traffic, talking to themselves.', 'Patient had to be restrained after trying to attack responding officer.', ' patience call plan was to minimize the number of times they explode and scream.', ' patient is mentally unstable and show signs of schizophrenia.'),
('PSY858EHB', 'ZILG25', 'patient is a 39 year old female that was self admitted after calling the suicide prevention line. She expressed intrusive thoughts and the desire to end her life. She says its something shes dealt with for year and has reached her ending point.', 'patient needs extra monitoring, has bitten herself and used a stolen pencil to try and self-harm.', 'patients goal plan is to learn coping skills to decrease the number of times she wants to kill herself and get help for her condition.', 'patient has been diagnosed with depressive tendencies.'),
('PSY9023BU', 'ZKT77J', ' patient is a 37 year old man who appears to be suffering a mental break due to work stress.', ' patient has no ongoing safety concerns at the time.', ' call plan is to increase coping skills to reduce the likelihood of escalation.', ' diagnosis is overwhelming stress, duty job. I Need to rest for a few days.'),
('PSY950BPW', 'ZQK23H', 'patient is a 55 year old man who was admitted after threatening to hurt his ex-wifes new boyfriend. Patient showed up to his place of work multiple times and harassed him. He threatened to show up with a gun.', 'patient got violent with the nurses and had to be restrained. Proceed with caution.', 'patient currently has no goal plan and has been uncooperative for attending meetings.', 'patient has previous diagnosis of bipolar disorder'),
('PSY959VRX', 'ZO21K9', 'patient is a 37 year old man who was admitted after jumping off the brooklyn bridge after an attempted suicide. He was cleared after staying a few days in the emergency room then sent to the psychiatric unit.', 'patient has no current safety comments or issues.', 'patients goal plan is to deal with depression and consistently take medication.', 'patient was diagnosed with depression and bipolar disorders'),
('PSYLQL38Z', 'ZK54ML', 'patient is a 27 year old man who was admitted after trying to attack his mother after a bad episode.', 'patient is a possible danger to himself, he keeps expressing the desire to injure himself.', 'patients goal plan is to build the coping skills needed to regulate behavior and deal with intrusive thoughts', 'patient has been diagnosed with PTSD, depression, and anxiety'),
('PSYTB783Q', 'ZIJ12K', 'patient is a 30 year old female who was admitted after her roommate came home and found her hanging from the ceiling.Patient was in intensive unit for two weeks before being sent to the psychiatric unit.', 'patient has no current safety comments', 'patient has not conducted or has attended any therapy groups', 'patient has refused to meet with the doctor and has no diagnosis besides possibly depression.'),
('PSYWOD52', 'ZLO23Q', 'patient is a 35 year old female who was admitted after her husband noticed self-inflicted cuts on her forearm and wrists.', 'patient is currently not a danger to herself or others', 'patients goal plan is to learn how to ask for help when she feels overwhelmed and recognize patterns in her thoughts.', 'patient has previous diagnosis of suicidal thoughts and anxiety');

-- --------------------------------------------------------

--
-- Table structure for table `payroll`
--

CREATE TABLE `payroll` (
  `position_id` char(6) NOT NULL,
  `department_id` char(4) DEFAULT NULL,
  `staff_id` char(6) DEFAULT NULL,
  `Yearly_Salary` decimal(10,2) DEFAULT NULL,
  `position_title` char(40) DEFAULT NULL,
  `bonus` decimal(6,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payroll`
--

INSERT INTO `payroll` (`position_id`, `department_id`, `staff_id`, `Yearly_Salary`, `position_title`, `bonus`) VALUES
('AD32', 'AD23', 'EM894J', '52000.00', 'Registered Nurse', '1000.00'),
('AD99', 'AD78', 'EM12P9', '96000.00', 'Administrative Director', '2000.00'),
('EOD9', 'EOD8', 'EM1278', '90000.00', 'Nutritionist and Diet Specialist', '3500.00'),
('ET5K', 'ET98', 'EM890G', '87000.00', 'Supervising Manager', '3000.00'),
('FS88', 'FS64', 'EM79F0', '76000.00', 'Care Coordinator', '2750.00'),
('FSD7', 'FSD4', 'EMG39X', '60000.00', 'Chief', '2500.00'),
('OPE4', 'OPD4', 'EM183D', '150000.00', 'Doctor', '3000.00'),
('PD6H', 'PDE0', 'EMK12E', '200000.00', 'Psychiatrist', '5000.00'),
('SA34', 'SAE2', 'EM135K', '100000.00', 'Behavior Specialist', '2000.00'),
('TP23', 'TP90', 'EM048J', '90000.00', 'Behavioral Counselor', '3000.00');

--
-- Triggers `payroll`
--
DELIMITER $$
CREATE TRIGGER `update_deaprtment_expenses` BEFORE INSERT ON `payroll` FOR EACH ROW BEGIN
	If New.department_id IS NOT NULL THEN
		UPDATE department 
		SET yearly_expenses = yearly_expenses + new.yearly_salary 
		WHERE department_id = new.department_id; 
	END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update_deaprtment_expenses2` BEFORE DELETE ON `payroll` FOR EACH ROW BEGIN
	If old.department_id IS NOT NULL THEN
		UPDATE department 
		SET yearly_expenses = yearly_expenses - old.yearly_salary 
		WHERE department_id = old.department_id; 
	END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `prescription`
--

CREATE TABLE `prescription` (
  `med_id` char(8) DEFAULT NULL,
  `patient_id` char(6) DEFAULT NULL,
  `staff_id` char(6) DEFAULT NULL,
  `Date_prescribed` date DEFAULT NULL,
  `dosage` decimal(3,2) DEFAULT NULL,
  `refill_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prescription`
--

INSERT INTO `prescription` (`med_id`, `patient_id`, `staff_id`, `Date_prescribed`, `dosage`, `refill_date`) VALUES
('ZO242389', 'ZRS56S', 'EM894J', '2023-03-27', '2.50', '2023-03-29'),
('ZO2390FD', 'ZKT77J', 'EM183D', '2023-04-02', '9.99', '2023-04-03'),
('ZO4439FD', 'ZLG89T', 'EM135K', '2023-04-03', '3.00', '2023-04-07'),
('ZO323432', 'Z408HJ', 'EM1278', '2023-03-13', '5.00', '2023-04-11'),
('ZO850GD0', 'ZQK23H', 'EMK12E', '2023-05-01', '9.99', '2023-05-03'),
('ZO32WR8E', 'ZLO23Q', 'EM12P9', '2023-03-29', '9.99', '2023-04-01'),
('ZO473HG8', 'ZIJ12K', 'EM890G', '2023-03-21', '2.00', '2023-03-29'),
('ZONOU89D', 'ZILG25', 'EM048J', '2023-03-07', '9.99', '2023-03-21'),
('ZO3820JI', 'ZO21K9', 'EM79F0', '2023-04-01', '9.99', '2023-04-08'),
('ZO89SW2M', 'ZK54ML', 'EMG39X', '2023-03-28', '5.00', '2023-04-02');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `room_num` decimal(4,0) NOT NULL,
  `room_type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`room_num`, `room_type`) VALUES
('1000', 'Intake'),
('1029', 'patient room'),
('1030', 'patient room'),
('1033', 'patient room'),
('1035', 'patient room'),
('1042', 'patient room'),
('1048', 'patient room'),
('1049', 'patient room'),
('1075', 'Group Therapy'),
('2000', 'Psychiatry Office');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staff_id` char(6) NOT NULL,
  `staff_dob` date DEFAULT NULL,
  `staff_last` varchar(25) DEFAULT NULL,
  `staff_first` varchar(25) DEFAULT NULL,
  `staff_ssn` decimal(9,0) DEFAULT NULL,
  `staff_phone` decimal(10,0) DEFAULT NULL,
  `Staff_address` varchar(150) DEFAULT NULL,
  `degree_number` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staff_id`, `staff_dob`, `staff_last`, `staff_first`, `staff_ssn`, `staff_phone`, `Staff_address`, `degree_number`) VALUES
('EM048J', '1968-05-07', 'Hulse', 'Jasmine', '98401478', '6462190752', '1220 Fifth Ave New York, NY 10029', '9075663428'),
('EM1278', '0000-00-00', 'Patel', 'Hamza', '959112049', '6468905121', ' 30 Nostrand Ave Brooklyn, NY  11205', '4860489021'),
('EM12P9', '1993-12-30', 'Pascarella', 'Joseph', '829550412', '9178543290', '24 Metropolitan Ave Kew Gardens, NY  11415', '3859090345'),
('EM135K', '1998-01-14', 'Soto', 'Aaron', '103449205', '7184720993', '14 Cobble Hill Brooklyn, NY', '2840248902'),
('EM183D', '1986-11-07', 'Hernandez', 'Lissie', '292553393', '2129503348', '401 Bleecker St New York, NY 10014', '4960382903'),
('EM79F0', '1980-08-27', 'Roberts', 'John', '830133594', '7456323234', '355 W 46th St New York, NY 10036', '3890875462'),
('EM890G', '1983-08-07', 'Hanks', 'Maria', '934331034', '7182345909', '590 Grand Concourse Bronx, NY 10451', '1350093849'),
('EM894J', '1974-03-24', 'Chen', 'Wendy', '48312494', '7189235629', '205 E Houston St New York, NY 10000', '1045790234'),
('EMG39X', '2002-12-19', 'Rodriguez', 'Fransisco', '830849202', '8147320941', '72 Henry St Brooklyn, NY 11201', '9027472839'),
('EMK12E', '2000-02-02', 'Burke', 'Emily', '395001245', '2124589063', '1650 Bedford Ave Brooklyn, NY 11225', '8493023042');

-- --------------------------------------------------------

--
-- Table structure for table `stay`
--

CREATE TABLE `stay` (
  `patient_id` char(6) DEFAULT NULL,
  `room_num` decimal(4,0) DEFAULT NULL,
  `date_in` date DEFAULT NULL,
  `Date_out` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stay`
--

INSERT INTO `stay` (`patient_id`, `room_num`, `date_in`, `Date_out`) VALUES
('ZRS56S', '1029', '2023-03-26', '2023-04-11'),
('ZKT77J', '1030', '2023-04-01', '2023-04-13'),
('ZLG89T', '1030', '2023-04-03', '2023-04-20'),
('Z408HJ', '1033', '2023-03-13', '2023-04-01'),
('ZLO23Q', '1033', '2023-03-29', '2023-04-12'),
('ZIJ12K', '1049', '2023-03-20', '2023-04-09'),
('ZILG25', '1049', '2023-03-06', '2023-04-14'),
('ZO21K9', '1048', '2023-04-01', '2023-04-11'),
('ZK54ML', '1042', '2023-03-27', '2023-04-21'),
('ZQK23H', '1029', '2023-04-30', '2023-05-10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`department_id`);

--
-- Indexes for table `lab`
--
ALTER TABLE `lab`
  ADD PRIMARY KEY (`lab_id`),
  ADD KEY `patient_id` (`patient_id`),
  ADD KEY `staff_id` (`staff_id`);

--
-- Indexes for table `medication`
--
ALTER TABLE `medication`
  ADD PRIMARY KEY (`med_id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patient_id`);

--
-- Indexes for table `patient_report`
--
ALTER TABLE `patient_report`
  ADD PRIMARY KEY (`Report_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indexes for table `payroll`
--
ALTER TABLE `payroll`
  ADD PRIMARY KEY (`position_id`),
  ADD KEY `department_id` (`department_id`),
  ADD KEY `staff_id` (`staff_id`);

--
-- Indexes for table `prescription`
--
ALTER TABLE `prescription`
  ADD KEY `med_id` (`med_id`),
  ADD KEY `patient_id` (`patient_id`),
  ADD KEY `staff_id` (`staff_id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_num`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indexes for table `stay`
--
ALTER TABLE `stay`
  ADD KEY `patient_id` (`patient_id`),
  ADD KEY `room_num` (`room_num`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `lab`
--
ALTER TABLE `lab`
  ADD CONSTRAINT `lab_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`),
  ADD CONSTRAINT `lab_ibfk_2` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

--
-- Constraints for table `patient_report`
--
ALTER TABLE `patient_report`
  ADD CONSTRAINT `patient_report_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`);

--
-- Constraints for table `payroll`
--
ALTER TABLE `payroll`
  ADD CONSTRAINT `payroll_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`),
  ADD CONSTRAINT `payroll_ibfk_2` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

--
-- Constraints for table `prescription`
--
ALTER TABLE `prescription`
  ADD CONSTRAINT `prescription_ibfk_1` FOREIGN KEY (`med_id`) REFERENCES `medication` (`med_id`),
  ADD CONSTRAINT `prescription_ibfk_2` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`),
  ADD CONSTRAINT `prescription_ibfk_3` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

--
-- Constraints for table `stay`
--
ALTER TABLE `stay`
  ADD CONSTRAINT `stay_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`),
  ADD CONSTRAINT `stay_ibfk_2` FOREIGN KEY (`room_num`) REFERENCES `room` (`room_num`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
