import java.util.*;

public class Program6
{
	static void rotateMatrix(int start,int end,int i,int j,int col,int temp,int[][] arr)
	{
		if(i==start && j==end)
		{
			arr[i][j]=temp;
			return;
		}
		rotateMatrix(start,end,j,col-i,col,arr[i][j],arr);
		arr[i][j]=temp;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		for(int k=0;k<3;k++)
		{
			int row=n,col=n-1;
			for(int i=0;i<row;i++)
			{
				for(int j=i;j<col-i;j++)
				{
					rotateMatrix(i,j,j,col-i,col,arr[i][j],arr);
				}
				row--;
			}
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