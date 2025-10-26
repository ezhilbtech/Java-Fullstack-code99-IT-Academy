import java.util.*;
class Patterns
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		for(int i=size;i>0;i--)
		{
			for(int j=i;j<size;j++)
			{ 
				System.out.print(" * ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
		}
	
		System.out.println();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i==0 || j==0 || j==size-1 || i==size-1)
				{
				System.out.print(" * ");
				}
				else{
						System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i==size/2 || j==size/2)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();	
		}
	}
}