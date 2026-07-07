class Customer{
	private String productName;
	private int price;
	private int discountPercent;
	
	public void setproductName(String productName){
		this.productName=productName;
	}
	public void setprice(int price){
		this.price=price;
	}
	public void setdiscountPercent(int discountPercent){
		this.discountPercent=discountPercent;
	}
	public String getproductName(){
		return this.productName;
	}
	public int getprice(){
		return this.price;
	}
	public int getdiscountPercent(){
		if (discountPercent<=100)
			return this.discountPercent;
		else{
			System.out.println("Invalid Discount Percentage");
			return -1;
		}
	}
	public int getFinalPrice(){
		if (discountPercent<=100)
			return (this.price-(this.price*this.discountPercent/100));
		else{
			System.out.println("Invalid Discount Percentage");
			return -1;
		}
	}
	
	Customer(String productName,int price){
		this.productName=productName;
		this.price=price;
		this.discountPercent=0;
	}
	Customer(String productName,int price,int discountPercent){
		this.productName=productName;
		this.price=price;
		this.discountPercent=discountPercent;
	}
}

class ShopDemo{
	public static void main(String[] args){
		Customer C1=new Customer("Tshirt",500);
		System.out.println(C1.getFinalPrice());
		Customer C2=new Customer("Jeans",800,10);
		System.out.println(C2.getFinalPrice());
		Customer C3=new Customer("Jeans",800,110);
		System.out.println(C3.getFinalPrice());
	}
}
