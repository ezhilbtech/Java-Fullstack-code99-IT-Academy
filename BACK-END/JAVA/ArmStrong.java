import java.util.*;
class ArmStrong
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=sc.nextInt();
		int count=0;
		int last;
		int arm=1;
		int value=num,temp=num;
		int armstrong=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		while(num!=0)
		{
			last=num%10;
			for(int i=1;i<=count;i++)
			{
				arm=arm*last;
			}
			armstrong+=arm;
			arm=1;
			num=num/10;
		}
		if(armstrong==value)
		{
		System.out.println(armstrong+" It is an ArmStrong Number");
		}
		else
		{
			System.out.println(armstrong+" It is not an ArmStrong Number");
		}
	}
}