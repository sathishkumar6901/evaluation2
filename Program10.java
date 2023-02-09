import java.util.*;

class Divisible
{
	static void findDivisible(int[] arr,int n,int k)
	{
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if((arr[i]+arr[j])%k==0)
					result.add(new ArrayList(Arrays.asList(arr[i],arr[j])));
		System.out.println(result);
	}
}

public class Program10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		Divisible.findDivisible(arr,n,k);
		sc.close();
	}
}