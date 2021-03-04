/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double Balance;
   private double InterestRate;
   private double Interest;
   private double Deposit;
   private double Withdraw;
   

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double startBal, double interestPct)
   {
	   
      Balance = startBal;
      InterestRate = interestPct;
      
      System.out.println("You created a new account with $" + Balance + " balance and an interest rate of " + InterestRate + ".");
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
	   
      Balance = Balance + amount;
      Deposit = amount;
      
      System.out.println("You Deposited: $" + Deposit);
      
      
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
	   
      Withdraw = amount;
      
      if(Withdraw > Balance) 
      {
    	  
    	  System.out.println("Insufficient Funds to support withdrawal. Please try again.");
    	  
      }
      
      else 
      {
    	  
    	  Balance = Balance - amount;
    	  System.out.println("You Withdrew: $" + Withdraw);
    	  
    	  
      }
      
   }
   
   public void calcInterest() 
   {
	   
	   Interest = Balance * InterestRate;
	   Balance = Interest + Balance;
	   
   }
   
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */

   public double getBalance()
   {
      return Balance;
   }

}