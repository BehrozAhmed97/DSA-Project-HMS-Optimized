# 🏥 Hospital Management System -- Optimized (DSA Project)

![Java](https://img.shields.io/badge/Language-Java-red)
![DSA](https://img.shields.io/badge/Focus-Data%20Structures%20%26%20Algorithms-blue)
![Architecture](https://img.shields.io/badge/Architecture-Modular-green)
![Status](https://img.shields.io/badge/Project-Academic%20Project-orange)

------------------------------------------------------------------------

# 📌 Project Overview

The **Hospital Management System -- Optimized** is a Java-based console
application developed as part of the **Data Structures and Algorithms
(DSA) course**.

The system simulates real-world hospital operations while focusing on
**efficient data handling using advanced data structures and
algorithms**.

Main features include:

-   Patient Management
-   Doctor Management
-   Appointment Scheduling
-   Priority-Based Patient Handling
-   Searching and Sorting of Records
-   Exception Handling

Unlike commercial hospital systems that emphasize graphical interfaces,
this project focuses on **algorithmic efficiency and structured data
management**.

------------------------------------------------------------------------

# 🔗 Previous Version (OOP Project)

This repository is an **optimized version** of my previous Hospital
Management System built during my **Object-Oriented Programming (OOP)
course**.

Previous Project:
https://github.com/BehrozAhmed97/OOP-Project-Hospital-Management-System

The earlier version mainly focused on:

-   Object-Oriented Design
-   Class Relationships
-   Basic list-based storage
-   Linear searching mechanisms

The new DSA version introduces **optimized data structures and
algorithms to improve system performance and scalability.**

------------------------------------------------------------------------

# ⚙️ Improvements in the DSA Version

## 1. AVL Tree Implementation

The optimized system uses **AVL Trees** for efficient storage and
retrieval of records.

Benefits: - Self-balancing tree - Guaranteed **O(log n)** insertion and
search - Prevents performance degradation as data grows

------------------------------------------------------------------------

## 2. Priority-Based Patient Scheduling

Patient scheduling is implemented using a **Circular Queue with priority
logic**.

Priority Levels:

High Priority → Emergency patients\
Medium Priority → Urgent patients\
Low Priority → Normal cases

This simulates **real hospital triage systems**, ensuring emergency
patients are treated first.

------------------------------------------------------------------------

## 3. Improved Searching Mechanisms

Different search methods are used depending on the data structure:

  Data Structure   Search Method        Complexity
  ---------------- -------------------- ------------
  AVL Tree         Logarithmic Search   O(log n)
  Lists            Linear Search        O(n)

This demonstrates **algorithmic efficiency differences in real-world
systems.**

------------------------------------------------------------------------

# 🧠 Data Structures Used

The following Data Structures and Algorithms are implemented:

-   AVL Tree
-   Circular Queue
-   Lists (ArrayList / LinkedList)
-   Sorting Algorithms
-   Searching Algorithms

------------------------------------------------------------------------

# 🔃 Sorting Implementation

The system currently uses **Bubble Sort** to organize records such as:

-   Patient data
-   Doctor records
-   Appointment information

Although Bubble Sort is not optimal for large datasets, it is
implemented for **educational purposes to demonstrate comparison-based
sorting algorithms.**

------------------------------------------------------------------------

# 📂 Project Structure

HospitalManagementSystem │ ├── controller │ ├── PatientController │ ├──
DoctorController │ ├── AppointmentController │ └── BillingController │
├── model │ ├── Person │ ├── Patient │ ├── Doctor │ ├── Appointment │
├── Bill │ └── User │ ├── view │ └── Console Interface │ ├── exceptions
│ ├── InvalidInputException │ └── DatabaseException │ └── Hospital.java
(Main Entry Point)

------------------------------------------------------------------------

# 🚀 Core Functionalities

## Patient Management

-   Add and manage patient records
-   Search patients by ID
-   Maintain patient history

## Doctor Management

-   Store doctor details
-   Retrieve doctor information

## Appointment System

-   Connect patients with doctors
-   Manage appointment scheduling

## Priority Patient Handling

Emergency patients are automatically served first using queue priority
logic.

------------------------------------------------------------------------

# ⚠️ Exception Handling

Custom exceptions are implemented to maintain system stability.

Examples:

-   InvalidInputException
-   DatabaseException

These ensure proper error handling and prevent runtime failures.

------------------------------------------------------------------------

# 💾 Database Role

The database is used **only for data persistence**.

All scheduling, sorting, and searching operations are handled **inside
Java using data structures instead of SQL queries**, keeping the system
algorithm-focused.

------------------------------------------------------------------------

# ✅ Advantages

-   Efficient record management using AVL Trees
-   Priority-based patient scheduling
-   Modular and maintainable architecture
-   Demonstrates real-world DSA implementation
-   Integration of OOP and DSA concepts

------------------------------------------------------------------------

# ⚠️ Limitations

-   Console-based interface
-   Bubble Sort is inefficient for large datasets
-   Single-threaded execution
-   Limited scalability for enterprise-level hospitals

These limitations are acceptable since the system is designed as an
**academic DSA project.**

------------------------------------------------------------------------

# 🔮 Future Enhancements

Possible improvements include:

-   Implement Heap-based Priority Queue
-   Replace Bubble Sort with Merge Sort or Quick Sort
-   Introduce Hash Tables for faster lookups
-   Add GUI interface using JavaFX or Swing
-   Implement multi-threading
-   Develop REST APIs

------------------------------------------------------------------------

# 🛠 Technologies Used

  Category               Technology
  ---------------------- ------------------------------
  Language               Java
  Programming Paradigm   Object Oriented Programming
  Algorithms             Data Structures & Algorithms
  Development Tools      IntelliJ IDEA / Eclipse
  Version Control        Git & GitHub

------------------------------------------------------------------------

# 👥 Contributors

-   Behroz Ahmed
-   Sameer Hayat
-   Niaz Ahmed Abbasi

------------------------------------------------------------------------

# 📚 Conclusion

This project demonstrates how **Data Structures and Algorithms can be
applied to real-world hospital management problems**.

By integrating **AVL Trees, Circular Queues, Searching, and Sorting
algorithms**, the system provides an educational example of **efficient
algorithm-driven software design**.
