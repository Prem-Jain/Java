import java.util.*;

class BestFit
{
	static void bFit(int blockSize[], int m, int processSize[], int n)
	{
		int allocation[] = new int[n]; 
		for(int i = 0; i < allocation.length; i++)
			allocation[i] = -1;
		for(int i = 0; i < n; i++)
		{
			int bestldx = -1;
			for(int j = 0; j < m; j++)
			{
				if(blockSize[j] >= processSize[i])
				{
					if(bestldx == -1)
						bestldx = j;
					else if(blockSize[bestldx] > blockSize[j])
						bestldx = j;
				}
			}
			if(bestldx != -1)
			{
				allocation[i] = bestldx;
				blockSize[bestldx] -= processSize[i];
			}
		}
		System.out.println("\nProcess no.\tProcess Size\tBlock no.");
		for(int 	i = 0; i < n; i++)
		{
			System.out.print(" " + (i + 1) + "\t\t" + processSize[i] + "\t\t");
			if(allocation[i] != -1)
				System.out.print(allocation[i] + 1);
			else
				System.out.print("Not allocated");
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of blocks : ");
		int m = sc.nextInt();
		int blockSize[] = new int[m];
		System.out.print("Enter block sizes : ");
		for(int i = 0; i < m; i++)
			blockSize[i] = sc.nextInt();
		System.out.print("Enter no of process : ");
		int n = sc.nextInt();
		int processSize[] = new int[n];
		System.out.print("Enter process Sizes : ");
		for(int i = 0; i < n; i++)
			processSize[i] = sc.nextInt();
		bFit(blockSize, m, processSize, n);
	}
}
	
