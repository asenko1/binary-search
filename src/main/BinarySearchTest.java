package main;

import static org.junit.Assert.*;


import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void arrayBinarySearchCorrectnessTest(){		
		//Correctness Test
		int[] testData = new int[]{1,5,8,12,13};
		int[] inputs = new int[]{8,1,23,1,11};
		int[] correctOutput = new int[]{2,0,-1,0,-1};
		for(int i = 0; i < inputs.length; i++){
			assertEquals(BinarySearch.arrayBinarySearch(testData, 0, testData.length, inputs[i]), correctOutput[i]);
		}		
	}
	
	@Test
	public void arrayBinarySearchNullTest(){
		assertEquals(BinarySearch.arrayBinarySearch(null,0,10,5), -1);
	}
	
	@Test
	public void arrayBinarySearchInvalidRangeTest(){
		int[] testData = new int []{1,5,8,12,13};
		assertEquals(BinarySearch.arrayBinarySearch(testData, 3, 2, 12), -1);
	}
	
	@Test
	public void arrayBinarySearchOutOfBoundsTest(){
		int[] testData = new int []{1,5,8,12,13};
		assertEquals(BinarySearch.arrayBinarySearch(testData, 0, 10, 12), -1);
	}
	
}
