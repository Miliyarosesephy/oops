// Employee class
class Employee {
    void display() {
        System.out.println("Name of class in Employee");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

// Engineer class inheriting Employee
class Engineer extends Employee {
    @Override
    void calcSalary() {
        System.out.println("Salary of employee is 20000");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Engineer object
        Engineer engineer = new Engineer();

        // Call display() from Employee class
        engineer.display();

        // Call calcSalary() from Engineer class (overridden method)
        engineer.calcSalary();
    }
}
