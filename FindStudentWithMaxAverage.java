import java.util.Scanner;

public class FindStudentWithMaxAverage {

	private static String findMaxAverage() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxAvg = -1;
		String maxAvgName = "";
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int marks[] = new int[3];
			int avg = 0;
			for (int j = 0; j < 3; j++) {
				marks[j] = sc.nextInt();
				avg += marks[j];
			}
			avg /= 3;
			if (avg > maxAvg) {
				maxAvg = avg;
				maxAvgName = name;
			}
		}

		sc.close();
		return maxAvgName;
	}

	public static void main(String[] args) {
		System.out.println(findMaxAverage());
	}

}
