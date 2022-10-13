import java.util.*;
class CRC{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Generator : ");
		String gen = sc.nextLine();
		System.out.print("Enter the data : ");
		String data = sc.nextLine();
		String code = data; 
		for(int i = 1; i < gen.length(); i++)
			code += "0";
		code = data + divide(code, gen);
		System.out.println("The transmitied CodeWord is " + code);
		System.out.print("Enter the received CodeWord : ");
		String rec = sc.nextLine();
		if(Integer.parseInt(divide(rec, gen)) != 0)
		{
			System.out.println("Data Contains Errors!!!");
		}
		else
		{
			System.out.println("No Errors!!!");
		}
	}
	static String divide(String data, String gen)
	{
		int p = gen.length();
		int n = gen.length();
		String res = data.substring(0, p);
		String ans = "";
		for(int i = 0; i < p; i++)
		{
			if(res.charAt(i) == gen.charAt(i))
				ans += "0";
			else
				ans += "1";
		}
		while(p < data.length())
		{
			if(ans.charAt(0) == '0')
			{
				ans = ans.substring(1, n) + String.valueOf(data.charAt(p));
				p++;
			}
			res = ans;
			ans = "";
			for(int i = 0; i < gen.length(); i++)
	                {
        	                if(res.charAt(i) == gen.charAt(i))
                	                ans += "0";
                        	else
                                	ans += "1";
                	}

		}
		return ans.substring(1, ans.length());
	}
}	
