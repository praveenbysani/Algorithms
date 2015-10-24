package math;

/**
 *
 * @author Praveen
 */
public class TiralingZeroes {
    	public static int trailingZeroes(int a) {
            int i=1;
            int num=0;
            while( a/Math.pow(5, i) > 0){

                num = (int) (num+ (a/Math.pow(5, i)));
                i++;
            }
            return num;
	}
        public static void main(String args[]){
            System.out.println(trailingZeroes(9247));
        }
    
}
