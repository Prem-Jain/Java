class Prime1
{
	public static void main(String X[])
	{
		int num = 20;
		if(num < 0)
			System.out.println("The given number " + num + " is a negative number");
		else if(num ==  0)
			System.out.println("The given number " + num + " is a Zero");
		else if(num == 1)
			System.out.println("The given number " + num + " is neither prime nor Composite");
		else
		{
			int i, fc, j = 0;
			for(i = 2; i <= num; i++)
			{		
				fc = 0;		
				for(j = 2; j <= (i / 2); j++)
					if(i % j == 0)
						fc++;
			if(fc == 0)
				System.out.print(i + " ");
			}
		}
	}		
}
