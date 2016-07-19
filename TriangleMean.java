import java.util.ArrayList;

public class TriangleMean {

	public int sumArr(ArrayList<Integer> arrList) {
		int sum = 0;
		int i = 2, p = 1;
		sum += arrList.get(0);
		while (p < arrList.size()) {
			int max = Integer.MIN_VALUE;
			for (int j = p; j < p + i; j++) {
				int temp = arrList.get(j);
				if (temp >= max) {
					max = temp;
				}
			}
			sum += max;
			p = p + i;
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleMean tm = new TriangleMean();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		arrList.add(6);
		arrList.add(7);
		arrList.add(8);
		arrList.add(9);
		arrList.add(10);
		System.out.println(arrList);
		System.out.println(tm.sumArr(arrList));
	}

}
