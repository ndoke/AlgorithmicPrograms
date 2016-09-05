import java.util.Scanner;

public class MatrixRotation {

	public void matRot(int row, int column) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix");
		int matrix[][] = new int[row][column];
		int leftRotMatrix[][] = new int[column][row];
		int rightRotMatrix[][] = new int[column][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Original matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				leftRotMatrix[column - 1 - j][i] = matrix[i][j];
				rightRotMatrix[j][row - 1 - i] = matrix[i][j];
			}
		}
		System.out.println("Left Rotated matrix");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(leftRotMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Right Rotated matrix");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(rightRotMatrix[i][j] + "\t");
			}
			System.out.println();
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixRotation mr = new MatrixRotation();
		mr.matRot(3, 3);
	}

}
