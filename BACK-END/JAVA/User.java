import java.util.*;
class User{		
		public static void main(String args[])
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the number:");
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=1;i<=n;i++)
			{	
				System.out.println();
				System.out.println(i+"Tables");
				System.out.println();
				for(int j=1;j<=n;j++)
				{
					int a=i*j;
					System.out.println(j+"*"+i+"="+a);
				}
			}
			
		}
}

