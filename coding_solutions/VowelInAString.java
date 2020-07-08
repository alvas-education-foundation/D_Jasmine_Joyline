package proj;
import java.util.*;
import java.lang.*;
public class vowelsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int len=0,len1=0,count=0,i=0,j=0,l,count1=0;
		String S=sc.nextLine();
		int N=sc.nextInt();
		int K=sc.nextInt();
		//System.out.println();
		//sc.nextLine();
	
		String s=S.toLowerCase();
		l=S.length();
		while(i<l)
		{
			j=i;
			while(j<l&&count<=K)
			{
				if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
				{
					count++;
					char b=s.charAt(j);
					 s=s.replace(b,'*');
				}
				
				len++;
				j++;
			}
			
			if(K==count&&len>len1)
			{
				len1=len;
				 count1=count;
			}
			count=0;
			len=0;
			s=S.toLowerCase();
			i++;
		}
		
		if(count1==0)
			System.out.println("-1");
		else
		System.out.println(len1);

	}

}
