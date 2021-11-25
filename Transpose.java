package unit1;
import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows and columns of a matrix : ");
		int r, c, i, j;
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] mat = new int[r][c];
		System.out.println("Enter the elements of the matrix : ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("The given matrix is : ");
		display(mat, r, c);
		int[][] tra = new int[c][r];
		for(i = 0; i < c; i++)
		{
			for(j = 0; j < r; j++)
			{
				tra[i][j] = mat[j][i];
			}
		}
		System.out.println("The transpose of given matrix is : ");
		display(tra, c, r);
		sc.close();
	}
	static void display(int a[][], int m, int n)
	{
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
