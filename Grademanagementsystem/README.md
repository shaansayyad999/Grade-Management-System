# Grade Management System – Project Documentation

---

## 1. Project Overview

The Grade Management System is a console-based Java application developed to manage and analyze student academic performance.

This system allows users to input marks for multiple subjects, calculate averages, assign grades, and generate performance reports such as top performers and grade distribution.

The project demonstrates the use of arrays, control flow statements, and object-oriented programming concepts. It was developed as part of the Developer's Arena Internship Program.

### Objectives

* Implement a menu-driven Java application
* Store and manage student data using arrays and ArrayList
* Calculate averages and assign grades
* Generate performance reports
* Apply input handling and validation

---

## 2. Setup Instructions

Follow these steps to run the project:

### Step 1: Open Terminal

Navigate to the project directory.

### Step 2: Go to Source Folder

cd GradeManagementSystem/src

### Step 3: Compile the Program

javac *.java

### Step 4: Run the Application

java GradeManagementSystem

The program will display a menu for user interaction.

---

## 3. Code Structure

The project is organized into multiple classes for better modularity and readability.

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

### File Descriptions

**GradeManagementSystem.java**
Main class that handles the menu system and user interaction.

**StudentGrade.java**
Represents student data including name and subject marks, and calculates average.

**GradeCalculator.java**
Contains logic for assigning grades based on average marks.

**ReportGenerator.java**
Generates performance reports including subject averages, top performers, and grade distribution.

---

## 4. Visual Documentation

Screenshots are included in the **screenshots folder** to demonstrate:

* Menu interface
* Adding student marks
* Viewing student records
* Calculating averages
* Generating reports

These screenshots confirm the correct working of the application.

---

## 5. Technical Details

### Programming Language

Java

### Concepts Used

* Arrays (1D and 2D)
* ArrayList for dynamic storage
* Loops (for, while)
* Conditional statements (if-else, switch)
* Object-Oriented Programming (classes and methods)
* Scanner for user input

### Data Structures

* **Array (double[][])** → used to store subject marks
* **ArrayList<StudentGrade>** → used to store student records

### Algorithms Implemented

**Add Student**

1. Accept student name and marks
2. Store data in arrays
3. Add to student list

**Calculate Average**

1. Sum all subject marks
2. Divide by number of subjects

**Generate Report**

1. Calculate subject averages
2. Sort students by performance
3. Display top performers
4. Count grade distribution

---

## 6. Grading System Explanation

Grades are assigned based on average marks:

| Average Marks | Grade |
| ------------- | ----- |
| 90 and above  | A+    |
| 80 - 89       | A     |
| 70 - 79       | B     |
| 60 - 69       | C     |
| 50 - 59       | D     |
| Below 50      | F     |

This grading logic is implemented in **GradeCalculator.java**.

---

## 7. Testing Evidence

The system was tested using sample student data stored in:

examples/sample_data.txt

### Sample Data

Name, Math, Science, English, History, Computer
manu, 86, 56, 48, 23, 18
Rahul, 96, 89, 88, 78, 87
sneha, 78, 65, 84, 81, 91

### Test Cases Performed

| Test Case         | Description                | Expected Result                                 |
| ----------------- | -------------------------- | ----------------------------------------------- |
| Add Student       | Enter marks for 5 subjects | Student added successfully                      |
| View Students     | Display all students       | Correct student data shown                      |
| Calculate Average | Compute average marks      | Correct average and grade                       |
| Generate Report   | Show report                | Displays averages, top performers, distribution |

These tests confirm the system works correctly.

---

## 8. Conclusion

The Grade Management System successfully demonstrates the use of Java fundamentals including arrays, control flow, and object-oriented programming.

The project provides a strong foundation for building more advanced data management and reporting systems.


How i face technical requirements :
This project meets the technical requirements by using arrays and ArrayList to store student data and marks for multiple subjects. A menu-driven system is implemented using loops and switch-case for user interaction. Separate classes are used for better structure, where student data, grade calculation, and report generation are handled independently. The system calculates averages, assigns grades based on defined conditions, and generates reports including top performers and grade distribution. The program was tested with multiple student inputs to ensure correct functionality.
