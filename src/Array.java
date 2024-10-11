import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		do {
			System.out.print("Enter size of the array: ");
			size = input.nextInt();
		} while (size <= 0);

		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + (i + 1) + "th element of the array: ");
			array[i] = input.nextInt();
		}

		int min = minNumber(array);
		System.out.println("The smallest element in the array is: " + min);
	}

	public static int minNumber(int[] arr) {
		int min = arr[0];
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
}
