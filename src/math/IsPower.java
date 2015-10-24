package math;

/**
 *
 * @author Praveen
 */
public class IsPower {
    
     public static void main(String args[]){
         
         System.out.println(isPower(34));
     }
     public static boolean isPower(int a) {
         for(int i=2;i<32;i++){
             int x=1;
             while(Math.pow(x, i) <= Integer.MAX_VALUE){
                 if(a==Math.pow(x, i))
                     return true;
                 x++;
             }
         }
         return false;
    }
    
}
