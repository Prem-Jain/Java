import java.util.*;
class Circle
{
	float r;
	void area()
	{
		double a;
		a = r * r * 3.141;
		System.out.println("Area is " + a);
	}
}

class CircleArea
{
	public static void main(String X[])
	{
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the radius : ");	
		c.r = sc.nextFloat();
		c.area();
	}
}	
