package COE;

class Shape1
{
	void area()
	{
		System.out.println("Area method of shape class");
	}
}

class Rectangle extends Shape1
{
	public void area(int l, int b)
	{
		System.out.println("Area of rectange : " + l * b);
	}
}

class Square extends Shape1
{
	public void area(int s)
	{
		System.out.println("Area of Square : " + s * s);
	}
}

public class Inheritance_Overloading {
	public static void main(String args[])
	{
		Shape1 s = new Shape1();
		s.area();
		Rectangle rec = new Rectangle();
		rec.area(12, 13);
		Square sq = new Square();
		sq.area(55);
	}
}