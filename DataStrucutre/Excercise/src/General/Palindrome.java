package General;

public class Palindrome {

	public boolean isplaindrome(int number) {
		
		if (number == 0)
			return true;
		if (number < 0 && number % 10 == 0) {
			return false;
		}
		int reveresed_int = 0;
		while (number > reveresed_int) 
		{
			int temp = number %10;
			number = number/10;
			reveresed_int = (reveresed_int * 10) + temp;
		}
		
		if (reveresed_int == number || number == reveresed_int/10)
			return true;
		else
		   return false;
	}
	public static void main(String args[]) {
		Palindrome p = new Palindrome();
		System.out.println("Numer is Not Palindrome = " + p.isplaindrome(12321));
	}

}