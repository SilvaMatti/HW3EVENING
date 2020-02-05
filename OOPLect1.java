import corejava.*;
/*Q1/ Write a class with two fields and one method that prints content
of fields on to the screen, then create object of your class in main
class and call class's method.*/

class Circle
{
	int r;

	public Circle()
	{
		r=1;
	}

	public Circle(int i)
	{
		r=i;
	}

	public void output()
	{
		System.out.println(r);
	}
}

public class OOPLect1
{
	public static void main(String []args)
	{
		System.out.println("Hello");
		Circle ob = new Circle(5);
		ob.output();

		Circle c = new Circle();
		c.output();
	}
}