package org.hs.algo.search;

import static org.junit.Assert.assertEquals;

import org.hs.algo.search.BinarySearch;
import org.junit.Test;

public class BinarySearchTest {
	
	@Test
	public void searchTest() {
		int length = 10;
		long[] array = new long[] { 1l, 2l, 3l, 4l, 5l, 6l, 7l, 8l, 9l, 10l };
		assertEquals(BinarySearch.search(array, length, 1000l), -999999l);
		assertEquals(BinarySearch.search(array, length, 5l), 4l);
		assertEquals(BinarySearch.search(array, length, 1l), 0l);
		assertEquals(BinarySearch.search(array, length, 10l), 9l);
	}
	
	
	public void searchRecursiveTest() {
		long[] array = new long[] { 1l, 2l, 3l, 4l, 5l, 6l, 7l, 8l, 9l, 10l };
		
		assertEquals(BinarySearch.searchRecursive(array, 0, 9, 1000l), -999999l);
		assertEquals(BinarySearch.searchRecursive(array, 0, 9, 5l), 4l);
		assertEquals(BinarySearch.searchRecursive(array, 0, 9, 1l), 0l);
		assertEquals(BinarySearch.searchRecursive(array, 0, 9, 10l), 9l);
	}

}
