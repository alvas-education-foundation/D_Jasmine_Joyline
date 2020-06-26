import java.util.*;
public class Main { 


	static void printPermutn(String str, String ans) 
	{ 

		// If string is empty 
		if (str.length() == 0) { 
			System.out.print(ans + " "); 
			return; 
		} 

		for (int i = 0; i < str.length(); i++) { 

			// ith character of str 
			char ch = str.charAt(i); 

			// Rest of the string after excluding 
			// the ith character 
			String ros = str.substring(0, i) + 
						str.substring(i + 1); 

			// Recurvise call 
			printPermutn(ros, ans + ch); 
		} 
	} 


	public static void main(String[] args) 
	{ 
	    Scanner sc=new Scanner(System.in);
		String s = sc.next(); 
		printPermutn(s, ""); 
	} 
} 
