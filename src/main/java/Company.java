import org.example.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {
    private String companyName;
    private ArrayList<Employee> staff;

    // i) Default constructor
    public Company() {
        // Initialize default values for the company
        this.companyName = "DefaultCompany";
        // Initialize an empty ArrayList to hold employee objects
        this.staff = new ArrayList<>();
    }

    // ii) Overloaded constructor
    public Company(String companyName) {
        // Initialize the company name with the provided parameter
        this.companyName = companyName;
        // Initialize an empty ArrayList to hold employee objects
        this.staff = new ArrayList<>();
    }

    // iii) Method to add a new employee to the staff arrayList
    public void addNewStaff(Employee employee) {
        // Add the provided employee to the staff ArrayList
        staff.add(employee);
    }

    // iii) Method to get the number of employees in the arrayList
    public int getStaffNumber() {
        // Return the size of the staff ArrayList, which represents the number of employees
        return staff.size();
    }

    // iii) Method to list employees above a given employee number value
    public void listEmployees(int empNumValue) {
        System.out.println("Employees with empNum above " + empNumValue + ":");

        // Using an iterator to traverse the staff arrayList
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            // Get the next employee from the iterator
            Employee employee = iterator.next();
            // Check if the employee's empNum is above the specified value
            if (employee.getEmpNum() > empNumValue) {
                // Print the name of the employee
                System.out.println(employee.getName());
            }
        }
    }
}
