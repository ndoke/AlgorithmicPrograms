import java.util.LinkedList;

public class MinimumString {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		int arr[] = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };
		for (int i = 0; i < arr.length; i++) {
			linkedList.add(arr[i]);
		}
		System.out.println(linkedList);
	}

}
