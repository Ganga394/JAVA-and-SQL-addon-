abstract class Employee {
    String name;
    Employee(String name) { this.name = name; }
    abstract double calculateSalary();
    void displaySalary() {
        System.out.println(name + "s Salary: $" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double salary;
    FullTimeEmployee(String name, double salary) {
    super(name); 
    this.salary = salary;
    }
    double calculateSalary() { 
    return salary; 
    }
}

class PartTimeEmployee extends Employee {
    int hours; 
    double rate;
    PartTimeEmployee(String name, int hours, double rate) {
    super(name); 
    this.hours = hours; 
    this.rate = rate;
    }
    double calculateSalary() { 
    return hours * rate;
    }
}

class Freelancer extends Employee {
    int hours; double rate, bonus;
    Freelancer(String name, int hours, double rate, double bonus) {
    super(name); 
    this.hours = hours; 
    this.rate = rate; 
    this.bonus = bonus;
    }
    double calculateSalary() {
    return hours * rate + bonus; 
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Reshma", 30000),
            new PartTimeEmployee("John", 80, 20),
            new Freelancer("Renu", 100, 25, 500)
        };

        for (Employee e : employees) 
        e.displaySalary();
    }
}
