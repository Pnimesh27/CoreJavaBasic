package corejava.day5;

public class swap2num {

	public static void main(String[] args) {
		
	float first=23.4f, second=34.2f;
	
	System.out.println("before swap");
	System.out.println("1st number is "+first);
	System.out.println("2nd number is "+second);
	
	float temporary=first;
	
	first=second;
	
   second= temporary;
	
   System.out.println("after swap");
		System.out.println("1st number is "+first);
		System.out.println("2nd number is"+second);
		
		
	}
	
	
	
}
