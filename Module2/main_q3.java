import java.util.Scanner;

class Employee {
    private String name;
    private String id;
    private double basicSalary;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Salary calculation
    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: "
                + calculateSalary();
    }
}

class Manager extends Employee {
    private double bonus;

    // Constructor chaining using super()
    public Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + getName() + " (" + getId() + ") Salary: "
                + calculateSalary();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee input
        String[] employeeData = sc.nextLine().split(",");

        String employeeType = employeeData[0].trim();

        Employee employee;

        if (employeeType.equalsIgnoreCase("Employee")) {
            employee = new Employee(
                    employeeData[1].trim(),
                    employeeData[2].trim(),
                    Double.parseDouble(employeeData[3].trim())
            );
        } else {
            employee = new Manager(
                    employeeData[1].trim(),
                    employeeData[2].trim(),
                    Double.parseDouble(employeeData[3].trim()),
                    Double.parseDouble(employeeData[4].trim())
            );
        }

        // Manager input
        String[] managerData = sc.nextLine().split(",");

        String managerType = managerData[0].trim();

        Employee manager;

        if (managerType.equalsIgnoreCase("Manager")) {
            manager = new Manager(
                    managerData[1].trim(),
                    managerData[2].trim(),
                    Double.parseDouble(managerData[3].trim()),
                    Double.parseDouble(managerData[4].trim())
            );
        } else {
            manager = new Employee(
                    managerData[1].trim(),
                    managerData[2].trim(),
                    Double.parseDouble(managerData[3].trim())
            );
        }

        // Display output
        System.out.println(employee);
        System.out.println(manager);

        sc.close();
    }
}
