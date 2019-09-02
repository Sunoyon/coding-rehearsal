package org.hs.algo.sort;

public class MergeSort {

	private static void merge(long[] array, int start, int mid, int end) {
		int size = end - start + 1;
		long[] temp = new long[size];
		int i = start, j = mid + 1, k = 0;

		while (i <= mid && j <= end) {
			if (array[i] <= array[j]) 
				temp[k++] = array[i++];
			else 
				temp[k++] = array[j++];
		}
		
		while(i <= mid) {
			temp[k++] = array[i++];
		}
		
		while(j <= end) {
			temp[k++] = array[j++];
		}
		
		for(i=start, k=0; k < size; i++, k++) {
			array[i] = temp[k];
		}
	}
	
	
	public static void sort(long[] array, int start, int end) {
		if(start < end) {
			int mid = (int) Math.floor((start+end)/2);
			sort(array, start, mid);
			sort(array, mid+1, end);
			merge(array, start, mid, end);
		}
	}

}
