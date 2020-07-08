import java.util.Scanner;
public class nearestpalindrome{

     public static void main(String []args){
        
        int num,rem,n;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(true)
        {
            int rev=0;
            n=num;
            while(n>0)
            {
                rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            if(num==rev)
            {
                System.out.println(num);
                break;
            }
            else
            num=num+1;
        }
     }
}
