package array.problems;

public class CloudGame {

	public static void main(String[] args) {
		
		jumpingOnClouds(new int[] {0,0,0,1,0,0});

	}
	
	static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        //We will first check if 2 cloud jump is possible, if not then we will make one jump becuase it is always possible to win the game 
        int ind = 0;

        while(ind < c.length){
            if(ind +2 < c.length && c[ind+2]==0){
                ind +=2;
            }else if(ind+1 < c.length){
                ind += 1;
            }else {
            	break;
            }
            jumps++;
        }

        return jumps;

    }

}
