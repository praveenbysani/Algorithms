package math;

/**
 *
 * @author Praveen
 */
public class ExcelToNumber {
    public static void main(String args[]){
        System.out.println(titleToNumber("AAA"));
    }
    public static int titleToNumber(String a) {
        int sLen = a.length()-1;
        int tValue =0;
        for(int j=sLen;j >=0; j--){
            int pValue = sLen - j;
            int charValue = (int)a.charAt(j)-64;
            
            if(pValue==0)
                tValue = tValue+charValue;
            else
                tValue = (int) (Math.pow(26,pValue)*charValue+tValue);
            
        }
        return tValue;
    }
}
