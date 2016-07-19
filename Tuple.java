
public class Tuple {

	public static void printPerm(int arr[]) {
		int numStar = arr.length;
		for (int h = numStar; h >= 0; h--) {
			int temp = h;
			for (int i = 0; i < arr.length; i++) {
				if (temp > 0)
					System.out.print("* ");
				else
					System.out.print(arr[i] + " ");
				temp--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		// int arr[] = new int[num];
		// for (int i = 0; i < num; i++) {
		// arr[i] = sc.nextInt();
		// }
		// sc.close();
		int a[] = { 1, 2, 3 };
		printPerm(a);
	}

}
