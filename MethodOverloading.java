package COE;

class Shape
{
	int area(int side)
	{
		return side * side;
	}
	
	int area(int length, int breadth)
	{
		return length * breadth;
	}
	
	double area(double radius)
	{
		return 3.14 * radius * radius;
	}
	
	double area(double base, double height)
	{
		return 0.5 * base * height;
	}
}

public class MethodOverloading {
	
	public static void main(String args[])
	{
		Shape ob = new Shape();
		System.out.println("Area of Square = " + ob.area(5));
		System.out.println("Area of Rectangle = " + ob.area(5, 10));
		System.out.println("Area of Circle = " + ob.area(1.5));
		System.out.println("Area of Triangle = " + ob.area(3.0, 4.0));
	}	
}