import java.util.*;

public class Main  
{  
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");  
        String string = sc.nextLine();  
          
        //Displays individual characters from given string  
        System.out.println("Individual characters from given string:");  
          
        //Iterate through the string and display individual character  
        for(int i = 0; i < string.length(); i++){  
            System.out.print(string.charAt(i) + "  ");  
        }  
    }  
}  
