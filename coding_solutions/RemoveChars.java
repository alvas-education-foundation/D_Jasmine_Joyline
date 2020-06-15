import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        String originalstring="Learning never stops";
        System.out.println("Original string is :  "+ originalstring);
        System.out.println("");
        System.out.println("Please enter unwanted characters as String");
        System.out.println("");
        Scanner in =new Scanner(System.in);
        String removecharacterstring=in.nextLine();
        String output=removeSpecificChars(originalstring, removecharacterstring);
        System.out.println("");
        System.out.print("Output is :  " );
        System.out.println(output);
    }
   
    public static String removeSpecificChars(String originalstring ,String removecharacterstring)
    {
        char[] orgchararray=originalstring.toCharArray();
        char[] removechararray=removecharacterstring.toCharArray();
        int start,end=0;
        boolean[]  tempBoolean = new boolean[128];
        for(start=0;start < removechararray.length;++start)
        {
            tempBoolean[removechararray[start]]=true;
        }
        for(start=0;start < orgchararray.length;++start)
        {
            if(!tempBoolean[orgchararray[start]])
            {
                orgchararray[end++]=orgchararray[start];
            }
        }
        return new String(orgchararray,0,end);
    }
}
