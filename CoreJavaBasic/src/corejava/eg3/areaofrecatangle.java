package corejava.eg3;

import java.util.Scanner;

public class areaofrecatangle {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of an rectangle ");
	double length= scan.nextDouble();
	System.out.println("enter width of an rectangle");
	double width= scan.nextDouble();
	// area =length*width
	double area= length*width;
	System.out.println("area of recatangle is "+area);
	

}
}
