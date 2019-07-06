/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Scanner;

/**
 *
 * @author manisha 1
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double inch;
        double meter;
        System.out.println("Enter the number in inches:");
        Scanner s=new Scanner(System.in);
        inch=s.nextDouble();
        meter=inch*0.0254;
        System.out.println("The number in meter is:"+meter);
    }
    
}
