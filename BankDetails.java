/*3. BankDetails

Setup:
Create a base class Account with:

* Fields: accountHolderName, balance
* Method: displayBalance() → prints name and balance

Create subclasses:

* SavingsAccount → adds field interest
* CurrentAccount → adds field limit

Task:
Create objects of both subclasses, assign them to Account references, and call displayBalance().*/

abstract class BankAccount{
	String accountHolderName;
	double balance;
	BankAccount(String accountHolderName,double balance){
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	abstract void displayBalance();
}

class SavingsAccount extends BankAccount{
	double interest;
	SavingsAccount(String accountHolderName,double balance,double interest){
		super(accountHolderName,balance);
		this.interest=interest;
	}
	public void displayBalance(){
		System.out.println("Account Holder Name: "+accountHolderName+"\nBalance: "+balance+" Rupees\n"+interest+"% is the rate of interest.");
	}
}

class CurrentAccount extends BankAccount{
	double limit;
	CurrentAccount(String accountHolderName,double balance,double limit){
		super(accountHolderName,balance);
		this.limit=limit;
	}
	public void displayBalance(){
		System.out.println("Account Holder Name: "+accountHolderName+"\nBalance: "+balance+" Rupees\n"+limit+" is the limit set for depositing.");	
	}
}

class BankDetails{
	public static void main(String[] args){
		BankAccount ref;
		SavingsAccount s1= new SavingsAccount("ABC",5000,8);
		CurrentAccount c1= new CurrentAccount("DEF",100000,500000);
		ref=c1;
		ref.displayBalance();
		ref=s1;
		ref.displayBalance();
	}
}