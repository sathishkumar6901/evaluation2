import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		String[] str = new String[n];
		int dash=n/2;
		for(int i=0;i<n;i++)
		{
			int x = sc.nextInt();
			String s = sc.next();
			arr[i]=x;
			str[i]=dash>0?"-":s;
			dash--;
		}
		for(int i=0;i<n;i++)
		{
			int j=i-1,intTemp=arr[i];
			String strTemp=str[i];
			while(j>=0 && arr[j]>intTemp)
			{
				arr[j+1]=arr[j];
				str[j+1]=str[j];
				j--;
			}
			arr[j+1]=intTemp;
			str[j+1]=strTemp;
		}
		String result="";
		for(int i=0;i<n;i++)
		{
			result+=str[i];
			result+=" ";
		}
			
		System.out.println(result);
		
		sc.close();
	}

}
