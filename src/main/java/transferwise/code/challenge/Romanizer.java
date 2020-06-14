package transferwise.code.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Romanizer {
	
	static HashMap<Integer,String> romanMap = new HashMap<>();
	
	static {
		romanMap.put(1	  ,"I"	 	); 
		   romanMap.put(2	  ,"II"	 );
		   romanMap.put(3 	  ,"III"	);
		   romanMap.put(4 	  ,"IV"	 );
		   romanMap.put(5  	  ,"V"	 	); 
		   romanMap.put(6 	  ,"VI"	 );
		   romanMap.put(7 	  ,"VII"	); 
		   romanMap.put(8 	  ,"VIII");	 
		   romanMap.put(9	  ,"IX");
		   romanMap.put(10 	  ,"X");
		   romanMap.put(20	  ,"XX"	 );
		   romanMap.put(30	  ,"XXX"	 );
		   romanMap.put(40	  ,"XL");
	       romanMap.put(50	  ,"L");
		   romanMap.put(60	  ,"LX");
		   romanMap.put(70	  ,"LXX");
		   romanMap.put(80	  ,"LXXX");	   
	       romanMap.put(90	  ,"XC");
	       romanMap.put(100	  ,"C");
		   romanMap.put(200	  ,"CC");
		   romanMap.put(300	  ,"CCC");
		   romanMap.put(400   ,"CD");
	       romanMap.put(500	  ,"D");
		   romanMap.put(600	  ,"DC");
		   romanMap.put(700	  ,"DCC");
		   romanMap.put(800	  ,"DCC");
	       romanMap.put(900	  ,"CM");
	       romanMap.put(1000	  ,"M");
	       romanMap.put(null,"");
	       romanMap.put(0,"");
	}
	
	public static void main(String[] args) {
		List<Integer> Num = new ArrayList<>();
		Num.add(823);
		Num.add(26);
		System.out.println(romanizer(Num));

	}
	
	public static List<String> romanizer(List<Integer> numbers) {
		List<String> romanNum = new ArrayList<>();
	    for(int numb : numbers) {
	    	if(numb!=1000) {
	    		int hunreds = numb / 100;
	    		
	    		int tenQuotient = numb%100;
	    		int tens = tenQuotient/10;	    		
	    		int units = tenQuotient % 10;
	    		romanNum.add(romanMap.get(hunreds*100)+romanMap.get(tens*10)+romanMap.get(units));
	    	}
	    	else {
	    		romanNum.add("M");
	    	}
	    }
	    
	    return romanNum;
	}
	
	public int remainder(int dividedBy, int div) {
		return div / dividedBy;
	}
	
	public int quotient(int dividedBy, int div) {
		return div % dividedBy;
	}

}
