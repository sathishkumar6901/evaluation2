import java.util.*;

class twoFriends
{
	Map<Integer,Integer> m;
	twoFriends()
	{
		m = new HashMap<>();
	}
	void findIndices(int[] arr,int n,int cost)
	{
		for(int i=0;i<n;i++)
		{
			int sum=cost-arr[i];
			if(m.containsKey(sum))
			{
				System.out.println("indices are:"+ m.get(sum)+","+(i+1));
				break;
			}
			m.put(arr[i],i+1);
		}
	}
}
public class Program1
{
	public static void main(String[] args)
	{
		twoFriends ob = new twoFriends();
		Scanner sc = new Scanner(System.in);
		int cost = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		ob.findIndices(arr,n,cost);
		sc.close();
	}
}