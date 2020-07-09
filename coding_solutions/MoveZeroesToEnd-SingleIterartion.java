import java.io.*; 
import java.util.*;
class Main
{ 
	
	static void pushZerosToEnd(int arr[], int n) 
	{ 
		int count = 0,temp; // Count of non-zero elements 

		for (int i = 0; i < n; i++) 
			if (arr[i] != 0) 
			{
			    temp=arr[count];
				arr[count] = arr[i]; 
				arr[i]=temp;
				count+=1;
			}
				
								
	    
	} 

	public static void main (String[] args) 
	{ 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the element: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");
		for (int i=0; i<n; i++) 
			arr[i]=sc.nextInt(); 
		pushZerosToEnd(arr, n); 
		System.out.println("Array after pushing zeros to the back: "); 
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" "); 
	} 
} 
