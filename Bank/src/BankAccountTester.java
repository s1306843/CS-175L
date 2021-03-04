import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//User enters how much they want to first put into their account: 
		System.out.println("Please enter amount to start the account: ");
		double startBal = in.nextDouble();
		
		//User enters the interest rate here:
		System.out.println("Please enter the interest rate for this account: ");
		double interestPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		
		//User enters how much they want to deposit into their account:
		System.out.println("Please enter amount to deposit in the account: ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		
		//User enters how much they want to Withdraw from their account:
		double accountBal = myBankAccount.getBalance();
		
		System.out.println("Please enter amount to withdraw from the account: ");
		double withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		
		double withdrawBalance = myBankAccount.getBalance();
		
		if(withdrawBalance == accountBal) 
		{
			
			System.out.println("Please enter amount to withdraw from the account: ");
			withDrawAmount = in.nextDouble();
			myBankAccount.withdraw(withDrawAmount);
			
		}
		
		//User inputs 'Yes' or 'No' on whether they want to generate interest or not:
		System.out.println("If you want me to generate interest, enter 'Yes': ");
		String answer = in.next();
		
		if(answer.compareTo("Yes") == 0) 
		{
			
			myBankAccount.calcInterest();
			System.out.println("Your account balance is: $" + myBankAccount.getBalance());
			
		}
		
		else 
		{
			//If no interest is generated, then this is printed for the user
			System.out.println("Your account balance is: $" + myBankAccount.getBalance());
			
		}
		
	}

}
