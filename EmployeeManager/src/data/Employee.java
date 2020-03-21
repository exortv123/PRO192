/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author SE140787
 */
public abstract class Employee {
    protected String empID;
    protected String empName;
    protected String empAdress;
    protected String empEmail;

    public Employee(String empID, String empName, String empAdress, String empEmail) {
        this.empID = empID;
        this.empName = empName;
        this.empAdress = empAdress;
        this.empEmail = empEmail;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empId) {
        this.empID = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAdress() {
        return empAdress;
    }

    public void setEmpAdress(String empAdress) {
        this.empAdress = empAdress;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    
    public abstract double getEmpTotalSalary();
    public abstract void showInfo();
    
    
    
}
