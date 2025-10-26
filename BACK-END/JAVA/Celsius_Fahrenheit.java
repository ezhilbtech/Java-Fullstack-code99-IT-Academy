import java.util.*;
class Celsius_Fahrenheit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Convert Celsius to Fahrenheit:\n2.Convert Fahrenheit to Celsius:");
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		if(number==1)
		{
		System.out.println("Enter the celsius value:");
		float celsius=sc.nextFloat();
		float fahrenheit=(celsius*9/5)+32;
		System.out.println("the celsius to fahrenheit value is:"+fahrenheit);
		}
		else if(number==2)
		{
			System.out.println("Enter the Fahrenheit value:");
			float fahrenheit=sc.nextFloat();
			float celsius=(fahrenheit-32)*5/9;
			System.out.println("the fahrenheit to celsius value is:"+celsius);
		}
		else{
			
			System.out.println("Enter a correct value");
		}
	}
}