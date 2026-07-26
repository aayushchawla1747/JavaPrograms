import java.util.*;
class TwoDArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of rows:");
		int m=sc.nextInt();
		System.out.println("Enter no. of columns:");
		int n=sc.nextInt();
		
		int a[][]=new int[m][n];
		
		for (int i=0;i<m;i++){
			System.out.println("Enter elements in row "+i);
			for(int j=0;j<n;j++){
				System.out.println("Enter element "+j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The final array looks like:");
		for (int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}