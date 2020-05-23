import java.util.*;
class RottenOranges
{
    static  boolean issafe(int i,int j,int R,int C)
    {
        if (i >= 0 && i < R && j >= 0 && j < C) 
        return true; 
        return false; 
    }
     static int rotOranges(int [][]v) 
     {
          boolean changed = false; 
          int R=v.length;
          int C=v[0].length;
    int no = 2; 
    while (true) { 
        for (int i = 0; i < R; i++) { 
            for (int j = 0; j < C; j++) { 
  
                // Rot all other oranges present at 
                // (i+1, j), (i, j-1), (i, j+1), (i-1, j) 
                if (v[i][j] == no) { 
                    if (issafe(i + 1, j,R,C) && v[i + 1][j] == 1) { 
                        v[i + 1][j] = v[i][j] + 1; 
                        changed = true; 
                    } 
                    if (issafe(i, j + 1,R,C) && v[i][j + 1] == 1) { 
                        v[i][j + 1] = v[i][j] + 1; 
                        changed = true; 
                    } 
                    if (issafe(i - 1, j,R,C) && v[i - 1][j] == 1) { 
                        v[i - 1][j] = v[i][j] + 1; 
                        changed = true; 
                    } 
                    if (issafe(i, j - 1,R,C) && v[i][j - 1] == 1) { 
                        v[i][j - 1] = v[i][j] + 1; 
                        changed = true; 
                    } 
                } 
            } 
        } 
  
        // if no rotten orange found it means all 
        // oranges rottened now 
        if (!changed) 
            break; 
        changed = false; 
        no++; 
    } 
  
    for (int i = 0; i < R; i++) { 
        for (int j = 0; j < C; j++) { 
  
            // if any orange is found to be 
            // not rotten then ans is not possible 
            if (v[i][j] == 1) 
                return -1; 
        } 
    } 
  
    // Because initial value for a rotten 
    // orange was 2 
    return no - 2; 
} 
  
     
     
}
public class Main
{
	public static void main(String[] args) {
	    // int v[][] = { { 2, 1, 0, 2, 1 }, 
        //            { 1, 0, 1, 2, 1 }, 
        //            { 1, 0, 0, 2, 1 } };
        int v[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column size " );
        int R=sc.nextInt();
        int C=sc.nextInt();
        System.out.println("Enter the array elements " );
         for (int i = 0; i < R; i++) { 
            for (int j = 0; j < C; j++) { 
                v[i][j]=sc.nextInt();
            }
         }
         
        
        RottenOranges ob=new RottenOranges();
        
		System.out.println("Min. time "+ob.rotOranges(v) );
	}
}
