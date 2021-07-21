package corejava.day2;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("c");
	}
}
