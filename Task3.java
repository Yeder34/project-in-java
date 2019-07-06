/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg3;

import java.util.Scanner;

/**
 *
 * @author manisha 1
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m > 0)
        {
             
            n = m % 10;
            sum = sum + n;
            m = m / 10;
           
        }
        System.out.println("Sum of Digits:"+sum);
    }
}
    
    

