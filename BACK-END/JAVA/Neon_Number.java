import java.util.*;
class Neon_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int power=num*num;
		int sum=0;
		while(power!=0)
		{
			int last=power%10;
			sum+=last;
			power=power/10;
		}
		if(num==sum)
		{
			System.out.println(num+" It is an Neon Number");
		}
		else
		{
			System.out.println(num+" It is Not an Neon Number");
		}
	}
}