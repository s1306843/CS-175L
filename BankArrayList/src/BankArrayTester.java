import java.util.ArrayList;
public class BankArrayTester 
{
	public static void main(String[] args) 
	{
		//Creates new bank accounts using the BankAccount class that was made.
		BankAccount Gil = new BankAccount("Gil", 500);
		BankAccount Joe = new BankAccount("Joe", 1000);
		BankAccount Fred = new BankAccount("Fred", 2000);
		BankAccount Sally = new BankAccount("Sally", 2500);
		
		//Initializes largest Account2 
		double largestAccount2 = 0;
		
		//Creates an array list using the BankAccount class.
		ArrayList<BankAccount> AccountList = new ArrayList<>();
	
		//Adds the Bank Accounts above to the array list. 
		AccountList.add(Gil);
		AccountList.add(Joe);
		AccountList.add(Fred);
		
		//Loops over all of the bank accounts in the list.
		BankAccount largestAccount1 = AccountList.get(0);
		for(BankAccount employee: AccountList)
		{
			System.out.println(employee.getAccount());
		}
		AccountList.add(Sally); //Adds Sally as the highest Account Balance. 
		for (int numA = 0; numA < AccountList.size(); numA++)
		{
			if (AccountList.get(numA).getBalance() > largestAccount2)
			{
				largestAccount1 = AccountList.get(numA);
				largestAccount2 = AccountList.get(numA).getBalance();
			}
		}
		System.out.println("____________________________________________");
		//Prints out the current highest account.
		System.out.println("The first highest balance is: " + largestAccount1.getAccount() + "|___________"); 
		largestAccount1 = AccountList.get(0);
		largestAccount2 = 0;
		
		/* Removes Sally as the highest Account Balance. 
		 * The code is then compiled so that Fred is now the highest.
		 * (Was initially second Largest) ->
		 */
		AccountList.remove(Sally);  
		for (int numB = 0; numB < AccountList.size(); numB++)
		{
			//If their balance is less than Account 1, then the current account is updated to be the new highest.
			if (AccountList.get(numB).getBalance() > largestAccount2)
			{
				largestAccount1 = AccountList.get(numB);
				largestAccount2 = AccountList.get(numB).getBalance();
			}
		}
		//Prints out the final highest account balance (with name) 
		System.out.println("The highest balance after modification is: " + largestAccount1.getAccount() + "|");
		
	}

}

