import java.util.Scanner;

// Employee Class
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize the attributes
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}

// SalaryCalculator Class
class SalaryCalculator {
    // Method to calculate bonus (10% of salary)
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

// MainApp Class
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input for employee details
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        double salary = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter employee salary: ");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                if (salary > 0) {
                    validInput = true;
                } else {
                    System.out.println("Salary must be a positive number. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value for salary.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Create an Employee object
        Employee employee = new Employee(name, salary);        

        // Create a SalaryCalculator object
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        // Calculate bonus
        double bonus = salaryCalculator.calculateBonus(employee.getSalary());

        // Display employee details
        employee.displayDetails();

        // Display calculated bonus
        System.out.println("Calculated Bonus: $" + bonus);

        scanner.close();
    }
}
