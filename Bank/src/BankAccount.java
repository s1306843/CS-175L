public class BankAccount
{
   private double Balance;
   private double InterestRate;
   private double Interest;
   private double Deposit;
   private double Withdraw;
  
   public BankAccount(double startBalance, double interestPct)
   {
	   
      Balance = startBalance;
      InterestRate = interestPct;
      
      System.out.println("You created a new account with $" + Balance + " balance and an interest rate of " + InterestRate + ".");
   }

   public void deposit(double amount)
   {
	   
      Balance = Balance + amount;
      Deposit = amount;
      
      System.out.println("You Deposited: $" + Deposit);
      
      
   }

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
   public void userThreshold(double startBal, double interestPct)
   {
	   
	   Balance = startBal;
	   InterestRate = interestPct;
	   
   } 
   
   public double getBalance()
   {
      return Balance;
   }

}