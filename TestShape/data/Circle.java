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
public class Circle extends Shape {

    public static final double PI = 3.14;

    public Circle(double a) {
        super(a, a, a);
    }

    @Override
    public double getPerimeter() {
        return (2 * PI * a);
    }

    @Override
    public double getArea() {
        return (PI * Math.pow(a, 2));
    }

    @Override
    public void paint() {
        System.out.printf("|CIRCLE         |%9.2f|   NULL   |   NULL  |%9.2f|%6.2f|\n",
                a, getPerimeter(), getArea());
    }
}
