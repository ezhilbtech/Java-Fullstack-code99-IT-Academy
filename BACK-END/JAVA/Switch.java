import java.util.*;
class Switch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*** Arithmetic Operation ***");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter the Option Which Operation did you Want:");
		int option=sc.nextInt();
		System.out.println("Enter the First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();
		switch(option)
		{
			case 1:
					System.out.println("Addition");
					System.out.println(num1+num2);
					break;
					
			case 2:
					System.out.println("Subtration");
					System.out.println(num1-num2);
					break;
					
			case 3:
					System.out.println("Multiplication");
					System.out.println(num1*num2);
					break;
					
			case 4:
					System.out.println("Division");
					System.out.println(num1/num2);
					break;
			
			default:
					System.out.println("Enter the Correct Option");
			
		}
	}
}