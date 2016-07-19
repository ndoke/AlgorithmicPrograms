import java.util.ArrayList;
import java.util.Scanner;

public class ZeroMatrix {

	public void makeZero(int row, int column) {
		int matrix[][] = new int[row][column];
		ArrayList<Integer> rowZero = new ArrayList<Integer>();
		ArrayList<Integer> columnZero = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] == 0) {
					rowZero.add(i);
					columnZero.add(j);
				}
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
				if (rowZero.contains(i))
					matrix[i][j] = 0;
				if (columnZero.contains(j))
					matrix[i][j] = 0;
			}
		}
		System.out.println("Edited matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroMatrix zm = new ZeroMatrix();
		zm.makeZero(3, 3);
	}

}
