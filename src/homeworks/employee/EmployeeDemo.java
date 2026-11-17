package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        CompanyStorage companyStorage = new CompanyStorage();
        boolean running = true;

        while (running) {
            System.out.println("0 - EXIT");
            System.out.println("1 - ADD EMPLOYEE");
            System.out.println("2 - PRINT ALL EMPLOYEES");
            System.out.println("3 - SEARCH EMPLOYEE BY ID");
            System.out.println("4 - SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("5 - ADD COMPANY");
            System.out.println("6 - PRINT ALL COMPANIES");
            System.out.println("7 - SEARCH COMPANY BY ID");
            System.out.println("8 - PRINT EMPLOYEES BY COMPANY ID");
            System.out.println("9 - CHANGE EMPLOYEE COMPANY");
            System.out.println("10 - PRINT EMPLOYEE COMPANY");
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

                    System.out.print("Please input employee position: ");
                    String position = scanner.nextLine();

                    System.out.print("Please input company ID: ");
                    String compId = scanner.nextLine();

                    Company company = companyStorage.getById(compId);
                    if (company != null) {
                        Employee emp = new Employee(name, surname, id, salary, company, position);
                        employeeStorage.add(emp);
                        System.out.println("Employee successfully added!");
                    } else {
                        System.out.println("Company with ID " + compId + " not found. Please add the company first.");
                    }
                    System.out.println();
                    break;

                case 2:
                    employeeStorage.printAll();
                    break;

                case 3:
                    System.out.print("Please input employee ID: ");
                    String searchId = scanner.nextLine();
                    Employee foundEmp = employeeStorage.searchByID(searchId);
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
                    employeeStorage.searchByCompanyName(searchCompany);
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Please input company ID: ");
                    String newCompId = scanner.nextLine();
                    System.out.print("Please input company name: ");
                    String newCompName = scanner.nextLine();
                    System.out.print("Please input industry: ");
                    String industry = scanner.nextLine();
                    System.out.print("Please input country: ");
                    String country = scanner.nextLine();

                    Company newComp = new Company(newCompId, newCompName, industry, country);
                    companyStorage.add(newComp);
                    System.out.println("Company successfully added!");
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Companies:");
                    companyStorage.printAll();
                    System.out.println();
                    break;

                case 7:
                    System.out.print("Please input company ID: ");
                    String searchCompId = scanner.nextLine();
                    Company foundComp = companyStorage.getById(searchCompId);
                    if (foundComp != null) {
                        System.out.println("Company found:" + foundComp);
                    } else {
                        System.out.println("Company not found.");
                    }
                    System.out.println();
                    break;

                case 8:
                    System.out.print("Please input company ID: ");
                    String targetCompId = scanner.nextLine();
                    Company targetComp = companyStorage.getById(targetCompId);
                    if (targetComp != null) {
                        System.out.println("Company: " + targetComp.getName());
                        System.out.println("Employees:");
                        employeeStorage.searchByCompanyId(targetCompId);
                    } else {
                        System.out.println("Company not found.");
                    }
                    System.out.println();
                    break;

                case 9:
                    System.out.print("Please input employee ID: ");
                    String empTargetId = scanner.nextLine();
                    Employee targetEmp = employeeStorage.searchByID(empTargetId);
                    if (targetEmp != null) {
                        System.out.println("Current company: " + (targetEmp.getCompany() != null ? targetEmp.getCompany().getName() : "None"));
                        System.out.print("Please input new company ID: ");
                        String newCompanyId = scanner.nextLine();
                        Company nextCompany = companyStorage.getById(newCompanyId);
                        if (nextCompany != null) {
                            targetEmp.setCompany(nextCompany);
                            System.out.println("Employee company successfully changed!");
                            System.out.println("New company: " + nextCompany.getName());
                        } else {
                            System.out.println("Company not found. Keeping old company.");
                        }
                    } else {
                        System.out.println("Employee not found.");
                    }
                    System.out.println();
                    break;

                case 10:
                    System.out.print("Please input employee ID: ");
                    String eTargetId = scanner.nextLine();
                    Employee eObj = employeeStorage.searchByID(eTargetId);
                    if (eObj != null) {
                        System.out.println("Employee: " + eObj.getName() + " " + eObj.getSurname());
                        if (eObj.getCompany() != null) {
                            System.out.println("Company information:" + eObj.getCompany());
                        } else {
                            System.out.println("This employee does not work in any company.");
                        }
                    } else {
                        System.out.println("Employee not found.");
                    }
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