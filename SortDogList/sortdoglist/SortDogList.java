/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortdoglist;

import java.util.Scanner;
import data.Dog;
import util.MyToys;

/**
 *
 * @author Admin
 */
public class SortDogList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog[] = new Dog[3];

        System.out.println("ASCENDING SORT");
        System.out.println("You are required to input 3 Dog before sorting!");
        inputNewDog(dog);
        ascSortYob(dog);
        ascSortWeight(dog);

    }

    public static void inputNewDog(Dog dog[]) {
        String id, name;
        int yob;
        double weight;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < dog.length; i++) {
            System.out.println("Input dog info of dog no. # "
                    + (i + 1) + "/" + dog.length);
            id = MyToys.getAString("Input ID: ", "Wrong input format!");
            name = MyToys.getAString("Input name: ", "Wrong input format!");
            yob = MyToys.getAnInteger("Input yob: ", "Wrong input format!");
            weight = MyToys.getADouble("Input weight: ", "Wrong input format!");

            dog[i] = new Dog(id, name, yob, weight);
        }
        System.out.println("Dog list: ");
        for (Dog x : dog) {
            x.showProfile();
        }
    }

    public static void ascSortYob(Dog dog[]) {
        for (int i = 0; i < dog.length - 1; i++) {
            for (int j = i + 1; j < dog.length; j++) {
                if (dog[i].getYob() > dog[j].getYob()) {
                    Dog tmp;
                    tmp = dog[i];
                    dog[i] = dog[j];
                    dog[j] = tmp;
                }
            }
        }
        System.out.println("===Ascending sort by Dog's yob===");
        for (Dog x : dog) {
            x.showProfile();
        }
    }

    public static void ascSortWeight(Dog dog[]) {
        for (int i = 0; i < dog.length - 1; i++) {
            for (int j = i + 1; j < dog.length; j++) {
                if (dog[i].getWeight() > dog[j].getWeight()) {
                    Dog tmp;
                    tmp = dog[i];
                    dog[i] = dog[j];
                    dog[j] = tmp;
                }
            }
        }
        System.out.println("===Ascending sort by Dog's weight===");
        for (Dog x : dog) {
            x.showProfile();
        }
    }
}
