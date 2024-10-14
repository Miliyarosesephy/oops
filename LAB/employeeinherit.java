// Employee class
class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor
    Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    void printSalary() {
        System.out.println("Salary: " + salary);
    }

    // Method to print employee details
    void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

// Officer class inheriting Employee
class Officer extends Employee {
    String specialization;

    // Constructor
    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Method to print officer details
    void printOfficerDetails() {
        printEmployeeDetails();
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
}

// Manager class inheriting Employee
class Manager extends Employee {
    String department;

    // Constructor
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Method to print manager details
    void printManagerDetails() {
        printEmployeeDetails();
        System.out.println("Department: " + department);
        printSalary();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create officer object
        Officer officer = new Officer("John Doe", 30, "1234567890", "123 Main St", 50000.0, "Software Development");

        // Create manager object
        Manager manager = new Manager("Jane Smith", 35, "9876543210", "456 Elm St", 70000.0, "Marketing");

        // Print officer details
        System.out.println("Officer Details:");
        officer.printOfficerDetails();

        System.out.println();

        // Print manager details
        System.out.println("Manager Details:");
        manager.printManagerDetails();
    }
}
``'