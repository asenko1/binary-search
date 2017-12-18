package main;

public class BinarySearch {
	public static int arrayBinarySearch(int[] array, int min, int max, int target){
		int index = -1;
		
		//Error handling
		if(max < min)
			return index;
		else if(array == null)
			return index;
		else if(max > array.length)
			return index;
		else if(min < 0)
			return index;
		
		//Search
		int midpoint = (min + max) / 2;
		if(midpoint >= array.length)
			return index;
		else if(target == array[midpoint])
			return midpoint;
		else if(target < array[midpoint]){
			index = arrayBinarySearch(array, min, midpoint - 1, target);
		}
		else if(target > array[midpoint]){
			index = arrayBinarySearch(array, midpoint + 1, max, target);
		}
		return index;
	}
	

}
