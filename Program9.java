import java.util.*;

public class Program9
{
	static void fillMatrix(int start,int end,int i,int j,int col,int temp,int[][] arr)
	{
		if(i==start && j==end)
		{
			arr[i][j]=1;
			return;
		}
		fillMatrix(start,end,j,col-i,col,arr[i][j],arr);
		arr[i][j]=1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int row=n,col=n-1;
		for(int i=0;i<row;i=i+2)
		{
			for(int j=i;j<=col-i;j++)
			{
				fillMatrix(i,j,j,col-i,col,arr[i][j],arr);
			}
			row-=2;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		sc.close();
	}
}