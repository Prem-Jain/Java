import java.util.*;
class Bankers
{
	private int need[][], allocate[][], max[][], avail[][], total[][], np, nr;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of process : ");
		np = sc.nextInt();
		nr = sc.nextInt();
		need = new int[np][nr];
		max = new int[np][nr];
		allocate = new int[np][nr];
		total = new int[1][nr];
		avail = new int[1][nr];
		System.out.println("Enter aollocation matrix : ");
		for(int i = 0; i < np; i++)
			for(int j = 0; j < nr; j++)
			{
				allocate[i][j] = sc.nextInt();
				avail[0][j] += allocate[i][j];
			}
		System.out.println("Enter max matrix : ");
		for(int i = 0; i < np; i++)
			for(int j = 0; j < nr; j++)
				max[i][j] = sc.nextInt();
		System.out.println("Enter total resource matrix : ");
		for(int j = 0; j < nr; j++)
		{	
			total[0][j] = sc.nextInt();
			avail[0][j] = total[0][j] - avail[0][j];
		}
		sc.close();
	}
	private int[][] calc_need()
	{
		for(int i = 0; i < np; i++)
			for(int j = 0; j < nr; j++)
				need[i][j] = max[i][j] - allocate[i][j];
		return need;
	}
	private boolean check(int i)
	{
		for(int j = 0; j < nr; j++)
			if(avail[0][j] < need[i][j])
				return false;
		return true;
	}
	public void isSafe()
	{
		input();
		calc_need();
		boolean done[] = new boolean[np];
		int j = 0;	
		while(j < np)
		{
			boolean allocated = false;
			for(int i = 0; i < np; i++)
			{
				if(!done[i] && check(i))
				{
					for(int k = 0; k < nr; k++)
						avail[0][k] = avail[0][k] - need[i][k] + max[i][k];
					System.out.println("Allocated process : " + i);
					allocated = done[i] = true;
					j++;
					for(int l = 0; l < i; l++)
					{
						if(!done[l] && check(l))
						{
							for(int m = 0; m < nr; m++)
								avail[0][m] = avail[0][m] - need[i][m] + max[i][m];
							System.out.println("Allocated process : " + l);
							allocated = done[l] = true;
							j++;
						}	
					}
				}
			}	
			if(!allocated) break;
		}
		if(j == np)
			System.out.println("Safely allocated.");
		else
			System.out.println("All process can't be allocated.");
	}
	public static void main(String args[])
	{
		new Bankers().isSafe();
	}
}
