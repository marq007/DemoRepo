package zolando.multiplication.conseutive.number;

import java.util.HashSet;
import java.util.Scanner;

public class MagmaNumber {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int numberOfTests = Integer.parseInt(scanner.nextLine());
        int[] solutions = new int[numberOfTests];
        
        for(int i=0;i<numberOfTests;i++) {
        	
        	long num = Long.parseLong(scanner.nextLine());
        	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        	solutions[i] = getNumberOfMagmaNumbersEff(num);
        	
        }
        
        for(int results : solutions) {
        	System.out.println(results);
        }
        
        scanner.close();
    

	}
	
	public static int getNumberOfMagmaNumbersEff(long num) {
		int count = 0;
		int maxValOfX = (int)Math.cbrt(num);
		HashSet<Double> setOfMagnumNums = new HashSet<>();
		while(maxValOfX>=2) {
			
			count = (int) (num/Math.pow(maxValOfX,3));
			for(int y=1;y<=count;y++) {
				setOfMagnumNums.add(Math.pow(maxValOfX, 3)*y);
			}			
			maxValOfX--;
		}
		
		
		return setOfMagnumNums.size(); 
	}
	
	public static int getNumberOfMagmaNumbers(long num) {
		int count = 0;
		int x =2,y=1;
		double magmaNum =Math.pow(x, 3)*1;
		
		while(magmaNum<=num) {
			
			while(magmaNum<=num) {
				System.out.println(magmaNum);
				y++;
				count++;
				magmaNum = Math.pow(x, 3)*y;
			}
			x++;
			y=1;
			magmaNum = Math.pow(x, 3)*y;
			
		}
		
		
		return count; 
	}

}
