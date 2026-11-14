package homeworks.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            Employee[] temp = new Employee[employees.length + 5];
            for (int i = 0; i < employees.length; i++) {
                temp[i] = employees[i];
            }
            employees = temp;
        }
        employees[size++] = employee;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println(employees[i]);
            System.out.println();
        }
    }


    public Employee searchByID(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchByCompany(String companyName) {
        boolean found = false;
        System.out.println("Employees:");
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equalsIgnoreCase(companyName)) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " - " + employees[i].getPosition());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company " + companyName + ".");
        }
    }
}