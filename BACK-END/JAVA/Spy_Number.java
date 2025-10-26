import java.util.*;
class Spy_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		while(num!=0)
		{
			int last=num%10;
			sum+=last;
			product*=last;
			num=num/10;
		}
		if(sum==product)
		{
			System.out.println("the sum of the Number is "+sum+" the product of the number is "+product+" so it is an spy number");
		}
		else
		{
			System.out.println("the sum of the Number is "+sum+" the product of the number is "+product+" so it is an not a spy number");
		}
	}
}