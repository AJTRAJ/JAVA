package General;
import java.util.*;
import java.util.Arrays;  
public class MyCode {
	
	// Java Program explaining util.Dictionary class Methods 
	// put(), elements(), get(), isEmpty(), keys() 
	// remove(), size() 
	    public static void main(String[] args) 
	    { 
	  
	        String input = "JAVA PYTHON  PERL C C++ RUBY PYTHON";
	        String skill_set = "PYTHON JAVA";
	        
	        
	       String[] skills = skill_set.split(" ");
	       String[] temp = input.split(" ");
	       
	        
	        String output = "";
	        String another_output = "";
	     
	        for (int i = 0 ; i < temp.length;i++) {
	        	if (skill_set.contains(temp[i])) 
	        		output += temp[i] + " " ;
	        	else {
	        		another_output += temp[i] + " ";
	        		
	        	}
	        	
	        }
	        
	        String[] convert = another_output.split(" ");
	        String final_output = convert.toString();
	        System.out.println("Converted Sets = " + final_output);
	        //Arrays.sort(convert);
	        
	       // Arrays.sort(another_output);
	        output = output + convert.toString();
	        
	        System.out.println("Given Iinput Sets = " + input);
	        System.out.println("Skill Sets = " + skill_set);
	        System.out.println("Student Order =  " + another_output);
	        System.out.println("Converted Sets = " + convert.toString());
	    } 
	   
	} 
