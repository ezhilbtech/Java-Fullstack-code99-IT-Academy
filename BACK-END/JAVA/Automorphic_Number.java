import java.util.*;
class Automorphic_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int temp=num;
		int recheck;
		int count=0;
		int last,rev=0,input=0;
		while(temp!=0)
		{
			recheck=temp%10;
			input=(input*10)+recheck;
			temp=temp/10;
			count++;
		}
		int power=num*num;
		for(int i=1;i<=count;i++)
		{
			while(power!=0)
			{
				last=power%10;
				rev=(rev*10)+last;
				break;
			}
			power=power/10;
		}
		if(input==rev)
		{
			System.out.println("It is an Automorphic number");
		}
		else
		{
			System.out.println("not an Automorphic number");
		}
	}
}