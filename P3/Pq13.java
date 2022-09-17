	
	class Pq13
{
	public static void main(String args[])
	{	
	

	for(int i=1;i<=5;i++) //row
		{
			for(int j=1;j<i;j++) //column //Space  
			{
				System.out.print("  ");
			}				
			
			for(int j=5;j>=i;j--) //column //Symbol  pattern 13
			{
				System.out.print("* ");
			}				
			
			
			System.out.println();
		}
				
		for(int i=1;i<=4;i++) //row
		{
			for(int j=4;j>i;j--)      //spaces
			{
				System.out.print("  ");
			}				
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}				
			System.out.println();
			
			}
	
    }
} 