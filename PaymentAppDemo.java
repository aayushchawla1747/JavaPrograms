//// WAJP to create class payment app create 2 more clases paytm and gpay that extends payment app class implement a method make payment use polymorphism
class PaymentApp{
	int amount;
	public void makePayment(){
		System.out.println("Select some app to proceed with ur transactions!");
	}
}

class Gpay extends PaymentApp{
	public void makePayment(){
		System.out.println("Gpay made a payment:"+amount);
	}
	Gpay(int amount){
		this.amount=amount;
	}
	
}

class Paytm extends PaymentApp{
	public void makePayment(){
		System.out.println("Paytm made a payment:"+amount);
	}
	Paytm(int amount){
		this.amount=amount;
	}
	
}

class PaymentAppDemo{
	public static void main(String[] args){
		PaymentApp ref;
		Gpay g1=new Gpay(5000);
		Paytm p1=new Paytm(6000);
		ref=p1;
		ref.makePayment();
	}
}//thismethod is known is dynamic method dispatch qki runtime p decide krra h ki kiska function call krna h,aur decide krne k baad implement b krra h