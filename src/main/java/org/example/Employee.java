package org.example;

// Task A of Part 1

public class Employee {
    private String name;
    private String email;
    private int empNum;

    // Fields for manager
    private String username;
    private String password;

    // Static field
    private static int nextEmpNum = 1;

    // Constructors

    // Constructor with default values
    public Employee() {
        this.name = "DefaultName";
        this.email = "default@email.com";
        this.empNum = nextEmpNum++;
    }

    // Getter and setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Constructor with parameters
    public Employee(String name, String email) {
        this.name = name;
        // Validate email length
        if (email.length() > 3) {
            this.email = email;
        } else {
            System.out.println("Email must be longer than 3 characters. Default email set.");
            this.email = "default@email.com";
        }
        this.empNum = nextEmpNum++;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }

    // Method to set email with validation
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
            System.out.println("Email updated successfully.");
        } else {
            System.out.println("Email must be longer than 3 characters. Email not updated.");
        }
    }

    // Method to get the current value of nextEmpNum
    public static int getNextEmpNum() {
        return nextEmpNum;
    }
}
