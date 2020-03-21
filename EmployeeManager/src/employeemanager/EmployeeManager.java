/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager;

import data.*;
/**
 *
 * @author SE140787
 */
public class EmployeeManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        
        Cabinet folder = new Cabinet();
        do {
            Cabinet.menu();
            choice = Cabinet.getChoice();
            switch(choice) {
                case 1:
                    System.out.println("Adding new SalesEmployee processing..");
                    folder.addNewSalesEmp();
                    break;
                case 2:
                    System.out.println("Adding new StaffEmployee processing..");
                    folder.addNewStaffEmp();
                    break;
                case 3:
                    System.out.println("Adding new PartTimeEmployee processing..");
                    folder.addNewPartTimeEmp();
                    break;
                case 4:
                    System.out.println("Ascending sort all employee processing..");
                    folder.sortBySalary();
                    break;
                case 5:
                    System.out.println("Printing all employee processing..");
                    folder.printAll();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Wrong format input!");
            }
        }while (choice != 6);
    }
    
}
