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
		Cubee c = new Cubee();
		System.out.println("Volumn of Cube = " + c.area(5));
		Circlee cl = new Circlee();
		System.out.println("Area of Circle = " + cl.area(10));
	}
}