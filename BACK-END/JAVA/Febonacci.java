import java.util.*;
class Febonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int first=0;
		int last=1;
		for(int i=1;i<=num;i++)
		{
			System.out.println(first);
			int temp=first+last;
			last=first;
			first=temp;
		}
	}
}