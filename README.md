# Company Structure Assignment 2 by Nursyifaa Aisyah

This project demonstrates the use of **inheritance**, **abstract classes**, and **interfaces** in Java through the implementation of a company structure.

## Features
- Models an employee hierarchy with roles like `TechnicalLead`, `BusinessLead`, `SoftwareEngineer`, and `Accountant`.
- Demonstrates the concept of managers and direct reports.
- Simulates bonus approvals and team budgets.

## Getting Started

### Prerequisites
Ensure you have the following installed:
- Java Development Kit (JDK) version 8 or higher.
- Git.

### Cloning the Repository
To clone this repository, run the following command:
```bash
git clone https://github.com/syifa1612/CompanyStructure_Assignment2.git

### Classes Implemented
1. `EMPLOYEE` - Abstract base class for all employees.
2. `TechnicalEmployee` - Represents technical staff.
3. `BusinessEmployee` - Represents business staff.
4. `SoftwareEngineer` - Represents software engineers.
5. `Accountant` - Manages financials for teams.
6. `TechnicalLead` - Manages technical employees.
7. `BusinessLead` - Manages accountants and finances.

## Testing
The `CompanyStructure` class provides testing functionality to:
- Create a company structure.
- Assign employees to managers.
- Test functionality like team status and bonus approvals.

## How to Run
1. Compile all files:
   javac *.java
2. Run the CompanyStructure class:
   java CompanyStructure

## Example Output
1 Satya Nadella has 0 successful check-ins and is managing:
    2 Kasey has 0 successful check-ins
    3 Breana has 0 successful check-ins
    4 Eric has 0 successful check-ins

5 Bill Gates has 0 successful check-ins and is managing:
    6 Winter has 0 successful check-ins
    7 Libby has 0 successful check-ins
    8 Gizan has 0 successful check-ins
    9 Zaynah has 0 successful check-ins

10 Amy Hood with a budget of 225000.0 is managing:
    11 Niky with a budget of 165000.0 is supporting Satya Nadella
    12 Andrew with a budget of 165000.0 is supporting Bill Gates

## Authors
Nursyifaa Aisyah

## License
This project is licensed under the MIT License.
