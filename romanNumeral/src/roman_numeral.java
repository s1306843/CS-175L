import java.util.Scanner;
public class roman_numeral {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a year: ");
		int userYear = in.nextInt();
		//I use single letters for the time periods to make writing the code a little easier
		
		/* m = millennium 
		   c = century
		   d = decade
		   y = year 
		*/
		
		int m = userYear/1000 % 10;
		int c = userYear/100 % 10;
		int d = userYear/10 % 10;
		int y = userYear % 10;
		
		/*RN stands for 
		  Roman Numeral
		 */
		String RN = "";
		
		while (m >= 1)
				{
					m--;
					RN = RN + "M";
				}
				
				while (c >= 1)
				{
					if (c == 9)
					{
						c = c - 9;
						RN = RN + "CM";
					}
					else if (c >= 5)
					{
						c = c - 5;
						RN = RN + "D";
					}
					else if (c >= 5)
					{
						c = c - 4;
						RN = RN + "CD";
					}
					else
					{
						c--;
						RN = RN + "C";
					}
				}
				while (d >= 1)
				{
					if (d == 9)
					{
						d = d - 9;
						RN = RN + "XC";
					}
					else if (d >= 5)
					{
						d = d - 5;
						RN = RN + "L";
					}
					else if (c >= 5)
					{
						d = d - 4;
						RN = RN + "XL";
					}
					else
					{
						d--;
						RN = RN + "X";
					}
				}
				while (y >= 1)
				{
					if (y == 9)
					{
						y = y - 9;
						RN = RN + "IX";
					}
					else if (y >= 5)
					{
						y = y - 5;
						RN = RN + "V";
					}
					else if (y >= 4)
					{
						y = y - 4;
						RN = RN + "IV";
					}
					else
					{
						y--;
						RN = RN + "I";
					}
				
				}
			
		
		
		System.out.println("The year " + userYear + " in roman numerals is " + RN);
	}

}
