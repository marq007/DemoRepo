package array.problems;

public class SecondSmallesInterinArray {

	public static void main(String[] args) {
		System.out.println(secondSmallesInteger(new int[]{-5, 3,2,0,-3,6,7}));

	}
	
	public static int secondSmallesInteger(int[] x) {
		if(x.length <2) {
			return 0;
		}
		 int smallestInt = Integer.MAX_VALUE;
		 int secondSmallestInt = Integer.MAX_VALUE;
		 
		 for(int num : x) {
			 if(num < smallestInt) {
				 secondSmallestInt = smallestInt;
				 smallestInt = num;
			 }else if(num < secondSmallestInt){
				 secondSmallestInt = num;
			 }
		 }
		
		
		return secondSmallestInt;
	}

}
