package org.example;

import org.example.Employee;

// Task B Of Part 1

public class EmployeeTest {

    // Link to Repo

//    https://github.com/EoghanRyan91/CCT-Java-CA2

    public static void main(String[] args) {
        // Create 3 Employee objects with the specified details
        Employee joeBloggs = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee annBanana = new Employee("Ann Banana", "ab@gmail.com");
        Employee tomThumb = new Employee("Tom Thumb", "tt@gmail.com");

        // Declare an array to store Employee objects
        Employee[] projectGroup = new Employee[3];

        // Load the array with the created Employee objects
        projectGroup[0] = joeBloggs;
        projectGroup[1] = annBanana;
        projectGroup[2] = tomThumb;

        // Set the value for variable m
        int m = 2; // Replace this with the desired value

        // Task C of Part 1

        // Search and display names of employees with empNum above m
        System.out.println("Employees with empNum above " + m + ":");
        for (Employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println(employee.getName());

                // Print out the value of variable nextEmpNum to the terminal window
                System.out.println("Value of nextEmpNum: " + Employee.getNextEmpNum());
            }
        }

    }
}