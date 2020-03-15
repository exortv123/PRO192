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
public class RightTriangle extends Triangle {

    public double thirdEdge = Math.pow(a, 2) + Math.pow(b, 2);

    public RightTriangle(double a, double b) {
        super(a, b, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    @Override
    public double getPerimeter() {
        return (a + b + c);
    }

    @Override
    public double getArea() {
        return (a * b) / 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RIGHT RECTANGLE|%9.2f|%10.2f|%9.2f|%9.2f|%6.2f|\n",
                a, b, c, getPerimeter(), getArea());
    }
}
