package Math;

public class Arithmetic {
	
	public int add(int n, int m)
	{
		return n + m;
	}
	public int sub(int n, int m)
	{
		return n - m;
	}
	public int mul(int n, int m)
	{
		return n * m;
	}
	public int div(int n, int m)
	{
		return n / m;
	}
	public int reverse(int n)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(n);
		sb.reverse();
		int rev = Integer.parseInt(sb.toString());
		return rev;
	}
	public int pow(int a, int b)
	{
		int ans = 1;
		while(b != 0)
		{
			if((b & 1) == 1)
				ans = ans * a;
			a = a * a;
			b >>= 1;
		}
		return ans;
	}
}