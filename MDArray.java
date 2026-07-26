import java.util.*;
class MDArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of rows:");
		int m=sc.nextInt();
		
		int a[][]=new int[m][];
		
		for (int i=0;i<m;i++){
			System.out.println("Enter no. of columns for row "+i);
			int n=sc.nextInt();
			a[i]=new int[n];
			System.out.println("Enter elements in row "+i);
			for(int j=0;j<n;j++){
				System.out.println("Enter element "+j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The final array looks like:");
		for (int i=0;i<m;i++){
			
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}