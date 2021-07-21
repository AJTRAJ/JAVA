package General;

public class ReverseInteger {

	public int reverse(int number) {
		
		int reversed = 0;
		int temp = 0 ;
		
		while ( number > 0) {
		
			temp = number %10;
			number = number/10;
			reversed =  (reversed *10) + temp;
		}
		
		return reversed;
		
		
	}
	public static void main(String args[]) {
		ReverseInteger p = new ReverseInteger();
		System.out.println("Numer is reverse = " + p.reverse(123));
	}

}