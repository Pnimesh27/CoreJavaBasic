package corejava.eg7;

import java.util.Scanner;

public class reverseanumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num=0;
	int reversenum=0;
	System.out.println("enter a number ");
	num=scan.nextInt();
	while(num!=0) {
		reversenum=reversenum*10;
		reversenum=reversenum+ num%10;
		num=num/10;
	}
	System.out.println("reverse of an input number is "+reversenum);
}
}
