import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws  InterruptedException {

        ArrayList<Employee> employeeList = new ArrayList<>();
        boolean exit = false;
        Employee test1 = new Employee(1, "daniela hernandez", 4500000, "product development", "junior developer");
        Employee test2 = new Employee(2, "natalia morales", 6000000, "product development", "senior developer");
        Employee test3 = new Employee(3, "sergio guzman", 6000000, "product development", "senior developer");
        Employee test4 = new Employee(4, "karen pinzon", 7100000, "product management", "scrum master");
        Employee test5 = new Employee(5, "fredy mendez", 5500000, "support architecture", "dev-ops engineer");
        employeeList.add(test1);
        employeeList.add(test2);
        employeeList.add(test3);
        employeeList.add(test4);
        employeeList.add(test5);
        System.out.println();
        System.out.println("#################################");
        System.out.println("Welcome to the EAN Guide 3 Act. 1");
        System.out.println("#################################");
        System.out.println("--------Employee's list----------");
        System.out.println();
        do {
            int option = menu();
            switch (option) {
                case 1:
                    Employee newEmployee = new Employee();
                    boolean intChecker;
                    do {
                        System.out.println("Enter the ID of the employee:");
                        intChecker = input.hasNextInt();
                        if(intChecker) {
                            newEmployee.setId(input.nextInt());
                            break;
                        } else {
                            System.out.println("ERROR: Invalid input. Please use Integers");
                            System.out.println();
                        }
                        input.nextLine();
                    } while(true);
                    input.nextLine();
                    System.out.println("Enter the NAME of the employee:");
                    newEmployee.setName(input.nextLine().toLowerCase());
                    do {
                        System.out.println("Enter the SALARY of the employee:");
                        intChecker = input.hasNextDouble();
                        if(intChecker) {
                            newEmployee.setSalary(input.nextDouble());
                            break;
                        } else {
                            System.out.println("ERROR: Invalid input. Please use Integers");
                        }
                        input.nextLine();
                    } while(true);
                    input.nextLine();
                    System.out.println("Enter the DEPARTMENT of the employee:");
                    newEmployee.setDepartment(input.nextLine().toLowerCase());
                    System.out.println("Enter the CHARGE of the employee:");
                    newEmployee.setCharge(input.nextLine().toLowerCase());
                    employeeList.add(newEmployee);
                    System.out.println();
                    System.out.println("Employee " + newEmployee.getName() + " created successfully");
                    System.out.println();
                    break;
                case 2:
                    if(employeeList.size() == 0) {
                        System.out.println("The list of employees is empty.");
                    } else {
                        for (Employee employee : employeeList) {
                            System.out.println(employee);
                            System.out.println();
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    input.nextLine();
                    if(employeeList.size() == 0) {
                        System.out.println("The list of employees is empty.");
                    } else {
                        System.out.println("What department are you looking for?");
                        String search = input.nextLine();
                        int counter = 0;
                        for (Employee employee : employeeList) {
                            if (employee.getDepartment().equals(search)) {
                                System.out.println(employee);
                                System.out.println();
                                counter++;
                            }
                        }
                        System.out.println("The " + search + " department has " + counter + " employees.");
                    }
                    System.out.println();
                    break;
                case 4:
                    if(employeeList.size() == 0) {
                        System.out.println("The list of employees is empty.");
                    } else {
                        for (Employee employee : employeeList) {
                            employee.setSalary(employee.getSalary() + (employee.getSalary() * 0.10));
                        }
                        System.out.println("Salary increased by 10% for all employees");
                    }
                    System.out.println();
                    break;
                case 5:
                    if(employeeList.size() == 0) {
                        System.out.println("The list of employees is empty.");
                    } else {
                        long totalSalary = 0;
                        for (Employee employee : employeeList) {
                            totalSalary += employee.getSalary();
                        }
                        System.out.println("The sum of all salaries is: " + totalSalary);
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exiting app.");
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    public static int menu() throws InterruptedException {

        int option;
        do {
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1. Add a new employee.");
            System.out.println("2. Print the list of employees.");
            System.out.println("3. Print the list of employees by department.");
            System.out.println("4. Increase the salary of all employees by 10%");
            System.out.println("5. Print the sum of all salaries.");
            System.out.println("0. To exit the app.");
            System.out.println();
            System.out.println("Please enter the number of what you want to execute: ");
            boolean optionChecker = input.hasNextInt();
            if(optionChecker) {
                option = input.nextInt();
                switch (option) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    case 4:
                        return 4;
                    case 5:
                        return 5;
                    case 0:
                        return 0;
                    default:
                        System.out.println("ERROR: Invalid Option.");
                        System.out.println("ERROR: Please enter a number between 1 and 5. Or 0 to exit.");
                        Thread.sleep(3500);
                        break;
                }
            } else {
                System.out.println("ERROR: Invalid option.");
                System.out.println("ERROR: Letters are not allowed.");
                System.out.println("ERROR: Please enter a number between 1 and 5. Or 0 to exit.");
                Thread.sleep(3500);
            }
            input.nextLine();
        } while (true);
    }

}