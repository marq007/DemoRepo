package array.problems;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		System.out.println(getMissingNumberfromArray(new int[]{1, 2, 3, 4,5, 6, 7, 8, 10,11,12,13,14},14));

	}
	
	public static int getMissingNumberfromArray(int[] x,int num) {
		
		int expectedSum = (num*(num+1))/2;
		int actualSum = 0;
		
		for(int nm : x) {
			actualSum += nm;
		}
		 
		return expectedSum - actualSum;
	}

}
