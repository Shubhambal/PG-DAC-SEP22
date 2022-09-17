import java.util.Scanner;

class P5a
{
	public static void main(String args[])
	{
		/*Scanner o= new Scanner(System.in);
		System.out.println("Enter a No.");
		int a=o.nextInt();*/
		char x='A';
		
		for(int i=1;i<=5;i++) //row
		{
			for(int j=1;j<=i;j++) //column
			{
				System.out.print(x+" " );
				
			}	
           x++;			
			System.out.println();
		}
	}
}	

