package corejava.eg8;

public class primenumbers {
public static void main(String[] args) {
	int i= 0;
	int num=0;
    String primenumbers=""; // empty string
    for (i=1; i<=100;i++)
   
   {
   int counter= 0;
   for (num=i; num>=1; num--) {
	   if(i%num==0) {
		   counter = counter+1;
	   } 
	   
	   
   }
   if (counter==2) {
	   primenumbers= primenumbers+i+"";
   }
    }
    	System.out.println("prime numbers from 1to 100 are ");
    	System.out.println(primenumbers);
}
}
