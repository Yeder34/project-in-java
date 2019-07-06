/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg5;


import java.util.Scanner;

/**
 *
 * @author manisha 1
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double min;
        System.out.println("Enter the number of minutes:");
        Scanner s=new Scanner(System.in);
        double my= 60*24*365;
        min=s.nextDouble();
        long years=(long) (min/my);
        long days=(long) (min/60/24);
        System.out.println("The number of years is:"+years);
        System.out.println("The number of days is"+days);
    }
    
}
