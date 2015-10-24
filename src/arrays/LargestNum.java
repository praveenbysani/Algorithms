package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Praveen
 */
public class LargestNum {
    public static void main(String args[]){
        Integer[] tArray = new Integer[]{12,121};
        System.out.println(largestNumber(Arrays.asList(tArray)));
    }
    public static String largestNumber(final List<Integer> a) {
  
        ArrayList<String> sNums=new ArrayList<String>();
        
        for(Integer i:a){
            sNums.add(String.valueOf(i));
        }
        
   
       Comparator<String> compartor; 
        compartor = new Comparator<String>(){
            
            @Override
            public int compare(String o1, String o2) {
                String x = o1+o2;
                String y = o2+o1;
                return x.compareTo(y);
            }
        }; 
        Collections.sort(sNums,compartor);
        Collections.reverse(sNums);
        StringBuffer sb = new StringBuffer();
        for(String s:sNums)
            sb.append(s);
        if(sb.toString().startsWith("0"))
            return "0";
        return sb.toString();

        
    }

}
