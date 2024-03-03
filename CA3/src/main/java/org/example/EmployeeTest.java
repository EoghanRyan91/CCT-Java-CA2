package org.example;

import org.example.Employee;

public class EmployeeTest {

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

        // Print out the value of variable nextEmpNum to the terminal window
        System.out.println("Value of nextEmpNum: " + Employee.getNextEmpNum());
    }
}
