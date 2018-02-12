package RajeshAssignment;

public class ArraySmallestNdLargestA2 {

	public static void main(String[] args) {
		int[] arr = new int[] { 45, 56, 77, 24, 12, 98 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Largest number : " + max);
		System.out.println("Smallest number : " + min);
	}

}
