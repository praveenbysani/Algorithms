package math;

/**
 *
 * @author Praveen
 */
public class IsPalindrome {
    
        public static void main(String args[]){
            int i =103001;
            System.out.println(isPalindrome(i));
            
        }
    	public static boolean isPalindrome(int a) {
            String s = String.valueOf(a);
            
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1))
                    return false;
            }
            return true;
	}
    
}
