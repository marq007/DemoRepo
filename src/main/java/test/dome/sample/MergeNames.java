package test.dome.sample;

import java.util.HashSet;
import java.util.Set;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> uniqueNamesSet = new HashSet<>();
        for(String name : names1){
        	uniqueNamesSet.add(name);
        }
        
        for(String name : names2){
        	uniqueNamesSet.add(name);
        }
        
        return uniqueNamesSet.toArray(new String[uniqueNamesSet.size()]);
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
