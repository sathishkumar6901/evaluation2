import java.util.*;

public class Program7
{
	private void findSubSet(int start,int[] arr,int n,List<List<Integer>> resultList,List<Integer> subList)
	{
		resultList.add(new ArrayList(subList));
		if(start==n)
			return;
		for(int i=start;i<n;i++)
		{
			subList.add(arr[i]);
			findSubSet(i+1,arr,n,resultList,subList);
			subList.remove(subList.size()-1);
		}
	}
	void subSet(int[] arr,int n)
	{
		List<List<Integer>> resultList = new ArrayList<>();
		List<Integer> subList = new ArrayList<>();
		findSubSet(0,arr,n,resultList,subList);
		System.out.println(resultList);
	}
	public static void main(String[] args)
	{
		Program7 ob = new Program7();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		ob.subSet(arr,n);
		sc.close();
	}
}