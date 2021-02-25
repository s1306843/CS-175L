import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input your starting balance: ");
		double startBal = in.nextDouble();
		
		//Adds Bank Account method to BankAccountTester class 
		BankAccount myBankAccount = new BankAccount(startBal);
		
		//Asks the user how much they want to withdrawal
		System.out.println("Please input how much money you would like to withdrawal: ");
		double withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		
		//Asks the user how much money they want to deposit 
		System.out.println("Please input the amount of money you would like to deposit: ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		
		//Displays the current balance to the user 
		System.out.println("Your Current Balance is: $" + myBankAccount.getBalance());
		
	}

}
