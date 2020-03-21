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
public class PartTime extends Employee {

    private double empSalaryPerProj;

    public PartTime(double empSalaryPerProj, String empID, String empName, String empAdress, String empEmail) {
        super(empID, empName, empAdress, empEmail);
        this.empSalaryPerProj = empSalaryPerProj;
    }

    public double getEmpSalaryPerProj() {
        return empSalaryPerProj;
    }

    public void setEmpSalaryPerProj(double empSalaryPerProj) {
        this.empSalaryPerProj = empSalaryPerProj;
    }

    @Override
    public double getEmpTotalSalary() {
        return (empSalaryPerProj);
    }

    @Override
    public void showInfo() {
        String msg;
        msg = String.format("|%-8s|%-20s|%-15s|%-15s|%15.2f|", empID, empName, empAdress, empEmail, getEmpTotalSalary());
        System.out.println(msg);
    }

}
