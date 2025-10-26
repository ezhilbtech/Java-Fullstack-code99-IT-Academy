import java.util.*;
class Happy_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value:");
		int num=sc.nextInt();
		int last;
		int sum=0;
		int temp;
		while(num!=0)
		{
			last=num%10;
			sum=sum+(last*last);
			num/=10;
			temp=sum;
			if(num<=0 && temp>9)
			{
				num=temp;
				sum=0;
			}
		}
		if(sum==1)
		{
			System.out.println(sum+" It is an Happy Number");
		}
		else
		{
			System.out.println(sum+" It is not a Happy Number");
		}
	}
}