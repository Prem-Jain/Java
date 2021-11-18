import java.util.*;
class Multiple
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num , i = 1;
		System.out.print("Enter the number = ");
		num = sc.nextInt();
		System.out.print("The multiples of " + num + " are ");
		for(; i <= num; i++)
		{
			if(num % i == 0)
				System.out.print(i + " ");
		}
		System.out.println("\nEnd of the Program...");
	}
}
