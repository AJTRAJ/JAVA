package General;

public class ValidAnagram {

	public static boolean isAnagram (String first,String second) {
		if (first.length() != second.length())
			return false;
		
		int []char_counts = new int[26];
		for (int i =0 ;i < first.length();i++) {
			char_counts[first.charAt(i)-'a']++;
			char_counts[second.charAt(i)-'a']--;
			
		}
		for (int count:char_counts) {
			if ( count != 0)
				return false;
		}
		
		return true;
		
	}
	public static void main (String args[]) {
		System.out.println("testing anagram= " + isAnagram("hello","hello"));
		
	}
}
