public class x_Table 
{
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("           Multiplication Table");
		System.out.println();
		System.out.println("   -------------------------------------    ");
		
		for (int a = 1; a <= 10; a++)
		{
			for (int b = 1; b <= 10; b++)
			{
				System.out.printf("%4d", a*b);
			}
			
			System.out.println();
		}

	}

}
