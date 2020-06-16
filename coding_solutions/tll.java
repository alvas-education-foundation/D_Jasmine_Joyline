/*
 * Java Program to Implement Triply Linked List
 */
 
import java.util.Scanner;    
 
/* class TLLNode */
class TLLNode
{
    TLLNode left, right, middle;
    int data;
 
    /* Constructor */
    public TLLNode(int x)
    {
        data = x;
        left = null;
        right = null;
        middle = null;
    }
}
 
/* class TriplyLinkedList */
class TriplyLinkedList
{
    TLLNode root, tmp;
 
    /* Constructor */
    public TriplyLinkedList()
    {
        root = null;
        tmp = null;
    }
    /* function to check if empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* function to clear list */
    public void makeEmpty()
    {
        root = null;
        tmp = null;
    }
    /* function to insert */
    public void insert(int x)
    {
        root = insert(root, x);        
    }
    /* function to insert element */
    public TLLNode insert(TLLNode r, int x)
    {
        if (r == null)
        {    
            r = new TLLNode(x);
            r.middle = tmp;
        }
        else
        {
            tmp = r;
            if (r.data >= x)
                r.left = insert(r.left, x);
            else
                r.right = insert(r.right, x);
        }
        return r;
    }    
    /* Function for print */
    public void printList()
    {
        printList(root);
    }
    private void printList(TLLNode r)
    {
        if (r != null)
        {
            printList(r.left);
            System.out.print(r.data +" ");
            printList(r.right);
        }
    }
}
 
/* class TriplyLinkedListTest */
public class TriplyLinkedListTest
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Triply Linked List Test\n");  
        TriplyLinkedList tll = new TriplyLinkedList();
 
        char ch;
        /*  Perform list operations  */
        do    
        {
            System.out.println("\nTriply Linked List Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. check empty");
            System.out.println("3. make empty"); 
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                tll.insert( scan.nextInt() );                     
                break;                          
            case 2 :  
                System.out.println("Empty status = "+ tll.isEmpty());
                break;   
            case 3 :  
                System.out.println("\nList Cleared\n");
                tll.makeEmpty();
                break;            
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display list */ 
            System.out.print("\nList : ");
            tll.printList();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  
    }
}
