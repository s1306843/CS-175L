import java.util.Random;
import java.util.Arrays;
public class randArrayAndSearch 
{

	public static void main(String[] args) 
	{
		//Creates an object that allows for RNG (Random Number Generation)
		Random randomGen = new Random();
		
		int [] numbersList = new int[50];
		
		int briefCount = 1;
		int topCount = 0;
		int repeatingNumber = numbersList[0];
		//Prints out a normal array of integers 
		System.out.println("<<< Standard Array >>>");
		System.out.println();
		for (int n = 0; n < numbersList.length; n++)
		{
			
			numbersList[n] = randomGen.nextInt(25) + 1;
			System.out.print(numbersList[n] + " ");
			
		}
		System.out.println();
		System.out.println();
		Arrays.sort(numbersList);
		
		//A sorted array just makes it easier to find the mode / smallest and largest numbers 
		System.out.println("<<< Sorted Array >>>");
		System.out.println();
		for (int n = 0; n < numbersList.length; n++)
		{
			
			System.out.print(numbersList[n] + " ");
			
		}
		/*Prints out the smallest / greatest numbers in the array. 
		  Also the product of the smallest and greatest is printed clearly. 
		 */
		System.out.println();
		System.out.println();
		System.out.println("The smallest number in the array is: " + numbersList[0]);
		System.out.println("The greatest number in the array is: " + numbersList[49]);
		System.out.println("The product of the greatest and smallest number is: " + numbersList[0]*numbersList[49]);
		System.out.println();
		
		for (int n = 1; n < numbersList.length; n++)
		{
			if (numbersList[n] == numbersList[n - 1])
			{
				briefCount++;
			}
			else
			{
				if (briefCount > topCount)
				{
					topCount = briefCount;
					repeatingNumber = numbersList[n-1];
				}
				briefCount = 1;
			}

		}
		//Prints out the most frequent number in the array + the amount of times it appears 
		System.out.println("Most frequent number: " + repeatingNumber);
		System.out.println("Appears " + topCount + " times");
	}

}
