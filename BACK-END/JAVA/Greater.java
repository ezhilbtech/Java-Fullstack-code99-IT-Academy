import java.util.*;
class Greater
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		System.out.println("Enter the third number:");
		int c=sc.nextInt();
		System.out.println("Enter the fourth number:");
		int d=sc.nextInt();
		
		int e=(a>b)?((a>c)?((a>d)?a:d):c):((b>c)?((b>d)?b:d):(c>d)?c:d);
		System.out.println("The Greatest number is:"+e);
	}
}