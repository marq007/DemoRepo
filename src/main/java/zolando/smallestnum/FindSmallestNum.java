package zolando.smallestnum;

public class FindSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(923456789));

	}
	
	public static int solution(int N) {
		if(N>1){
            String s = Integer.toString(N);
		    return (int) (Math.pow(10, s.length()-1));
        }else{
            return 0;
        }
	}

}
