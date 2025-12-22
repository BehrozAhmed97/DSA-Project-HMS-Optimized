CREATE DATABASE hospital_db;
USE hospital_db;
CREATE TABLE patients (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    contact VARCHAR(50),
    address VARCHAR(200),
    medical_history TEXT
);

CREATE TABLE doctors (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    contact VARCHAR(50),
    address VARCHAR(200),
    specialization VARCHAR(100)
);

CREATE TABLE appointments (
    id INT PRIMARY KEY,
    patient_id INT,
    doctor_id INT,
    date_time DATETIME,
    FOREIGN KEY (patient_id) REFERENCES patients(id),
    FOREIGN KEY (doctor_id) REFERENCES doctors(id)
);

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,users
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    role VARCHAR(50)
);

CREATE TABLE bills (
    id INT PRIMARY KEY,
    patient_id INT,
    amount DOUBLE,
    description TEXT,
    FOREIGN KEY (patient_id) REFERENCES patients(id)
);

INSERT INTO users (username, password, role) VALUES ('admin', 'admin123', 'ADMIN');

ALTER TABLE appointments
ADD patient_name VARCHAR(100),
ADD doctor_name VARCHAR(100);
UPDATE appointments a
JOIN patients p ON a.patient_id = p.id
JOIN doctors d ON a.doctor_id = d.id
SET a.patient_name = p.name,
    a.doctor_name = d.name;
    
ALTER TABLE bills
ADD patient_name VARCHAR(100);
UPDATE bills b
JOIN patients p ON b.patient_id = p.id
SET b.patient_name = p.name;

