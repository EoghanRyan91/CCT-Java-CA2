import org.example.Employee;

import java.util.Scanner;

public class ManagerConsoleMenu {

    public static void main(String[] args) {
        // Creating a Company instance
        Company businessGnomesLtd = new Company("Business Gnomes LTD");

        // Creating a manager with the specified username and password
        Employee manager = new Employee();
        manager.setUsername("Gnomeo");
        manager.setPassword("smurf");

        // Implementing a simple login system
        if (login(manager)) {
            // If login is successful, display the menu
            displayMenu(businessGnomesLtd);
        } else {
            System.out.println("Login failed. Exiting the program.");
        }
    }

    // Method for manager login
    private static boolean login(Employee manager) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        // Checking if entered username and password match the manager's credentials
        if (enteredUsername.equals(manager.getUsername()) && enteredPassword.equals(manager.getPassword())) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password. Login failed.");
            return false;
        }
    }

    // Method to display the menu options for the manager
    private static void displayMenu(Company company) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. View Current Staff");
            System.out.println("2. Add New Staff");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // View Current Staff
                    viewCurrentStaff(company);
                    break;
                case 2:
                    // Add New Staff
                    addNewStaff(company);
                    break;
                case 3:
                    // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    // Method to view the current staff
    private static void viewCurrentStaff(Company company) {
        System.out.println("Current Staff:");
        int staffNumber = company.getStaffNumber();
        if (staffNumber > 0) {
            company.listEmployees(0); // Assuming 0 as the default employee number value
        } else {
            System.out.println("No employees currently in the staff.");
        }
    }

    // Method to add new staff
    private static void addNewStaff(Company company) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for the new employee: ");
        String name = scanner.nextLine();

        System.out.print("Enter email for the new employee: ");
        String email = scanner.nextLine();

        // Creating a new employee with the provided details
        Employee newEmployee = new Employee(name, email);

        // Adding the new employee to the company staff
        company.addNewStaff(newEmployee);

        System.out.println("New employee added successfully!");
    }
}
