// WAJP to create a class Account with member variables(accountid, accountname, amount)
// Create 2 instances of class Account
// Ensure good encapsulation technique

class Account{
	private String accountname;
	private int accountid;
	private int amount;
	
	public String getAccountName(){
		return this.accountname;
	}
	public int getAccountId(){
		return this.accountid;
	}
	public int getAmount(){
			return this.amount;
	}
	public void setAccountName(String accountname){
		this.accountname=accountname;
	}
	public void setAccountId(int accountid){
		this.accountid=accountid;
	}
	public void setAmount(int amount){
		if (amount>=0){
			this.amount=amount;
		}
	}
}

class AccountDemo{
	public static void main(String[] args){
		Account a1= new Account();
		a1.setAccountName("ABCDEFGH");
		a1.setAccountId(1234);
		a1.setAmount(250000);
		System.out.println("Account name is : "+a1.getAccountName());
		System.out.println("Account id is : "+a1.getAccountId());
		System.out.println("Amount : "+a1.getAmount());
	}
}