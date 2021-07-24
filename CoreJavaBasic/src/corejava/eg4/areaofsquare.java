package corejava.eg4;

import java.util.Scanner;

public class areaofsquare {
public static void main(String[] args) {
	Scanner square= new Scanner(System.in);
	System.out.println("enter side value of square");
	double side=square.nextDouble();
	//area of square= side*side
	double area= square.nextDouble();
	area=side*side;
	System.out.println("the area of square is"+area);
}
}
