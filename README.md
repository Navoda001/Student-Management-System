# Marks Management System

## Overview
The **Marks Management System** is a **Java-based command-line application** designed to manage student marks. This system allows users to add students, update student details, assign and update marks, and generate student rankings based on their performance.

## Features
1. **Add New Student**  
   - Enter Student ID and Name.
   - Prevents duplicate Student IDs.
   
2. **Add New Student with Marks**  
   - Allows entering marks while adding a new student.
   - Marks must be in the range **0-100**.

3. **Add Marks**  
   - Assign marks to students who were added earlier.
   - Prevents re-entering marks if already assigned.
   
4. **Update Student Details**  
   - Modify an existing student’s name.
   
5. **Update Marks**  
   - Modify marks of students who already have marks assigned.
   
6. **Delete Student**  
   - Removes a student from the system along with their marks.
   
7. **Print Student Details**  
   - Display student details, marks, total, average, and rank.
   
8. **Print Student Ranks**  
   - Lists all students ranked by total marks.
   
9. **Best in Programming Fundamentals**  
   - Displays the top student in the **Programming Fundamentals** module.
   
10. **Best in Database Management System**  
    - Displays the top student in the **Database Management System** module.

## Installation & Usage
### Prerequisites
- **Java** installed on your system.
- A command-line terminal (CMD, PowerShell, Terminal, etc.).

### Clone the Repository
```sh
git clone https://github.com/Navoda001/Student-Management-System.git
cd Student-Management-System
```

### Compile and Run the Program
```sh
javac StudentManagementSystem.java
java StudentManagementSystem
```
