import java.util.Arrays;
import java.util.Scanner;

public class FindRepeatElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i = 0; i < num; i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		if(arr[0] != arr[1])
			System.out.println(arr[0]);
		if(arr[arr.length - 2] != arr[arr.length - 1])
			System.out.println(arr[arr.length - 1]);
		for(int i = 1; i < arr.length - 1; i++){
			if(arr[i] != arr[i - 1] && arr[i] != arr[i + 1]){
				System.out.println(arr[i]);
			}
		}
	}

}
