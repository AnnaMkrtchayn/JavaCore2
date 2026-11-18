package homeworks.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public boolean add(Employee employee) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(employee.getEmployeeID())) {
                return false;
            }
        }

        if (size == employees.length) {
            Employee[] temp = new Employee[employees.length + 5];
            System.arraycopy(employees, 0, temp, 0, employees.length);
            employees = temp;
        }
        employees[size++] = employee;
        return true;
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

    public void searchByCompanyName(String companyName) {
        boolean found = false;
        System.out.println("Employees:");
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null &&
                    employees[i].getCompany().getName().equalsIgnoreCase(companyName)) {
                System.out.println(employees[i].getEmployeeID() + " - " + employees[i].getName() + " " + employees[i].getSurname());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company name " + companyName + ".");
        }
    }

    public void searchByCompanyId(String companyId) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null &&
                    employees[i].getCompany().getCompanyId().equalsIgnoreCase(companyId)) {
                System.out.println(employees[i].getEmployeeID() + " - " + employees[i].getName() + " " + employees[i].getSurname());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company ID " + companyId + ".");
        }
    }
}