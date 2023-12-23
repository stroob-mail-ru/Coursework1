import java.util.Objects;

public class Employee {
    static int id;
    private String employeeName;
    private int department;
    private int salary;
    private int employeeId;

    public Employee(String employeeName, int department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        employeeId = ++id;
        }

    public String getEmployeeName() {
        return employeeName;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId + ", " + employeeName + ", "
                + department + " отдел, зарплата: " + salary + " руб.";
    }

    public String toStringWithoutDepartment() {
        return "ID: " + employeeId + ", " + employeeName + ", зарплата: " + salary + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName);
    }
}
