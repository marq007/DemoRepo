package array.problems;

import java.util.HashMap;
import java.util.Scanner;

public class CountMaxOccurenceInString {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int numberOfCities = Integer.parseInt(scanner.nextLine());
        char[] solution = new char[numberOfCities];
        for(int i=0;i<numberOfCities;i++) {
        	
        	char[] peoples = scanner.nextLine().toCharArray();
        	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        	solution[i] = getMaxPeople(peoples);
        	
        }
        
        for(char immunePeople : solution) {
        	System.out.println(immunePeople);
        }
        
        scanner.close();
    

	}

	private static char getMaxPeople(char[] peoples) {
		
		HashMap<Character,Integer> peoplePopMap = new HashMap<>();
		
		for(char person : peoples) {
			if(peoplePopMap.containsKey(person)) {
				int count  = peoplePopMap.get(person);
				count++;
				peoplePopMap.put(person,count);
			}else {
				peoplePopMap.put(person,1);
			}
		}
		
		int maxPop = 0;
		char maxPopPerson = 0;
		
		for(char person : peoplePopMap.keySet()) {
			if(peoplePopMap.get(person)>maxPop) {
				maxPop = peoplePopMap.get(person);
				maxPopPerson = person;
			}else if(peoplePopMap.get(person)==maxPop && ((int)person<(int)maxPopPerson)) {
				maxPopPerson = person;
			}
		}
		
		return maxPopPerson;
	}

}
