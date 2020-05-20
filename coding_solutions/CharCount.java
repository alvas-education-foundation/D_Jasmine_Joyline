import java.util.*;
public class CharCount{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int i=0;
         int count[]=new int [256];
        System.out.println("Enter the String:");
         String s= sc.nextLine();
         for(i=0;i<s.length();i++)
         {
             count[(int)s.charAt(i)]++;
         }
         for(i=0;i<256;i++)
         {
            System.out.println((char)i+"-"+count[i]);
         }
     }
}
