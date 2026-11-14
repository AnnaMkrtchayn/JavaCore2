package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();
        boolean running = true;

        while (running) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.print("Input: ");

            int command;
            if (scanner.hasNextInt()) {
                command = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid command. Please try again.");
                scanner.nextLine();
                continue;
            }

            switch (command) {
                case 0:
                    running = false;
                    System.out.println("Program finished.");
                    break;

                case 1:
                    System.out.print("Please input employee name: ");
                    String name = scanner.nextLine();

                    System.out.print("Please input employee surname: ");
                    String surname = scanner.nextLine();

                    System.out.print("Please input employee ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Please input employee salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Please input employee company: ");
                    String company = scanner.nextLine();

                    System.out.print("Please input employee position: ");
                    String position = scanner.nextLine();

                    Employee emp = new Employee(name, surname, id, salary, company, position);
                    storage.add(emp);
                    System.out.println("Employee successfully added!");
                    System.out.println();
                    break;

                case 2:
                    storage.printAll();
                    break;

                case 3:
                    System.out.print("Please input employee ID: ");
                    String searchId = scanner.nextLine();
                    Employee foundEmp = storage.searchByID(searchId);
                    if (foundEmp != null) {
                        System.out.println("Employee found:");
                        System.out.println(foundEmp);
                    } else {
                        System.out.println("Employee with ID " + searchId + " not found.");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Please input company name: ");
                    String searchCompany = scanner.nextLine();
                    storage.searchByCompany(searchCompany);
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
                    System.out.println();
                    break;
            }
        }
        scanner.close();
    }
}