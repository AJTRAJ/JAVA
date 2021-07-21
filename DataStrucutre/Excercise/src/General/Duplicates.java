package General;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
	public static List<Integer> duplicates(int[] s) {
		List<Integer> output_arr = new ArrayList();
		
		for (int i=0;i<s.length;i++) {
			int index = Math.abs(s[i]) -1 ;
			if (s[index]< 0) output_arr.add(index +1);
			s[index] = -s[index];	
			
		}
		
		
		return output_arr;
		
	}
public static void main(String [] args) {
	
	int[] test  = {2, 4, 5, 2, 5};
	System.out.println("Duplicates under array is =  " + duplicates(test));
	
}
}
