import java.util.*;
class Matrix{
	int m,n;
	int a[][];
	Scanner sc=new Scanner(System.in);
	public void readInput(){
		System.out.println("Enter no.of rows:");
		this.m=sc.nextInt();
		System.out.println("Enter no.of columns:");
		this.n=sc.nextInt();
		this.a=new int[this.m][this.n];
		for(int i=0;i<this.m;i++){
			System.out.println("Enter elements one-by-one in row "+i);
			for(int j=0;j<this.n;j++){
				a[i][j]=sc.nextInt();
			}
		}
	}
	public void displayMatrix(){
		for (int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}


class MatrixAddition{
	public static void main(String [] args){
		Matrix M1=new Matrix();
		M1.readInput();
		System.out.println("\nM1 looks like:");
		M1.displayMatrix();
		
		Matrix M2=new Matrix();
		M2.readInput();
		System.out.println("\nM2 looks like:");
		M2.displayMatrix();
		
		if((M1.m==M2.m)&&(M1.n==M2.n)){
			System.out.println("Addition Matrix of M1 and M2 looks like:");
			for(int i=0;i<M1.a.length;i++){
				for(int j=0;j<M1.a[i].length;j++){
					System.out.print((M1.a[i][j])+(M2.a[i][j])+" ");
				}
				System.out.println();
			}
		}	
		else
			System.out.println("Inconsistent Matrices ; Addition not possible.");
		
	}
}