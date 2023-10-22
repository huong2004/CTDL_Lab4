package lab4;

import lab3.Order;

public class Task1 {
	// sort by descending order
	public static void selectionSort(int[] array) {
		// TODO
		for (int i = 0; i < array.length; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[maxIndex] < array[j])
					maxIndex = j;

			}
			swap(array, i, maxIndex);

		}
	}

	// sort by descending order
	public static void bubbleSort(int[] array) {
		// TODO
		for (int k = 0; k < array.length; k++) {

			for (int i = 0; i < array.length - 1 - k; i++) {
				if (array[i] < array[i + 1])
					swap(array, i, i + 1);
			}
		}
	}

	// sort by descending order
	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	public static void insertionSort(Order[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			Order key = arr[i];
			int j = i - 1;

			while (j >= 0 && key.compareTo(arr[j]) < 0) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}
	}

	static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;

	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	
	public static void main(String[] args) {
		int array[] = { 5 ,3,4,6,2,7,8,3,8,3,7,};
		insertionSort(array);
		printArray(array);
		selectionSort(array);
		printArray(array);
		bubbleSort(array);
		printArray(array);
		

	}
}
