/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MyToys {
    private static Scanner sc = new Scanner(System.in);
    
    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.print(errorMsg);
            }
        }
    }
    
    public static double getADouble(String inputMsg, String errorMsg) {
        double n;
        
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.print(errorMsg);
            }
        }
    }
    
    public static String getAString(String inputMsg, String errorMsg) {
        String id;
        
        while (true) {
                System.out.print(inputMsg);
                id = sc.nextLine().trim();
                if (id.length() == 0 || id.isEmpty())
                    System.out.print(errorMsg);
                else
                    return id;
            }
        
    }
}
