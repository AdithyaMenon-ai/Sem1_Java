import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    // Default constructor
    public Professor() {
    }

    // Parameterized constructor
    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + employeeId
                + ", Specialization: " + specialization;
    }
}

class Department {
    private String deptName;
    private String hodName;
    private List<Professor> professors;

    // Default constructor
    public Department() {
        professors = new ArrayList<>();
    }

    // Parameterized constructor
    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.professors = new ArrayList<>();
    }

    // Getters and Setters
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    // Add professor to the department
    public void addProfessor(Professor p) {
        professors.add(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Department: ").append(deptName).append("\n");
        sb.append("HOD: ").append(hodName).append("\n");
        sb.append("Professors:\n");

        for (Professor p : professors) {
            sb.append(p).append("\n");
        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Department details
        System.out.println("Enter Department details (deptName,hodName)");
        String[] deptDetails = sc.nextLine().split(",");

        Department department = new Department(
                deptDetails[0].trim(),
                deptDetails[1].trim()
        );

        // Number of professors
        System.out.println("Enter number of professors");
        int n = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter professor details (name,employeeId,specialization)");

        // Professor details
        for (int i = 0; i < n; i++) {
            String[] details = sc.nextLine().split(",");

            Professor professor = new Professor(
                    details[0].trim(),
                    details[1].trim(),
                    details[2].trim()
            );

            department.addProfessor(professor);
        }

        // Display department details
        System.out.print(department);

        sc.close();
    }
}
