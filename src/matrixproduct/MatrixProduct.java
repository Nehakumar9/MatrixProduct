package matrixproduct;

import java.util.Scanner;

public class MatrixProduct {

	public static void matrixProduct(int matrix[][],int row,int col,int B) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]*=B;
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int matrix[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		int B = scanner.nextInt();
		matrixProduct(matrix,row,col,B);
	}

}
