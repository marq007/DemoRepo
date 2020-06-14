package elevatorProblemMath;

import java.util.Scanner;

public class ElevatorProblem {
	
	int totalfloors = 0;
	
	long distanceTraveled = 0L;
	
	int numOfpeopleInside = 0;
	
	int currentFloor = 1;
	
	int[][] events;
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ElevatorProblem myClass = new ElevatorProblem();
		Scanner s = new Scanner(System.in);
        String[] line = s.nextLine().split(" ");                 // Reading input from STDIN
        myClass.totalfloors = Integer.parseInt(line[0]);
        int numberOfEvents = Integer.parseInt(line[1]);
        myClass.events = new int[numberOfEvents][3];
        for(int i=0;i<numberOfEvents;i++) {
        	line = s.nextLine().split(" ");
        	myClass.events[i][0]=Integer.parseInt(line[0]);
        	myClass.events[i][1]=Integer.parseInt(line[1]);
        	myClass.events[i][2]=Integer.parseInt(line[2]);        	
        }
        
		myClass.totalfloors = 10;
		
		
		int[] currentEvent;
		int runningEvent =0;
		while(runningEvent < numberOfEvents ) {
			currentEvent = myClass.events[runningEvent];
			
			switch (currentEvent[0]) {
				case 1 : myClass.entry(currentEvent[1],currentEvent[2]);break;
				case 2 : myClass.exit(currentEvent[1],currentEvent[2]);break;
			}
			
			runningEvent++;
		}
		
		
		System.out.println(myClass.distanceTraveled+" "+myClass.numOfpeopleInside);

	}
	
	public void entry(int floor, int numOfPeople) {
		
		if(isValidEntry(floor+numOfPeople)) {
			numOfpeopleInside += numOfPeople;
			distanceTraveled += Math.abs(currentFloor - floor);
			currentFloor = floor;
		}
		
	}
	
	public void exit(int floor, int numOfPeople) {
		if(isValidExit(floor+numOfPeople)) {
			numOfpeopleInside -= numOfPeople;
			distanceTraveled += Math.abs(currentFloor - floor);
			currentFloor = floor;
		}
	}
	
	public boolean isValidEntry(int num) {
		//return true if num is prime else false;
		boolean isNotPrime = false;
		int i = 2;
        while(i <= num/2)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
            	isNotPrime = true;
                break;
            }
            ++i;
        }
        
        return !isNotPrime;
	}
	
	public boolean isValidExit(int num) {
		// return true if num is Odd number else false
		return num % 2 == 1 && num <= numOfpeopleInside? true : false;
		
	}

}
