import java.util.*;
class Rectangle
{
	int len;
	int br;
	void area()
	{
		int a;
		a = len * br;
		System.out.println("Area is " + a);
	}
}

class RectangleArea
{
	public static void main(String x[])
	{
		Rectangle r = new Rectangle();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length and breath of rectangle : ");
		r.len = scan.nextInt();
		r.br = scan.nextInt();
		r.area();
	}	
}

