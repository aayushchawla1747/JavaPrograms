class Transaction{
	String sender;
	String receiver;
	long amount;
	String status;
	
	Transaction(String sender,String receiver,long amount){
		this.sender=sender;
		this.receiver=receiver;
		this.amount=amount;
		this.status="Pending";
	}
	Transaction(String sender,String receiver){
		this.sender=sender;
		this.receiver=receiver;
		this.amount=0;
	}
	
	void makePayment(long amount){
		this.amount=amount;
		this.status="Paid";	
	}
	void printReceipt(){
		System.out.println(this.sender+" sent "+this.amount+" rupees to "+this.receiver);
	}
}

class TransactionDemo{
	public static void main(String[] args){
		Transaction T1=new Transaction("Abc","Pqr",5000);
		T1.makePayment(T1.amount);
		System.out.println(T1.status);
		T1.printReceipt();
		Transaction T2=new Transaction("Xyz","Def");
		T2.makePayment(4000);
		System.out.println(T2.status);
		T2.printReceipt();
	}
}
