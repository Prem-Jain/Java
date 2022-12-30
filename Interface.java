package COE;

interface Shape4
{
	double area(int s);
}
class Squareeee implements Shape4
{
	public double area(int s)
	{
		System.out.println("Area method of Square Class");
		return s * s;
	}
}
class Cubeee extends Squareeee
{
	public double area(int s)
	{
		System.out.println("Area method of Cube Class");
		return s * super.area(s);
	}
}
class Circleee implements Shape4
{
	public double area(int r)
	{
		System.out.println("Area method of Circle Class");
		return 3.14 * r * r;
	}
}

public class Interface {
	public static void main(String[] args) {
		Shape4 s;
		s = new Cubeee();
		System.out.println("Volumn of Cube = " + s.area(10));
		s = new Circleee();
		System.out.println("Area of Circle = " + s.area(1));
	}
}
