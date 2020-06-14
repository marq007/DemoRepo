package test.dome.sample;

public class Palindorme {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        for(int i=0,j=word.length()-1;i<=word.length()/2;i++,j--){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
        }       
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindorme.isPalindrome("Deleveled"));
    }
}
