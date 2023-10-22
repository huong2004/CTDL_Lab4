package lab4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
	// sort by descending order
	public static void mergeSort(int[] array) {
		// TODO
		merge(array, 0, array.length - 1);
	}

	public static void merge(int[] array, int left, int right) {
		if (array.length <= 1) {
			return;
		}
		if (left < right) {
			int mid = (left + right) / 2;
			merge(array, left, mid);
			merge(array, mid + 1, right);
			merge(array, left, mid, right);
		}

	}

	private static void merge(int[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] arrLeft = new int[n1];
		int[] arrRight = new int[n2];

		for (int i = 0; i < n1; i++) {
			arrLeft[i] = array[left + i];
		}

		for (int j = 0; j < n2; j++) {
			arrRight[j] = array[mid + 1 + j];
		}

		// Merge two array
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (arrLeft[i] <= arrRight[j]) {
				array[k] = arrLeft[i];
				i++;
				k++;
			} else {
				array[k] = arrRight[j];
				j++;
				k++;
			}
		}

		while (i < n1) {
			array[k] = arrLeft[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = arrRight[j];
			j++;
			k++;
		}
	}

	public static void quickSort(int[] array) {
		quickSortHelp(array, 0, array.length - 1);

	}

	public static int partiton(int arr[], int left, int right) {
		int pivot = arr[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (arr[j] <= pivot) {
				i++;
				Task1.swap(arr, i, j);
			}
		}
		++i;
		Task1.swap(arr, i, right);
		return i;

	}

	public static void quickSortHelp(int a[], int l, int r) {
		if (l < r)
			return;
		else {
			int p = partiton(a, l, r);
			quickSortHelp(a, l, p - 1);
			quickSortHelp(a, p + 1, r);
		}
	}

	// sort by ascending order

	// select pivot element based on the median of three strategy
	private static int getPivot_MedianOfThree(int[] array) {
		// TODO
		return array[2];
	}

	// select pivot element based on the first element in the array
	private static int getPivot_First(int[] array) {
		// TODO
		return array[0];
	}

	// select pivot element based on the last element in the array
	private static int getPivot_Last(int[] array) {
		// TODO
		return array[array.length - 1];
	}

	// select pivot element based on choosing a randomly element in the array
	private static int getPivot_Random(int[] array) {
		// TODO

		Random rand = new Random();
		int randomIndex = rand.nextInt(array.length); // Tạo một số ngẫu nhiên từ 0 đến arr.length - 1

		int randomElement = array[randomIndex];
		return randomElement;
	}

	public static void main(String[] args) {
		int array[] = { 3, 6, 2, 7, 8, 1, 9 };
		mergeSort(array);
		System.out.println(Arrays.toString(array));
		quickSort(array);
		System.out.println(Arrays.toString(array));
	}
}
