class dd
{
	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<i*2-1;j++)
			{
				System.out.print("*");
			} 
			System.out.print("\n");
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<2*(5-i)-1;j++)
			{
				System.out.print("*");
			} 
			System.out.print("\n");
		}
	}
} 