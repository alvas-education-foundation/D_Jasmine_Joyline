class Shape
{
    void print1()
    {
        	System.out.println("This is This is shape");
    }
}
class Rectangle extends Shape
{
    void print2()
    {
        	System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape
{
    void print3()
    {
        	System.out.println("This is circular shape");
    }
}


class Square extends Rectangle
{
    void print4()
    {
        	System.out.println("Square is a rectangle");
    }
}

public class Main
{
	public static void main(String[] args) {
	    Square s=new Square();
	    s.print4();
	    s.print2();
	    s.print1();
	}
}
