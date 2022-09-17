import java.util.Scanner;

class P9
{
	public static void main(String args[])
	{
	
		for(int i=1;i<=5;i++) //row
		{
		char x='A';
			for(int j=4;j>=i;j--) //spaces..c
		   {
		    System.out.print(" ");
		   }
		
			
		   for(int j=1;j<=i;j++) //symbols...c
		   {
		    System.out.print(x+" ");
			x++;
		   }
		   
		    System.out.println();
		}	
	}
}	