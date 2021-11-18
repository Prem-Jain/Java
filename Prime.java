import java.util.*;
class Prime
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter the Number : ");
		num = sc.nextInt();
		if(num < 0)
			System.out.println("The given number " + num + " is a negative number");
		else if(num ==  0)
			System.out.println("The given number " + num + " is a Zero");
		else if(num == 1)
			System.out.println("The given number " + num + " is neither prime nor Composite");
		else
		{
			int i, fc = 0;
			for(i = 2; i <= (num / 2); i++)
				if(num % i == 0)
					fc++;
			if(fc == 0)
				System.out.println("The given number " + num + " is a prime number");
			else
				System.out.println("The given number " + num + " is a composite number");
		}		
	}
}
