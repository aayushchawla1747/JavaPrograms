class Post{
	private String userName;
	private String caption;
	private long likes;
	private long commentCount;
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	public void setCaption(String caption){
		this.caption=caption;
	}
	public String getUserName(){
		return this.userName;
	}
	public String getCaption(){
		return this.caption;
	}
	
	Post(String userName){
		this.userName=userName;
		this.caption="No Caption";
		this.likes=0;
		this.commentCount=0;
	}
	Post(String userName,String caption){
		this.userName=userName;
		this.caption=caption;
		this.likes=0;
		this.commentCount=0;
	}
	
	void LikePost(){
		this.likes+=1;
	}
	void addComment(String Comment){
		this.commentCount+=1;
	}
	public long getLikes(){
		return this.likes;
	}
	public long getCommentCount(){
		return this.commentCount;
	}
	
	void showStats(){
		System.out.println("Likes:"+this.getLikes());
		System.out.println("Comments:"+this.getCommentCount());
	}
}
class PostDemo{
	public static void main(String[] args){
		Post P1=new Post("ABC123","Studying");
		P1.LikePost();
		P1.LikePost();
		P1.LikePost();
		P1.LikePost();
		P1.LikePost();
		P1.addComment("wow");
		P1.addComment("wow");
		P1.addComment("wow");
		System.out.println("For P1:");
		P1.showStats();
		Post P2=new Post("PQR789","Coding");
		P2.addComment("wow");
		P2.addComment("wow");
		P2.addComment("wow");
		P2.addComment("wow");
		P2.addComment("wow");
		P2.LikePost();
		P2.LikePost();
		P2.LikePost();
		P2.LikePost();
		P2.LikePost();
		P2.LikePost();
		System.out.println("For P2:");
		P2.showStats();
	}
}