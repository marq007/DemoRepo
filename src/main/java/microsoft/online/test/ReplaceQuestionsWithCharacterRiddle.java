package microsoft.online.test;

public class ReplaceQuestionsWithCharacterRiddle {

	public static void main(String[] args) {
		ReplaceQuestionsWithCharacterRiddle myClass = new ReplaceQuestionsWithCharacterRiddle();
		char c = 'a';
		int ascii = 97; 
		System.out.println((char)ascii);
		System.out.println(myClass.solution("a???z?z"));
		

	}
	
	public String solution(String riddle) {
		if(null==riddle || riddle.length()==0) {
			return null;
		}
		StringBuilder solution = new StringBuilder();
		int i = 0;
		char[] riddleCharArr = riddle.toCharArray();
		for(char c : riddleCharArr) {
			if(c=='?') {
				solution.append(replaceQuestionMark(i,riddleCharArr));
			}else {
				solution.append(c);
			}
			i++;
		}
		return solution.toString();
	}

	private char replaceQuestionMark(int i, char[] riddleCharArr) {
		
		
		int charBefore = 96;
		int charAfter = 96;
		if(i>0) {
			charBefore = riddleCharArr[i-1];
		}
		if(i<riddleCharArr.length-2 && riddleCharArr[i+1]!='?') {
			charAfter = riddleCharArr[i+1];
		}
		
		int toReturnChar = 97;
		if(charBefore==toReturnChar) {
			toReturnChar = charBefore+1;
		}
		
		else if(toReturnChar==charAfter) {
			toReturnChar = charBefore+2;
		}
		
		if(toReturnChar>123) {
			toReturnChar = 123- toReturnChar;
		}
		riddleCharArr[i] = Character.toChars(toReturnChar)[0];
		return Character.toChars(toReturnChar)[0];
	}
}
