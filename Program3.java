import java.util.*;
public class Program3 {
	private int countNotifications(int day,int size,int[] arr)
	{
		if(day>size)
			return 0;
		int count=0;
		for(int i=day;i<=size;i++)
		{
			int start = i-day, end = i+1;
			int[] subArray = Arrays.copyOfRange(arr, start, end);
			Arrays.sort(subArray);
			int length=subArray.length;
			int mid=(length-1)/2;
			int median = length%2==0 ? (subArray[mid]+subArray[mid+1])/2: subArray[mid];
			if(arr[i-1]>=(2*median))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Program3 ob = new Program3();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int day = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
		System.out.println(ob.countNotifications(day,size,arr));
		sc.close();
	}

}
