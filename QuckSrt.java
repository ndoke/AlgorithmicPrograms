import java.util.Scanner;

public class QuckSrt {

	public static void quickSort(int arr[], int start, int end) {
		int i = start, j = start;
		while (j <= end) {
			if (arr[j] <= arr[end]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			} else {
				j++;
			}
		}
		int newStart = i - 2, newEnd = i;

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		System.out.println(i - 1);

		if (newStart - start >= 1)
			quickSort(arr, start, newStart);

		if (end - newEnd >= 1)
			quickSort(arr, newEnd, end);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numEle = sc.nextInt();
		int arr[] = new int[numEle];
		for (int k = 0; k < numEle; k++) {
			arr[k] = sc.nextInt();
		}
		sc.close();

		int part = arr.length - 1;
		quickSort(arr, 0, part);
	}
}
