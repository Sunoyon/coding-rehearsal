package org.hs.algo.sort;

public class HeapSort {

	public static void sort(long[] array, int size) {
		for (int i = size / 2 - 1; i >= 0; i--) {
			heapify(array, size, i);
		}

		for (int i = size - 1; i >= 0; i--) {
			swap(array, 0, i);
			heapify(array, i, 0);
		}
	}

	private static void heapify(long[] array, int size, int root) {
		int leftChild = 2 * root + 1;
		int rightChild = 2 * root + 2;
		int largest = root;

		if (leftChild < size && array[leftChild] > array[largest])
			largest = leftChild;

		if (rightChild <= size && array[rightChild] > array[largest])
			largest = rightChild;

		if (largest != root) {
			swap(array, root, largest);
			heapify(array, size, largest);
		}
	}

	private static void swap(long[] array, int i, int j) {
		long tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public static void main(String[] args) {

	}
}
