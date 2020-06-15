<<<<<<< HEAD
/*Given an array of positive integers. Write a C Program to find inversion count of array.
Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N, the size of array. The second line of each test case contains N elements.
Output:
Print the inversion count of array.
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
1 ≤ C ≤ 1018
Example:
Input:
1
5
2 4 1 3 5
Output:
3
Explanation:
Testcase 1: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0)
	    {
	    int n=sc.nextInt();
	    int count=0;
	    int a[]=new int[n];
	    for (int i=0;i<n;i++)
	      a[i]=sc.nextInt();
	    for(int i=0;i<n;i++)
	     for(int j=i+1;j<n-1;j++)
	     {
	         if(a[i]>a[j])
	         {
	             //int temp=a[i];
	             //a[i]=a[j];
	             //a[j]=temp;
	             count++;
	         }
	     }
	    
		System.out.println(count);
		t--;
	    }
	}
}
=======
/*Given an array of positive integers. Write a C Program to find inversion count of array.
Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N, the size of array. The second line of each test case contains N elements.
Output:
Print the inversion count of array.
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
1 ≤ C ≤ 1018
Example:
Input:
1
5
2 4 1 3 5
Output:
3
Explanation:
Testcase 1: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0)
	    {
	    int n=sc.nextInt();
	    int count=0;
	    int a[]=new int[n];
	    for (int i=0;i<n;i++)
	      a[i]=sc.nextInt();
	    for(int i=0;i<n;i++)
	     for(int j=i+1;j<n-1;j++)
	     {
	         if(a[i]>a[j])
	         {
	             //int temp=a[i];
	             //a[i]=a[j];
	             //a[j]=temp;
	             count++;
	         }
	     }
	    
		System.out.println(count);
		t--;
	    }
	}
}
>>>>>>> bcd2c42bb7a50466dca017bb6a143098866439b7
