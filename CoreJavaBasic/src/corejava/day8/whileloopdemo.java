package corejava.day8;

import java.util.Scanner;

public class whileloopdemo {
public static void main(String[] args) {
	
	int num, sum=0;
	Scanner me=new Scanner(System.in);{
	System.out.println("enter an integer value below 10");
   num=me.nextInt();
	while(num<=10) {
		sum=sum +num;
		num++;
}
	System.out.println(sum);
	System.out.format(" sum of the numbers from the while loop is:%d",sum);
}

}




}