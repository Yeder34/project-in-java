/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg10;

import java.util.Scanner;

/**
 *
 * @author manisha 1
 */
public class Task10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int num;
        System.out.println("Enter the num:");
        Scanner s=new Scanner(System.in);
         num=s.nextInt();
         for(i=1;i<=num;i++)
         {
             int cube=i*i*i;
             System.out.println("The cube of numbers is:"+cube);
         }
    }
    
}
