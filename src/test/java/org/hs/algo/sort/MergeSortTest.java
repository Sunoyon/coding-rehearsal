package org.hs.algo.sort;

import org.junit.Test;

public class MergeSortTest {
	
	@Test
	public void sortTest() {
		long[] array = new long[] {1l,55l,12l,9856l,254,55l,-11l};
		MergeSort.sort(array, 0, 6);
		for (long l : array) {
			System.out.println(l);
		}
	}
}
