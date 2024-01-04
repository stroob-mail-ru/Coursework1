public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов Иван Иванович", 1, 100_000);
        employeeBook.addEmployee("Иванов Иван Петрович", 2, 80_000);
        employeeBook.addEmployee("Иванов Иван Сидорович", 3, 85_000);
        employeeBook.addEmployee("Иванов Иван Геннадьевич", 1, 105_000);
        employeeBook.addEmployee("Иванов Иван Васильевич", 2, 95_000);
        employeeBook.addEmployee("Иванов Иван Дмитриевич", 3, 75_000);
        employeeBook.addEmployee("Иванов Иван Андреевич", 1, 125_000);

        System.out.println();
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        employeeBook.printAllEmployees();

        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц:");
        System.out.println(employeeBook.calculateSalaryTotal() + " руб.");

        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(employeeBook.getEmployees(employeeBook.findMinimumSalary()));

        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(employeeBook.getEmployees(employeeBook.findMaximumSalary()));

        System.out.println();
        System.out.println("Среднее значение зарплат:");
        System.out.println(employeeBook.calculateSalaryTotal() / employeeBook.getSize() + " руб.");

        System.out.println();
        System.out.println("Ф. И. О. всех сотрудников");
        employeeBook.printAllEmployeesNames();

        int salaryIncrement = 10;

        System.out.println();
        System.out.println("Проиндексировать зарплату на " + salaryIncrement + " %");
        employeeBook.increaseSalary(salaryIncrement);
        employeeBook.printAllEmployees();

        int department = 1;

        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой из " + department + " отдела:");
        System.out.println(employeeBook.getEmployeesWithoutDepartment(employeeBook.findMinimumSalary(department)));

        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой из " + department + " отдела:");
        System.out.println(employeeBook.getEmployeesWithoutDepartment(employeeBook.findMaximumSalary(department)));

        System.out.println();
        System.out.println("Сумма затрат на зарплаты по " + department + " отделу в месяц:");
        System.out.println(employeeBook.calculateSalaryTotal(department) + " руб.");

        System.out.println();
        System.out.println("Средняя зарплата по отделу " + department + ":");
        System.out.println(employeeBook.calculateSalaryTotal(department) / employeeBook.getSizeFromDepartment(department) + " руб.");

        System.out.println();
        System.out.println("Список сотрудников отдела " + department + ":");
        employeeBook.printAllEmployeesFromDepartment(department);

        int salaryExample = 100_000;

        System.out.println();
        System.out.println("Список всех сотрудников с зарплатой меньше " + salaryExample + " руб.:");
        employeeBook.findAllEmployeesWithSalaryLess(salaryExample);

        System.out.println();
        System.out.println("Список всех сотрудников с зарплатой больше (или равно) " + salaryExample + " руб.:");
        employeeBook.findAllEmployeesWithSalaryMore(salaryExample);

        System.out.println();
        System.out.println("Добавляем нового сотрудника:");
        employeeBook.addEmployee("Сидоров Сидр Сидорович", 3, 77_000);
        employeeBook.printAllEmployees();

        String deleteEmployee = "Иванов Иван Дмитриевич";

        System.out.println();
        System.out.println("Удаляем сотрудника " + deleteEmployee + ":");
        employeeBook.removeEmployee(deleteEmployee);
        employeeBook.printAllEmployees();

        String changingEmployee = "Сидоров Сидр Сидорович";
        int changingData = 5;

        System.out.println();
        System.out.println("Изменение номера отдела или зарплаты у сотрудника: " + changingEmployee);
        employeeBook.changingEmployeeData(changingEmployee, changingData);
        employeeBook.printAllEmployees();

        System.out.println();
        System.out.println("Список сотрудников по отделам:");
        employeeBook.printDepartmentsWithEmployees();
    }
}
