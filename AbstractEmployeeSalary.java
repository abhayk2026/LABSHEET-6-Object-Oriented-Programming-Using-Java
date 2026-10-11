abstract class Employee {
    protected String name;
    protected int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private double monthlySalary;
    private double bonus;

    Manager(String name, int employeeId, double monthlySalary, double bonus) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override double calculateSalary() { return monthlySalary + bonus; }

    @Override void displayInfo() {
        System.out.println("Manager: " + name + ", ID: " + employeeId
                + ", Salary: Rs. " + calculateSalary());
    }
}

class Programmer extends Employee {
    private double monthlySalary;
    private double overtimePay;

    Programmer(String name, int employeeId, double monthlySalary, double overtimePay) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
        this.overtimePay = overtimePay;
    }

    @Override double calculateSalary() { return monthlySalary + overtimePay; }

    @Override void displayInfo() {
        System.out.println("Programmer: " + name + ", ID: " + employeeId
                + ", Salary: Rs. " + calculateSalary());
    }
}

public class AbstractEmployeeSalary {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Meera", 801, 70000, 10000),
            new Programmer("Arjun", 802, 60000, 5000)
        };
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayInfo();
        }
    }
}
