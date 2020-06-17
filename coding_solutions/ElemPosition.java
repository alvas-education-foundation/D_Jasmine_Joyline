//Write a Java program to find the row, column position of a specified number (row, column position) in a given 2-dimensional array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i,j,elem,rowpos=-1,colpos=-1;
	    System.out.println("Enter the row size ");
	    int row=sc.nextInt();
	     System.out.println("Enter the column size ");
	    int col=sc.nextInt();
	    int m[][]=new int[row+1][col+1];
	     System.out.println("Enter the matrix elements ");
	    for(i=0;i<row;i++)
	    for(j=0;j<col;j++)
	        m[i][j]=sc.nextInt();
	   System.out.println("Enter the element whose position has to be found ");
	   elem=sc.nextInt();
	    for(i=0;i<row;i++)
	    {
    	    for(j=0;j<col;j++)
    	    {
    	        if(m[i][j]==elem)
    	        {
    	          rowpos=i+1;
    	          colpos=j+1;
    	          System.out.println("Row: "+rowpos+"\tColumn: "+colpos);
    	       
    	        }
    	    }
	    }
	    if(rowpos==-1||colpos==-1)
		System.out.println("Element not present");
		
			
	}
}
