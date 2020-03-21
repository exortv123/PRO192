/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
import util.MyToys;

/**
 *
 * @author SE140787
 */
public class Cabinet {

    public static Scanner sc = new Scanner(System.in);
    private static Employee employee[] = new Employee[100];
    private static int numberOfEmp = 0;

    public void addNewSalesEmp() {
        String empID, empName, empAddress, empEmail;
        double empBasicSalary, empSalaryPerSale;

        empID = MyToys.getAString("Input employee's ID: ", "Please try again! Employee's ID is: ");
        empName = MyToys.getAString("Input employee's name: ", "Please try again! Employee's name is: ");
        empAddress = MyToys.getAString("Input employee's address: ", "Please try again! Employee's adress is: ");
        empEmail = MyToys.getAString("Input employee's email: ", "Please try again! Employee's ID email: ");
        empBasicSalary = MyToys.getADouble("Input employee's basic salary: ", "Please try again! Employee's baisc salary is: ");
        empSalaryPerSale= MyToys.getADouble("Input employee's salary/sales: ", "Please try again! Employee's salary/sales is: ");
        employee[numberOfEmp] = new Sales(empBasicSalary, empSalaryPerSale, empID, empName, empAddress, empEmail);
        numberOfEmp++;
        System.out.println("Added!");
    }

    public void addNewStaffEmp() {
        String empID, empName, empAddress, empEmail;
        double empBasicSalary;

        empID = MyToys.getAString("Input employee's ID: ", "Please try again! Employee's ID is: ");
        empName = MyToys.getAString("Input employee's name: ", "Please try again! Employee's name is: ");
        empAddress = MyToys.getAString("Input employee's address: ", "Please try again! Employee's adress is: ");
        empEmail = MyToys.getAString("Input employee's email: ", "Please try again! Employee's ID email: ");
        empBasicSalary = MyToys.getADouble("Input employee's basic salary: ", "Please try again! Employee's basic salary is: ");
        employee[numberOfEmp] = new Staff(empBasicSalary, empID, empName, empAddress, empEmail);
        numberOfEmp++;
        System.out.println("Added!");
    }

    public void addNewPartTimeEmp() {
        String empID, empName, empAddress, empEmail;
        double empSalaryPerProj;

        empID = MyToys.getAString("Input employee's ID: ", "Please try again! Employee's ID is: ");
        empName = MyToys.getAString("Input employee's name: ", "Please try again! Employee's name is: ");
        empAddress = MyToys.getAString("Input employee's address: ", "Please try again! Employee's adress is: ");
        empEmail = MyToys.getAString("Input employee's email: ", "Please try again! Employee's ID email: ");
        empSalaryPerProj = MyToys.getADouble("Input employee's salary/project: ", "Please try again! Employee's salary/project is: ");
        employee[numberOfEmp] = new PartTime(empSalaryPerProj, empID, empName, empAddress, empEmail);
        numberOfEmp++;
        System.out.println("Added!");
    }
    
    public void sortBySalary() {
        int n = employee.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((employee[j] != null && employee[i] != null) && (employee[j].getEmpTotalSalary()< employee[i].getEmpTotalSalary())) {
                    Employee tmp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = tmp;
                }
            }
        }
        System.out.println("Sorted employee by Salary: ");
        printAll();
    }
    
    public void printAll() {
        String header = String.format("|%-8s|%-20s|%-15s|%-15s|%-22s|", "ID", "Name", "Address", "Email", "Total Salary Per Month");
        System.out.println(header);
        for (int i = 0; i < numberOfEmp; i++) {
            employee[i].showInfo();
        }
    }
    
    public static void menu() {
        System.out.println("============MENU============");
        System.out.println("1. Adding new SalesEmployee");
        System.out.println("2. Adding new StaffEmployee");
        System.out.println("3. Adding new PartTimeEmployee");
        System.out.println("4. Ascending sort and show all employee by salary.");
        System.out.println("5. Printing all employee");
        System.out.println("6. Quit");
    }
    
    public static int getChoice() {
        int choice;
        
        choice = MyToys.getAnInteger("Your choice: ", "Please try again! INPUT AN INTEGER CHOICE: ");
        return choice;
    }

}
