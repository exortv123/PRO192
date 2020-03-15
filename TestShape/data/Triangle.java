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
public class Triangle extends Shape {

    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getPerimeter() {
        return (a + b + c);
    }

    @Override
    public double getArea() {
        double p;
        p = (a + b + c) / 2;
        return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public void paint() {
        System.out.printf("|RECTANGLE      |%9.2f|%10.2f|%9.2f|%9.2f|%6.2f|\n",
                a, b, c, getPerimeter(), getArea());
    }

}
