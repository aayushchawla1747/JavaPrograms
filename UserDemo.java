class user{
	 String UserName;
	 String email;
	 boolean isPremiumUser;
	
	user(String UserName,String email){
	this.UserName=UserName;
	this.email=email;
	this.isPremiumUser=false;
	}
	user(String UserName,String email,boolean isPremiumUser){
		this.UserName=UserName;
		this.email=email;
		this.isPremiumUser=isPremiumUser;
	}
}
class UserDemo{
	public static void main(String[] args){
		user u1=new user("abc","abc123@gmail.com");
		System.out.println(u1.isPremiumUser);
		user u2=new user("pqr","pqr456@gmail.com",true);
		System.out.println(u2.isPremiumUser);
		
	}
}