package COE;

abstract class Shape3
{
	public abstract double area(int s);
}
class Squareee extends Shape3
{
	public double area(int s)
	{
		System.out.println("Area method of Square Class");
		return s * s;
	}
}
class Cubee extends Squareee
{
	public double area(int s)
	{
		System.out.println("Area method of Cube Class");
		return s * super.area(s);
	}
}
class Circlee extends Shape3
{
	public double area(int r)
	{
		System.out.println("Area method of Circle Class");
		return 3.14 * r * r;
	}
}

public class Abstract {
	public static void main(String[] args) {
		Shape3 s;
		s = new Cubee();
		System.out.println("Volumn of Cube = " + s.area(5));
		s = new Circlee();
		System.out.println("Area of Circle = " + s.area(10));
	}
}
