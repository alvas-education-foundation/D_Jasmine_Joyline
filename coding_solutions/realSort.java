/*Write a program that will read a sequence of positive real numbers entered by the user and will print the same numbers in sorted order from smallest to largest. 
The user will input a zero to mark the end of the input. Assume that at most 100 positive numbers will be entered./
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double a[]=new double[100];
	    System.out.println("Enter the value of n:");
	    int n=sc.nextInt();
	    System.out.println("Enter the array elements:");
	    for(int i=0;i<n;i++)
	     a[i]=sc.nextDouble();
	    for(int i=0;i<n-1;i++)
	    for(int j=i+1;j<n-1;j++)
	    {
	        if(a[i]>a[j])
	        {
	        double temp=a[i];
	        a[i]=a[j];
	        a[j]=temp;
	        }
	    }
	    System.out.println("The sorted array :");
	    for(int i=0;i<n-1;i++)
	    System.out.println(a[i]+" ");
	    
	}
}
