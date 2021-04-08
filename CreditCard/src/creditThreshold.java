import java.util.Scanner; 
public class creditThreshold 
{

	public static void main(String[] args) 
	{
		//Asks the user to input their card number ->
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your Credit Card Number: ");
	    String userIn = in.nextLine();
	    int num = 0;
	    
	    /*While loop is executed, telling the system to replace all 
	     instances of '-' and ' ' with no spaces
	     */
	    while(num<userIn.length())
	        {
	            char dashOrspace = userIn.charAt(num);
	            if(dashOrspace == '-' || dashOrspace == ' ')
	            {
	                String a = userIn.substring(0,num);
	                String b = userIn.substring(num+1);
	                userIn = a + b;
	            }
	            else
	            {
	                num++;
	            }
	        }
	    System.out.println();
       
	    //Finally, prints out the user inputed number with no spacing. 
	    System.out.println("Simplified Number: " + userIn);
	  }
	
}

