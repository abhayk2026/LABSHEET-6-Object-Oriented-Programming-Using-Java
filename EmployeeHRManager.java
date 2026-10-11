class Employee {
    void work() {
        System.out.println("Employee is working.");
    }

    double getSalary() {
        return 30000.0;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    void addEmployee(String name) {
        System.out.println("Added employee: " + name);
    }
}

public class EmployeeHRManager {
    public static void main(String[] args) {
        Employee employee = new Employee();
        HRManager hr = new HRManager();
        employee.work();
        System.out.println("Employee salary: Rs. " + employee.getSalary());
        hr.work();
        System.out.println("HR salary: Rs. " + hr.getSalary());
        hr.addEmployee("Rohan");
    }
}
