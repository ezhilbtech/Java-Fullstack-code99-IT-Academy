import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int same=num;
		int rem;
		int palin=0;
		while(num!=0)
		{
			rem=num%10;
			palin=(palin*10)+rem;
			num=num/10;
		}
		System.out.println("Reversed Number:");
		System.out.println(palin);
		if(same==palin)
		{
			System.out.println("It is an Palindrome Number: \n"+palin);
		}
		else{
			System.out.println("It is not a Palindrome Number");
		}
	}
}