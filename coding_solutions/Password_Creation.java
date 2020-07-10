import java.util.*;
public class Main
{
    static String password_creation(String a,String b)
    {
        String s="";
        int i=0,j=0;
        int m=a.length();
        int n=b.length();
        char chara[]=a.toCharArray();
        char charb[]=b.toCharArray();
        while(i<m || j<n)
        {
            if(i<m)
            {
                s+=String.valueOf(chara[i]);
                i++;
            }
            if(j<n)
            {
                s+=String.valueOf(charb[j]);
                j++;
            }
        }
        return s;
    }
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter the two strings: ");
		String a=sc.next();
		String b=sc.next();
		System.out.println("Resultant password: "+password_creation(a,b));
	}
}
