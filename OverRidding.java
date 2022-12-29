package COE;

class Shape2
{
	double area(int s)
	{
		System.out.println("Area method of Shape Class");
		return s;
	}
}
class Squaree extends Shape2
{
	double area(int s)
	{
		System.out.println("Area method of Square Class");
		return s * super.area(s);
	}
}
class Cube extends Squaree
{
	double area(int s)
	{
		System.out.println("Area method of Cube Class");
		return s * super.area(s);
	}
}
class Circle extends Shape2
{
	double area(int r)
	{
		System.out.println("Area method of Circle Class");
		return 3.14 * r * super.area(r);
	}
}
public class OverRidding {

	public static void main(String[] args) {
		Shape2 ob;
		ob = new Cube();
		System.out.println("Volumn of Cube = " + ob.area(5));
		ob = new Circle();
		System.out.println("Area of Circle = " + ob.area(10));
	}
}