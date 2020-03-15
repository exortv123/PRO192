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
public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public double getPerimeter() {
        return (4 * a);
    }

    @Override
    public double getArea() {
        return (a * a);
    }

    @Override
    public void paint() {
        System.out.printf("|SQUARE         |%9.2f|%10.2f|   NULL  |%9.2f|%6.2f|\n",
                a, a, getPerimeter(), getArea());

    }
    
}