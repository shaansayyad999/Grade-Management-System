Grade Management System – Project Documentation
1. Project Overview

The Grade Management System is a console-based Java application created to handle and evaluate student academic performance in a structured way.

This application enables users to enter marks for different subjects, calculate the average score, assign grades, and generate reports like top-performing students and overall grade distribution.

The project mainly focuses on applying core Java concepts such as arrays, control structures, and object-oriented programming. It was developed as part of the Developer’s Arena Internship Program.

Objectives
Develop a menu-driven Java program
Store and manage student data using arrays and ArrayList
Compute average marks and assign grades accordingly
Generate useful performance reports
Handle user input with proper validation
2. Setup Instructions

Follow the steps below to run the application:

Step 1: Open terminal and go to the project folder

Step 2: Navigate to the source directory

cd GradeManagementSystem/src

Step 3: Compile all Java files

javac *.java

Step 4: Execute the program

java GradeManagementSystem

After running, a menu will be displayed for interaction.

3. Code Structure

The project is divided into multiple classes to keep the code organized and maintainable.

GradeManagementSystem
│
├── README.md
├── src
│   ├── GradeManagementSystem.java
│   ├── StudentGrade.java
│   ├── GradeCalculator.java
│   └── ReportGenerator.java
│
├── docs
│   └── documentation.md
│
├── examples
│   └── sample_data.txt
│
└── screenshots
File Descriptions

GradeManagementSystem.java
Acts as the main class and controls menu operations and user interaction.

StudentGrade.java
Stores student details like name and marks, and also handles average calculation.

GradeCalculator.java
Responsible for assigning grades based on the calculated average.

ReportGenerator.java
Used to generate reports such as subject averages, topper list, and grade distribution.

4. Visual Documentation

The screenshots folder contains images showing:

Menu interface
Adding student details
Displaying student records
Calculating averages
Generating reports

These screenshots confirm that the application is working correctly.

5. Technical Details
Programming Language

Java

Concepts Used
Arrays (1D and 2D)
ArrayList for flexible data storage
Loops (for, while)
Conditional statements (if-else, switch-case)
Object-Oriented Programming (classes, methods)
Scanner class for input handling
Data Structures
double[][] array → stores subject-wise marks
ArrayList → stores student records dynamically
Algorithms Implemented

Add Student

Take student name and subject marks as input
Store marks in arrays
Add student object to list

Calculate Average

Add all subject marks
Divide by total number of subjects

Generate Report

Compute subject-wise averages
Sort students based on performance
Display top performers
Show grade distribution count
6. Grading System Explanation

Grades are assigned based on average marks:

Average Marks	Grade
90 and above	A+
80 - 89	A
70 - 79	B
60 - 69	C
50 - 59	D
Below 50	F

This logic is implemented in GradeCalculator.java.

7. Testing Evidence

The system was tested using sample data stored in:

examples/sample_data.txt
Sample Data
Name, Math, Science, English, History, Computer
Manu, 86, 56, 48, 23, 18
Rahul, 96, 89, 88, 78, 87
Sneha, 78, 65, 84, 81, 91
Test Cases Performed
Test Case	Description	Expected Result
Add Student	Enter marks for 5 subjects	Student added successfully
View Students	Display all students	Correct data displayed
Calculate Avg	Compute average marks	Correct average and grade output
Generate Report	Display report	Shows averages, toppers, grades

These test cases confirm that the system performs as expected.

8. Conclusion

The Grade Management System effectively demonstrates the use of Java basics such as arrays, control flow, and object-oriented programming concepts.

It also builds a strong base for developing more advanced applications related to data handling and reporting.

How I Met Technical Requirements

This project satisfies the technical requirements by using arrays and ArrayList to manage student data and subject marks efficiently.

A menu-driven approach is implemented using loops and switch-case statements for smooth user interaction. The project structure is divided into multiple classes, where each class is responsible for a specific task like storing student data, calculating grades, or generating reports.

The system calculates averages, assigns grades using conditional logic, and generates reports such as top performers and grade distribution.

The application was tested with different sets of inputs to ensure accuracy and proper functionality.