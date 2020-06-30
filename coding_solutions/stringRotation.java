//Write a Java Program to determine whether one string is a rotation of another.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str1=sc.next();
	    String str2=sc.next();
	    if(str1.length()!=str2.length())
	    System.out.println("No");
	    else
	    {
	       String str3=str1+str2;
	       if(str3.indexOf(str2)!=-1)
	       System.out.println("Yes");
	       else
	       System.out.println("No");
	    }
	    
	}
}
