import java.util.*;
class Strong_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int temp=num;
		int last,total=0,fact=1;
		while(temp!=0)
		{
			last=temp%10;
			for(int i=1;i<=last;i++)
			{
				fact*=i;
			}
			total+=fact;
			fact=1;
			temp=temp/10;
		}
		if(total==num)
		{
			System.out.println(total+" It is an Strong Number");
		}
		else
		{
			System.out.println(total+" It is Not a Strong Number");
		}
	}
}