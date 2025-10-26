
import java.util.*;
class Phloem_Number
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		int value=num;
		int last;
		int extrem=0;
		int mid=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		if(count>=3)
		{
			while(temp!=0)
			{
				last=temp%10;
				if(value==temp || temp<10)
				{
					extrem+=last;
				}
				else
				{
					mid+=last;
				}
				temp=temp/10;
			}
			if(extrem==mid)
			{
				System.out.println("last and first digit added value is: "+extrem+" The middle digits added value is: "+mid);
				System.out.println("It is an Xylem Number");
			}
			else
			{
				System.out.println("last and first digit added value is: "+extrem+" The middle digits added value is: "+mid);
				System.out.println("It is an Phloem Number");
			}
		}
		else
		{
			System.out.println("Enter the 3 digit or above the value");
		}
	}
}