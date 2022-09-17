class Pq8
{
	public static void main(String args[])
	{	
	
	


		for(int i=1;i<=5;i++) //row
		{
			for(int j=1;j<=i;j++) //column  pattern 8
			{
				System.out.print("* ");
			}				
			System.out.println();
		}   
	
          for(int i=1;i<=5;i++)   
		{
			for(int j=4;j>=i;j--)     
			{
				System.out.print("* ");
			}				
			System.out.println();
			
		}
	}
} 