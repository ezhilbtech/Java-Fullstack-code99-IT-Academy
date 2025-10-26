import java.util.*;
class Perfect_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(num==sum)
		{
			System.out.println("the given number is "+num+" the factors sum of the number is "+sum+" so It is an Perfect Number");
		}
		else
		{
			System.out.println("the given number is "+num+" the factors sum of the number is "+sum+" so It is Not a Perfect Number");
		}
	}
}