import java.util.*;
class Reverse
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
	}
}