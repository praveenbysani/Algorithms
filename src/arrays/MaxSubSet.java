package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Praveen
 */
public class MaxSubSet {
    public static void main(String args[]){
        
       Integer[] testArray = new Integer[]{336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421 };
       System.out.println(maxset(Arrays.asList(testArray)));
    }
    
    public static List<Integer> maxset(List<Integer> a) {
        
        ArrayList<Integer> subSet = new ArrayList<Integer>();
        ArrayList<Integer> maxSubSet = new ArrayList<Integer>();
        
        long sum=0;
        long max_sum =0;
        
        for(int i=0;i<a.size();i++){
            
            if(a.get(i) <0 ){

                subSet = new ArrayList<Integer>();
                sum=0;
                continue;
            }
            
            sum = sum+a.get(i);
            subSet.add(a.get(i));
            //reassign the existing subset to maxSubset, and assign current sum as max_sum
            if(sum >= max_sum){

                if(sum == max_sum && subSet.size() > maxSubSet.size()){
                    maxSubSet= subSet;
                }
                else if (sum > max_sum){
                    maxSubSet = subSet;
                }
                max_sum = sum;

            }
           System.out.println(i+":"+sum+":"+max_sum);
                            
        }
        return maxSubSet;
    }
    
}
