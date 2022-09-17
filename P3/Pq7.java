class Pq7
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++) //row
		{
			for(int j=5;j>i;j--)    //column //spaces
			{
				System.out.print("  ");
			}				
			
			for(int j=1;j<=i;j++)    //column //symbol   pattern 7
			{
				System.out.print("* ");
			}				
			
			
			
			for(int j=1;j<i;j++)     //column....2nd
			{
				System.out.print("* ");
			}
			System.out.println();
			}				
			for(int i=4;i>=1;i--) //row
		{
				for(int j=5;j>i;j--)    //column //spaces
			{
				System.out.print("  ");
			}				
			
			for(int j=1;j<=i;j++)    //column //symbol
			{
				System.out.print("* ");
			}				
			
			
			
			for(int j=1;j<i;j++)     //column....2nd
			{
			System.out.print("* ");}
			System.out.println();
		}
		
	}
}	