package corejava.eg5;

import java.util.Scanner;

public class areaoftringle {
public static void main(String[] args) {
	Scanner st=new Scanner(System.in);
	System.out.println("enter base of a triangle");
	double base= st.nextDouble();
	System.out.println("enter height of an triangle ");
	double height= st.nextDouble();
	// area of triangle = 1/2 *height *base
	double area= st.nextDouble();
	area = .5*base*height;
	System.out.println(area);
			
}
}
