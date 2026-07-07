//WAJP to create a class product(id,name,quantity)create multiple instances of this class ensure good encapsulation technique\
//create 3 constructors
//1.default
//2.constructor that initializes id and name
//3.initializes all

class Product{
	private int id;
	private String name;
	private int quantity;
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	
	public int getId(){
		return this.id;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public String getName(){
		return this.name;
	}
	Product(){
		this.id=0;
		this.name="";
		this.quantity=0;
	}
	Product(int id,String name){
		this.name=name;
		this.id=id;
	}
	
	Product(int id,String name,int quantity){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
	}
}

class ProductDemo{
	public static void main(String[] args){
		Product p1= new Product();
		p1.setId(123);
		p1.setName("Biscoff");
		p1.setQuantity(5);
		System.out.println("The id of product is :"+p1.getId());
		System.out.println("Product name is :"+p1.getName());
		System.out.println("Product Quantity is :"+p1.getQuantity());
		
		Product p2=new Product(1233,"Marie");
		p2.setQuantity(9);
		System.out.println("The id of product is :"+p2.getId());
		System.out.println("Product name is :"+p2.getName());
		System.out.println("Product Quantity is :"+p2.getQuantity());
		
		Product p3=new Product(1234,"Creambell",15);
		System.out.println("The id of product is :"+p3.getId());
		System.out.println("Product name is :"+p3.getName());
		System.out.println("Product Quantity is :"+p3.getQuantity());
	}
}