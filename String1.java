import java.util.*;
public class String1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING");		
		String s=sc.nextLine();
		String data="";
		int l=s.length();
		System.out.println("LENGTH IS:"+l);
	        String m=s.substring(s.length()/2);
		System.out.println("half string is:"+m);
	}
}