package org.hs.algo.practice;

class Solution {
    public int solution(int[] A) {
    	sort(A, 0, A.length - 1);
    	
    	int small = 1;
        for (int i : A) {
			if(i == small) 
				small++;
		}
        return small;
    }
    
    private static void merge(int[] array, int start, int mid, int end) {
		int size = end - start + 1;
		int[] temp = new int[size];
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
    
    public static void sort(int[] array, int start, int end) {
		if(start < end) {
			int mid = (int) Math.floor((start+end)/2);
			sort(array, start, mid);
			sort(array, mid+1, end);
			merge(array, start, mid, end);
		}
	}
}
