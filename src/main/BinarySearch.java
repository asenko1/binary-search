package main;

public class BinarySearch {
	public static int arrayBinarySearch(int[] array, int min, int max, int target){
		int index = -1;
		if(max < min)
			return index;
		int midpoint = (min + max) / 2;
		if(target == midpoint)
			return midpoint;
		else if(target < midpoint){
			index = arrayBinarySearch(array, min, midpoint - 1, target);
		}
		else if(target > midpoint){
			index = arrayBinarySearch(array, midpoint + 1, max, target);
		}
		return index;
	}
	

}
