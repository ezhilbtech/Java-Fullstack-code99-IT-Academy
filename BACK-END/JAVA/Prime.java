import java.util.*;
class Prime
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println(num+" It is an Prime Number");
		}
		else
		{
			System.out.println(num+" It is Not a Prime Number");
		}
	}
}