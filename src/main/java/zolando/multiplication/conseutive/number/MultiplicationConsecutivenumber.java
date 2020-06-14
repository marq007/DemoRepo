package zolando.multiplication.conseutive.number;

public class MultiplicationConsecutivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(1,100));

	}
	
	public static int solution(int A, int B) {
		
		if(A<=B) {
			int multiplicaton=6;
			int i = 2;
			int count =0;
			while(multiplicaton<=B) {
				multiplicaton = i*(i+1);
				if(multiplicaton>=A && multiplicaton<=B ) {
					count++;
				}
				i++;
			}
			
			return count;
		}
		else {
			return 0;
		}
	}

}
