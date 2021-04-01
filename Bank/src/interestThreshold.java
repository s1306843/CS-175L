import java.util.Scanner;
public class interestThreshold 
{
	public static void main(String[] args) 
	{
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Please enter amount to start the account: ");
		double startBalance = userIn.nextDouble();
		System.out.println("Please enter the interest rate for this account: ");
		double userInterestPct = userIn.nextDouble();
		BankAccount myBankAccount = new BankAccount(startBalance, userInterestPct);
		System.out.println("Please enter a threshold for your account balance to reach: ");
		
		while (userIn.hasNextDouble())
		{
			double userThreshold = userIn.nextDouble();
			int months = 0;
			
			while (myBankAccount.getBalance() < userThreshold)
			{
				myBankAccount.calcInterest();
				months++;
			}
			System.out.println("It will take " + months + " months to reach $" + userThreshold);
			myBankAccount.userThreshold(startBalance, userInterestPct);
		}

	}

}