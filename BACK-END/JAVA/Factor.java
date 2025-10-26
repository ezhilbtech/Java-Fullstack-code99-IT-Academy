import java.util.*;
class Factor
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int i=1,j=0;
		System.out.println("The divisible Numbers are:");
		while(i<=num)
		{
			if(num%i==0)
			{
				System.out.println(i);
				j++;
			}
			i++;
		}
		System.out.println("How many Factor are for "+num +" In between 1 to "+num);
		System.out.println(j);
	}
}