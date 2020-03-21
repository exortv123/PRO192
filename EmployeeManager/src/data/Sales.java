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
public class Sales extends Employee {

    private double empBasicSalary;
    private double empSalaryPerSale;

    public Sales(double empBasicSalary, double empSalaryPerSale, String empID, String empName, String empAdress, String empEmail) {
        super(empID, empName, empAdress, empEmail);
        this.empBasicSalary = empBasicSalary;
        this.empSalaryPerSale = empSalaryPerSale;
    }

    public double getEmpBasicSalary() {
        return empBasicSalary;
    }

    public void setEmpBasicSalary(double empBasicSalary) {
        this.empBasicSalary = empBasicSalary;
    }

    public double getEmpExtraSalary() {
        return empSalaryPerSale;
    }

    public void setEmpExtraSalary(double empExtraSalary) {
        this.empSalaryPerSale = empExtraSalary;
    }

    @Override
    public double getEmpTotalSalary() {
        return (empBasicSalary + empSalaryPerSale);
    }

    @Override
    public void showInfo() {
        String msg;
        msg = String.format("|%-8s|%-20s|%-15s|%-15s|%15.2f|", empID, empName, empAdress, empEmail, getEmpTotalSalary());
        System.out.println(msg);
    }

}
