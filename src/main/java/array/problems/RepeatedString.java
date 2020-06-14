package array.problems;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedString("aba", 10l));
	}
	
	static long repeatedString(String s, long n) {
        long completeRepetitions = n / s.length();
        long lastRepitionLenth = n % s.length();
        long numberOfRepetition = 0;
        int countOfOccurence = 0;
        int countOfOccurenceInLastRep = 0;
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++) {
        	if(c[i]=='a' && i<lastRepitionLenth ) {
        		countOfOccurenceInLastRep++;
        		countOfOccurence++;
        	}else if(c[i]=='a' ) {
        		countOfOccurence++;
        	}
        }
        
        numberOfRepetition = (completeRepetitions * countOfOccurence) + countOfOccurenceInLastRep;

        return numberOfRepetition;

    }

}
