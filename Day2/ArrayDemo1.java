package P1;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] ar1 = new int[5];
		int[] ar2 = new int[5];
		int[] ar3 = new int[5];
		int[] ar4 = new int[2];
		arrayInsertion(ar1);
		System.out.println("Select from the menu");
		System.out.println("1) Delete the repeated values ");
		System.out.println("2) Search");
		System.out.println("3) Print the multiples");
		System.out.println("4) Print the min max");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			secondArrayInsertion(ar1, ar2);
			System.out.println("First array");
			arryPrint(ar1);
			System.out.println("\nSecond array");
			arryPrint(ar2);
			break;
		case 2:
			System.out.println("Enter the key to be searched:");
			Scanner sc2 = new Scanner(System.in);
			int key = sc2.nextInt();
			int index = searchElement(ar1, key);
			if (index == -1) {
				System.out.println("Key is not found");
			} else {
				System.out.println("The key is found at " + index + 1 + " position");
			}
			break;

		case 3:
			System.out.println("Enter the number:");
			Scanner sc3 = new Scanner(System.in);
			int num = sc3.nextInt();
			ar3 = getMultiplesOf(ar1, num);
			System.out.println("Multiples of " + num + " are:");
			arryPrint(ar3);
			break;
		case 4:
			ar4 = getMinMax(ar1);
			System.out.println("Min: " + ar4[0] + " and Max: " + ar4[1]);
			break;

		default:
			System.out.println("Invalid choice");
		}
	}

	public static void arryPrint(int[] ar1) {
		for (int i = 0; i < 5; i++) {
			System.out.print(ar1[i] + "\t");

		}

	}

	public static void arrayInsertion(int[] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 values ");

		for (int i = 0; i < 5; i++) {
			ar[i] = Integer.parseInt(sc.nextLine());
		}
	}

	public static void secondArrayInsertion(int[] ar1, int[] ar2) {
		int flag = 0, pos = 0;
		for (int i = 0; i < 5; i++) {
			for (int y = 0; y < 5; y++) {
				if (ar1[i] == ar2[y]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				ar2[pos++] = ar1[i];

			} else {
				flag = 0;
			}

		}
	}

// This method accept an array and the element to be searched and return the index value if element found
// otherwise return -1;
// as well as return -2 if array is empty
	public static int searchElement(int[] arr, int key) {
		int index = 0, flag = 0;
		for (int number : arr) {
			if (number == key) {
				flag = 1;
				break;
			}
			index++;
		}
		if (flag == 0) {
			index = -1;
		}
		return index;
	}

	/*
	 * this method returns an array of size 2, containing min and max number of the
	 * given array, and below method cannot invoke any other method Note:- display
	 * the returned array using printArray() method
	 */
	public static int[] getMinMax(int arr[]) {
		int[] num = new int[2];
		num[1] = arr[0];
		num[0] = arr[0];
		for (int n : arr) {
			if (num[0] > n) {
				num[0] = n;
			}
			if (num[1] < n) {
				num[1] = n;
			}

		}
		return num;
	}

	/*
	 * this method returns an array which contains the multiples of x, and below
	 * method cannot invoke any other method Note:- display the returned array using
	 * printArray() method
	 */
	public static int[] getMultiplesOf(int arr[], int x) {
		int[] mul = new int[5];
		int i = 0;
		for (int num : arr) {
			if (num % x == 0) {
				mul[i] = num;
				i++;
			}
		}
		return mul;
	}


}