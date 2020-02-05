import corejava.*;
/*Q1/ Write a class with two fields and one method that prints content
of fields on to the screen, then create object of your class in main
class and call class's method.*/
class Circle
{
  static int r;

    public static void print()
    {
		System.out.println(r);
   	}
}
public class OOPLect1
{
	public static void main(String []str)
	{
		Circle c=new Circle();
		c.r=9;
		c.print();
	}
}