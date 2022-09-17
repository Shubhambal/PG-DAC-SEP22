class P11
{
	public static void main(String args[])
	{
	char x='A';
		for(int i=1;i<=5;i++) //row
		{
			for(int j=4;j>=i;j--) //spaces..c
		   {
		    System.out.print(" ");
		   }
		
			
		   for(int j=1;j<=i;j++) //symbols...c
		   {
		    System.out.print("x ");
		   }
		   x++;
		    System.out.println();
		}	
	}
}	
