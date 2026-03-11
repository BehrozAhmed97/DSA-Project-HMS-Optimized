🏥 Hospital Management System – Optimized (DSA Project)










📌 Project Overview

The Hospital Management System – Optimized is a Java-based console application developed as part of the Data Structures and Algorithms (DSA) course.

The project simulates core hospital operations while focusing on efficient data handling using advanced data structures and algorithms.

The system supports:

👨‍⚕️ Doctor Management

🧑‍🤝‍🧑 Patient Management

📅 Appointment Scheduling

🚑 Priority-Based Patient Handling

🔍 Searching and Sorting of Records

⚠️ Exception Handling and Data Validation

Unlike commercial hospital systems that focus on graphical interfaces, this project emphasizes algorithmic efficiency and data organization.

🔗 Related Project (Previous Version)

This repository is the optimized version of a previous Hospital Management System developed during my Object-Oriented Programming (OOP) course.

Previous Project:
👉 https://github.com/BehrozAhmed97/OOP-Project-Hospital-Management-System

Key Difference
Feature	OOP Version	DSA Optimized Version
Focus	OOP Design	Algorithm Optimization
Data Storage	Lists	AVL Trees + Lists
Scheduling	Basic Queue	Priority Circular Queue
Searching	Linear Search	Logarithmic + Linear
Performance	Moderate	Optimized
Structure	Object-Oriented	OOP + DSA Integrated

This project enhances the previous system by introducing efficient algorithms and scalable data structures.

⚙️ System Architecture

The system follows a layered modular architecture to ensure maintainability and separation of concerns.

                +----------------------+
                |        View          |
                |  (Console Interface) |
                +----------+-----------+
                           |
                           v
                +----------------------+
                |      Controller      |
                |  Business Logic +    |
                |  DSA Implementations |
                +----------+-----------+
                           |
                           v
                +----------------------+
                |        Model         |
                |  Patient / Doctor /  |
                |  Appointment / Bill  |
                +----------+-----------+
                           |
                           v
                +----------------------+
                |      Exceptions      |
                |   Error Handling     |
                +----------------------+
🧠 Data Structures Used

This system integrates multiple DSA concepts to improve efficiency.

Data Structure	Usage
AVL Tree	Efficient storage and searching of records
Circular Queue	Priority-based patient scheduling
Lists (ArrayList / LinkedList)	Store doctors, patients, appointments
Sorting Algorithms	Organize system records
Searching Algorithms	Retrieve specific data efficiently
⚡ Algorithm Complexity
Operation	Data Structure	Time Complexity
Insert Patient	AVL Tree	O(log n)
Search Patient	AVL Tree	O(log n)
Add Appointment	List	O(n)
Priority Scheduling	Circular Queue	O(1)
Sorting Records	Bubble Sort	O(n²)

This allows the system to demonstrate practical applications of algorithm analysis.

🚀 Core Features
👤 Patient Management

Add new patients

Store patient information

Search patients by ID

Maintain patient records

👨‍⚕️ Doctor Management

Store doctor details

Retrieve doctor records

Organize doctor information

📅 Appointment System

Connect patients with doctors

Store appointment details

Maintain appointment history

🚑 Priority Patient Scheduling

Emergency cases are handled first using priority-based queue logic.

Priority Levels:

High Priority   → Emergency patients
Medium Priority → Urgent cases
Low Priority    → Normal patients

This simulates real hospital triage systems.

🔍 Searching Mechanisms

Different search strategies are used depending on the underlying structure:

Structure	Search Method
AVL Tree	Logarithmic Search
Lists	Linear Search

This helps demonstrate performance differences between data structures.

🔃 Sorting Implementation

The project uses Bubble Sort to organize records such as:

Patient lists

Doctor records

Appointment data

Although Bubble Sort is not optimal for large systems, it was chosen to clearly demonstrate comparison-based sorting algorithms.

📂 Project Structure
HospitalManagementSystem
│
├── controller
│   ├── PatientController
│   ├── DoctorController
│   ├── AppointmentController
│   └── BillingController
│
├── model
│   ├── Person
│   ├── Patient
│   ├── Doctor
│   ├── Appointment
│   ├── Bill
│   └── User
│
├── view
│   └── Console UI
│
├── exceptions
│   ├── InvalidInputException
│   └── DatabaseException
│
└── Hospital.java (Main Entry Point)
⚠️ Exception Handling

Custom exception classes ensure robust error handling.

Examples:

InvalidInputException

DatabaseException

These help prevent runtime crashes and maintain system stability.

💾 Database Role

The database is used only for data persistence.

Important Design Choice:

All sorting, searching, and scheduling operations are performed using Java data structures instead of SQL queries.

This ensures the project remains algorithm-focused.

✅ Advantages

✔ Efficient record management using AVL Trees
✔ Priority-based patient scheduling
✔ Clear separation of system components
✔ Demonstrates real-world DSA usage
✔ Strong integration of OOP and DSA principles

⚠️ Limitations

Console-based interface

Bubble Sort not optimal for large datasets

Single-threaded execution

Limited scalability for enterprise-level hospitals

These limitations are acceptable since the project is focused on academic DSA learning.

🔮 Future Enhancements

Possible improvements include:

Implement Heap-based Priority Queue

Replace Bubble Sort with Merge Sort or Quick Sort

Use Hash Tables for faster searching

Add Graph-based hospital navigation

Develop GUI interface (JavaFX / Swing)

Introduce multi-threading for concurrency

Add REST API integration

🛠 Technologies Used
Category	Technology
Language	Java
Paradigm	Object Oriented Programming
Algorithms	Data Structures & Algorithms
Development	IntelliJ IDEA / Eclipse
Version Control	Git & GitHub
👥 Contributors

Behroz Ahmed

Sameer Hayat

Niaz Ahmed Abbasi

📚 Learning Outcomes

This project demonstrates how Data Structures and Algorithms can solve real-world system problems.

Through the use of AVL Trees, Circular Queues, Searching, and Sorting algorithms, the system provides an educational example of efficient algorithm-driven software design.
