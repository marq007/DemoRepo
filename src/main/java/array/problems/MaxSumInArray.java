package array.problems;

public class MaxSumInArray {
	
	public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE ;
        int sum=0;
        for(int i=0;i<nums.length;i++){
        	sum = sum + (nums[i]);
            sum = getMax(nums[i],sum);
            maxSum= getMax(sum,maxSum);
        }        
        return maxSum;
    }
    
    public int getMax(int a,int b){
        return a>b?a:b;
    }

	public static void main(String[] args) {
		MaxSumInArray thisObj = new MaxSumInArray();
		
		System.out.println(thisObj.maxSubArray(new int[]{Integer.MIN_VALUE}));

	}

}
