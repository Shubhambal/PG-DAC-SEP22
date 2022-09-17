import java.util.Scanner;

class P10
{
	public static void main(String args[])
	{

		for(char i='E';i>='A';i--) //row
		{
			
			for(char k='A';k<i;k++) //spaces..c
		   {
		    System.out.print(" ");
		   }
		
			
		   for(char j=i;j<='E';j++) //symbols...c
		   {
		    System.out.print(j+" ");
			 
		   }
		 
		    System.out.println();
		}	
	}
}	