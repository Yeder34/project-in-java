/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

import java.util.Scanner;

/**
 *
 * @author manisha 1
 */
public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        number=s.nextInt();
        if(number<0)
        {
            System.out.println("The number is negative");
        }
        else if(number>0)
        {
            System.out.println("The number is positive");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
    
}
