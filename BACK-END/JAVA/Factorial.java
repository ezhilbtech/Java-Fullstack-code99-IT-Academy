import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int fact=1;
		/* for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		*/
		
		int i=1;
		while(i<=num)   
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}