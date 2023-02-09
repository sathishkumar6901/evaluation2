import java.util.*;
public class Program4 {
	private static String isValidPassword(List<String> list,String password)
	{
		String s="";
		StringBuilder result = new StringBuilder();
		for(char c:password.toCharArray())
		{
			if(!s.isEmpty() && list.contains(s))
			{
				result.append(s);
				result.append(" ");
				s="";
			}
			s+=c;
		}
		if(list.contains(s))
			result.append(s);
		else
			return "WRONG PASSWORD";
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		List<StringBuilder> sbList = new ArrayList<>();
		for(int i=0;i<testCase;i++)
		{
			int n = sc.nextInt();
			List<String> list = new ArrayList<>();
			for(int j=0;j<n;j++)
			{
				String s = sc.next();
				list.add(s);
			}
			String password = sc.next();
			StringBuilder sb = new StringBuilder(isValidPassword(list,password));
			sbList.add(new StringBuilder(sb));
		}
		for(StringBuilder s:sbList)
				System.out.println(s);
		sc.close();
	}

}
