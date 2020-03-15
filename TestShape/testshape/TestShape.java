/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape;

import java.util.Scanner;

import data.Circle;
import data.Rectangle;
import data.RightTriangle;
import data.Shape;
import data.Square;
import data.Triangle;

import util.MyToys;

/**
 *
 * @author SE140787
 */
public class TestShape {

    /**
     */
    private static Shape arr[] = new Shape[100];
    private static int numberOfShape = 0;

    public static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("1. Add new Triangle");
        System.out.println("2. Add new Right Triangle");
        System.out.println("3. Add new Rectangle");
        System.out.println("4. Add new Square");
        System.out.println("5. Add new Circle");
        System.out.println("6. Ascending sort");
        System.out.println("7. Show all");
        System.out.println("8. Exit.");
        System.out.print("Your choice: ");
    }

    public static void addNewTri() {
        double a, b, c;

        System.out.println("Add new Triangle processing...");
        a = MyToys.getADouble("Input first edge: ", "Wrong input format!");
        b = MyToys.getADouble("Input second edge: ", "Wrong input format!");
        c = MyToys.getADouble("Input third edge: ", "Wrong input format!");
        arr[numberOfShape] = new Triangle(a, b, c);
        numberOfShape++;
    }

    public static void addNewRTri() {
        double a, b;

        System.out.println("Add new Right Triangle processing...");
        a = MyToys.getADouble("Input first edge: ", "Wrong input format!");
        b = MyToys.getADouble("Input second edge: ", "Wrong input format!");
        arr[numberOfShape] = new RightTriangle(a, b);
        numberOfShape++;
    }

    public static void addNewRec() {
        double length, width;

        System.out.println("Add new Rectangle processing...");
        length = MyToys.getADouble("Input length: ", "Wrong input format!");
        width = MyToys.getADouble("Input width: ", "Wrong input format!");
        arr[numberOfShape] = new Rectangle(length, width);
        numberOfShape++;
    }

    public static void addNewSquare() {
        double a;

        System.out.println("Add new Square processing...");
        a = MyToys.getADouble("Input edge: ", "Wrong input format!");
        arr[numberOfShape] = new Square(a);
        numberOfShape++;
    }

    public static void addNewCircle() {
        double radius;

        System.out.println("Add new Circle processing...");
        radius = MyToys.getADouble("Input radius: ", "Wrong input format!");
        arr[numberOfShape] = new Circle(radius);
        numberOfShape++;
    }

    public static void ascSorting() {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] != null && arr[i] != null) && (arr[j].getArea() < arr[i].getArea())) {
                    Shape tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Sorted array by Area: ");
        printAll();
    }

    public static void printAll() {
        String header = String.format("|%-15s|%6s|%6s|%6s|%6s|%6s|", "TYPE", "FirstEdge", "SecondEdge", "ThirdEdge", "PERIMETER", "AREA");
        System.out.println(header);
        for (int i = 0; i < numberOfShape; i++) {
            arr[i].paint();
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addNewTri();
                    break;
                case 2:
                    addNewRTri();
                    break;
                case 3:
                    addNewRec();
                    break;
                case 4:
                    addNewSquare();
                    break;
                case 5:
                    addNewCircle();
                    break;
                case 6:
                    ascSorting();
                    break;
                case 7:
                    printAll();
                    break;
                case 8:
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Wrong format input!");
            }
        } while (choice != 8);

    }

}
