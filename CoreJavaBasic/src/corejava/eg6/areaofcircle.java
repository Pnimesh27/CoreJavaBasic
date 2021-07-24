package corejava.eg6;

import java.util.Scanner;

public class areaofcircle {
public static void main(String[] args) {
  Scanner sc= new Scanner (System.in);
  
   System.out.println("enter radius of a circle");
   double radius=sc.nextDouble();
  
   // area of circle = 3.14*radius*radius
   
   double area= sc.nextDouble();
   
   area= 3.14*radius*radius;
   System.out.println(area);
   
   
   
   // circumference = 2*PI*radius
   double circum=Math.PI*2*radius;
   System.out.println(circum);
}
}
