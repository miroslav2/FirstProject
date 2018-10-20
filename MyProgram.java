package Program;

import java.util.Scanner;

public class MyProgram {
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		int[][] x = new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				x[i][j]= scan.nextInt();
			}
		}
		System.out.println(m+" "+n);
		for(int i=0;i<m;i++){
			for(int j=n-1;j>=0;j--){
				System.out.print(x[j][i]+" ");
			}
			System.out.println();
		}
}
}
