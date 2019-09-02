package org.hs.algo.search;

public class BinarySearch {

	public static long search(long[] array, int len, long val) {
		if (len == 0)
			return -999999l;
		int leftIndex = 0, rightIndex = len - 1, midIndex = 0;

		while (leftIndex <= rightIndex) {
			midIndex = (int) Math.floor((rightIndex + leftIndex) / 2);
			if (val > array[midIndex]) {
				leftIndex = midIndex + 1;
			} else if (val < array[midIndex]) {
				rightIndex = midIndex - 1;
			} else {
				return midIndex;
			}
		}
		return -999999l;
	}

	public static long searchRecursive(long[] array, int leftIndex, int rightIndex, long val) {
		if (leftIndex > rightIndex)
			return -999999l;

		int midIndex = (int) Math.floor((leftIndex + rightIndex)) / 2;
		if (val == array[midIndex]) {
			return midIndex;
		} else if (val > array[midIndex]) {
			return searchRecursive(array, midIndex + 1, rightIndex, val);
		} else {
			return searchRecursive(array, leftIndex, midIndex - 1, val);
		}
	}
}
