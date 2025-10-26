import java.util.*;
class Table
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String args[])
	{
		System.out.println("Enter the Table Number:");
		int table=sc.nextInt();
		System.out.println("Enter the start table Number:");
		int start=sc.nextInt();
		System.out.println("Enter the end table Number:");
		int end=sc.nextInt();
		System.out.println();
		System.out.println("********* "+table+"Table ***********");
		System.out.println();
		for(int i=start;i<=end;i++)
		{
			System.out.println(i+"*"+table+"="+i*table);
		}
	}
}