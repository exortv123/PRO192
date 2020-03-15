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
public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(a, b, b);
    }

    @Override
    public double getPerimeter() {
        return ((a + b) * 2);
    }

    @Override
    public double getArea() {
        return (a * b);
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE      |%9.2f|%10.2f|   NULL  |%9.2f|%6.2f|\n",
                a, b, getPerimeter(), getArea());
    }

}
