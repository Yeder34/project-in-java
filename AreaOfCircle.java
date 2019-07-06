/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.circle;

import java.util.Scanner;

/**
 *
 * @author manisha 1
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radius ;
        float pi=(float) 3.14;
        System.out.println("Enter the radius of circle:");
        Scanner s=new Scanner(System.in);
        radius=s.nextInt();
     float area=pi*radius*radius;
      float perimeter=2*pi*radius;
        System.out.println("The area of circle is:"+area);
        System.out.println("\nThe perimeter of circle is:"+perimeter);
         
    }
    
}


