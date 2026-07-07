class ATMCard{
	private int cardNumber;
	private int pin;
	private int balance;
	int amount;
	
	public void setcardNumber(int cardNumber){
		this.cardNumber=cardNumber;
	}
	public void setpin(int pin){
		this.pin=pin;
	}
	public void setbalance(int balance){
		this.balance=balance;
	}
	
	public int WithdrawAmount(int amount){
		if (amount<=balance){
			balance-=amount;
			System.out.println("You have withdrawn "+amount+" rupees");
			System.out.println("Balance:"+balance+"rupees");
			return amount;
		}
		else{
			System.out.println("Insufficient Balance!");
			return 0;
		}
	}
	public void DepositAmount(int amount){
		if (amount<0){
			System.out.println("Invalid amount");
		}
		else{
			balance+=amount;
			System.out.println("You have successfully deposited "+ amount+" rupees");
			System.out.println("Balance:"+amount+" rupees");
		}
	}
	public int CheckBalance(){
		System.out.println("Balance: "+balance+" rupees");
		return this.balance;
	}
	ATMCard(int cardNumber,int pin){
		this.cardNumber=cardNumber;
		this.pin=pin;
		this.balance=0;
	}
}

class ATMCardDemo{
	public static void main(String[] args){
		ATMCard A1=new ATMCard(123456,7887);
		A1.DepositAmount(5000);
		A1.WithdrawAmount(3000);
		A1.CheckBalance();
		A1.WithdrawAmount(2500);
		ATMCard A2=new ATMCard(987654,3663);
		A2.DepositAmount(9000);
		A2.WithdrawAmount(5000);
		A2.CheckBalance();
		
	}
}