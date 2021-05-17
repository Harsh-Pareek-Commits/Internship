package P1;

public class DemoClass {
	public static void main(String[] args) {
		int arr[][] = new int[][] { { 10, 2, 4 }, { 15, 22, 54 } };
		for (int[] r : arr) {
			for (int num : r) {
				System.out.println(num);
			}
		}
	}

}
