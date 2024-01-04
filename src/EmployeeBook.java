public class EmployeeBook {
    private Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new  Employee[10];
    }

    public Employee getEmployees(int index) {
        return employees[index];
    }
    public String getEmployeesWithoutDepartment(int index) {
        return employees[index].toStringWithoutDepartment();
    }

    public int getSize() {
        return size;
    }



    public void addEmployee(String employeeName, int department, int salary) {

        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        } else {
            employees[size++] = new Employee(employeeName, department, salary);
        }
    }

    public void removeEmployee(String deleteEmployee) {

        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeName().equals(deleteEmployee)) {
                System.out.println(employees[i].getEmployeeName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println(deleteEmployee + " - такой сотрудник не найдеден");
    }

    public void printAllEmployees() {

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }
    public void printAllEmployeesNames() {

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getEmployeeName());
        }
    }
    public void printAllEmployeesFromDepartment(int department) {

        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].toStringWithoutDepartment());
            }
        }
    }

    public void printDepartmentsWithEmployees() {

        for (int department = 1; department <= 5; department++) {
            System.out.println("Отдел " + department + ":");
            for (int i = 0; i < size; i++) {
                if (employees[i].getDepartment() == department) {
                    System.out.println(employees[i].getEmployeeName());
                }
            }
        }
    }
    public int calculateSalaryTotal() {

        int salaryTotal = 0;

        for (int i = 0; i < size; i++) {
            salaryTotal += employees[i].getSalary();
        }
        return salaryTotal;
    }public int calculateSalaryTotal(int department) {

        int salaryTotal = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                salaryTotal += employees[i].getSalary();
            }
        }
        return salaryTotal;
    }
    public int getSizeFromDepartment(int department) {

        int sizeFromDepartment = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sizeFromDepartment++;
            }
        }
        return sizeFromDepartment;
    }
    public int findMinimumSalary() {

        int salaryMin = 300_000;
        int indexForPrint = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salaryMin) {
                salaryMin = employees[i].getSalary();
                indexForPrint = i;
            }
        }
        return indexForPrint;
    }
    public int findMinimumSalary(int department) {

        int salaryMin = 300_000;
        int indexForPrint = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salaryMin && employees[i].getDepartment() == department) {
                salaryMin = employees[i].getSalary();
                indexForPrint = i;
            }
        }
        return indexForPrint;
    }
    public int findMaximumSalary() {

        int salaryMax = 0;
        int indexForPrint = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > salaryMax) {
                salaryMax = employees[i].getSalary();
                indexForPrint = i;
            }
        }
        return indexForPrint;
    }
    public int findMaximumSalary(int department) {

        int salaryMax = 0;
        int indexForPrint = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > salaryMax && employees[i].getDepartment() == department) {
                salaryMax = employees[i].getSalary();
                indexForPrint = i;
            }
        }
        return indexForPrint;
    }
    public void increaseSalary(int salaryIncrement) {

        double increment = (double) (salaryIncrement + 100) / 100;
        for (int i = 0; i < size; i++) {
            employees[i].setSalary((int) (employees[i].getSalary() * increment));
        }
    }
    public void findAllEmployeesWithSalaryLess(int salaryExample) {

        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salaryExample) {
                System.out.println(employees[i]);
            }
        }
    }
    public void findAllEmployeesWithSalaryMore(int salaryExample) {

        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= salaryExample) {
                System.out.println(employees[i]);
            }
        }
    }
    public void changingEmployeeData(String changingEmployee, int changingData) {

        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeName().equals(changingEmployee)) {
                if (changingData <= 5) {
                    employees[i].setDepartment(changingData);
                } else {
                    employees[i].setSalary(changingData);
                }
                return;
            }
        }
    }
}
