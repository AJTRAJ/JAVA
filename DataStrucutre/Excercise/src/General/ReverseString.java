package General;

public class ReverseString {
	
	public static String reverseString(String temp1) {
		
		String result="";
		String[] tt = temp1.split("\\.");
		 System.out.println("Final String is = " +tt[0]);
	        for (int i = tt.length - 1; i >= 0; i--)
	        {
	        	result += tt[i] + ".";
	        	System.out.println(" String is = " +result);
	        }
	        System.out.println("Final String is = " +result);
		return result;
		
	}
	public static void main(String[] args) {
		
		String  temp = "i.like.this.program.very.much";
		
		System.out.println("Input String is = " +temp);
		
		String reversed = reverseString(temp);
		
		  System.out.println("Reversed String:");
	        System.out.println(reversed);
	}
}

