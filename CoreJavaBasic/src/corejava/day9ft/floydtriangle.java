package corejava.day9ft;

import java.util.Scanner;

public class floydtriangle {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in); // to  get users input
	int rows, num=1, counter,j;
	System.out.println("enter a number of rowrs  for floyd's triangle");
	
	//copying user input into an integer variable name rows 
	rows = input.nextInt();
	System.out.println("floyd's triangle");
	
	System.out.println("*************************");
	
	for (counter=1;counter <=rows; counter++) {
		
		
		for (j=1;j<=counter; j++) {
			
			System.out.println(num+"");
			// incrementing the num value
			num++;
		}
	// for new line 
		System.out.println();
	}

	
}
}
