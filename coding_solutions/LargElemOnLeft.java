/* Given an array arr[] of the positive integers of size N, the task is to find the largest element on the left side of each index which is smaller than the element present at that index. Note: If no such element is found then print -1*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n,i;
	    int a[]= new int [10000];
	    int max,val;
	    int b[]=new int[10000];
	    n=sc.nextInt();
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    b[0]=-1;
	    //b[1]=a[0];
	    for(i=1;i<n;i++)
	    {
	       val=a[i];
	       max=-1;
	       for(int j=0;j<i;j++)
	       {
	           if(a[j]<val && a[j]>max)
	           {
	            max=a[j];
	           
	           }
	       }
	         if(max==-1)
	           {
	            max=-1;
	           }
	           
	       b[i]=max;
	    }
	    for(i=0;i<n;i++)
	    {
	        System.out.print(b[i]+" ");
	    }
	    
	    
		
	}
}
