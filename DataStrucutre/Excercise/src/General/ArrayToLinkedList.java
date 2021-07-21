package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayToLinkedList {

	public static int createList(Integer[] a) {
		
		if (a==null || a.length ==0) return 0;
		LinkedList<Integer> temp_list = new LinkedList<Integer>();
		List<Integer> intList = new ArrayList<>(Arrays.asList(a));
		boolean foundvalue = intList.contains(-1);
		
		while(foundvalue) {
			
			int value = a[1];
			temp_list.addFirst(a[0]);
			if (value == -1 ) {
				temp_list.addLast(e);
				value = a[value];
			}
			
		}
		else
		{
			temp_list = new LinkedList(ArrayList());
		}
		
		
		
		return temp_list.size();
		
	}
}
