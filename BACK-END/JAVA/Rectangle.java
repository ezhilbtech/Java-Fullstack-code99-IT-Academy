import java.util.*;
class Rectangle{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length value:");
		int length=sc.nextInt();
		System.out.println("Enter the Breath value:");
		int breath=sc.nextInt();
		int area_of_reactangle=length*breath;
		System.out.println("Area of Reactangle:"+area_of_reactangle);
	}
}