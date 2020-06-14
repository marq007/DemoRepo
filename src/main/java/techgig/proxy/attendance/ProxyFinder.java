package techgig.proxy.attendance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProxyFinder {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
        String[] arr = s.nextLine().split(" ");                 // Reading input from STDIN
        int [] studs = new int[arr.length];
        List<Integer> proxyStuds = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
        	studs[i] = Integer.parseInt(arr[i]);
        	proxyStuds.add(i+1);
        }
        
        for(int roll : studs) {
        	proxyStuds.remove(new Integer(roll));
        }
        
        StringBuffer bf = new StringBuffer();
        for(int proxyStud:proxyStuds) {
        	bf.append(proxyStud);
        }
        
        System.out.println(bf.substring(0, bf.length()));
        
	}

}
