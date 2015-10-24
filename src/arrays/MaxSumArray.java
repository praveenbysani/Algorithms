
package arrays;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Praveen
 */
public class MaxSumArray {
    public static void main(String args[]){
        Integer[] testArray = new Integer[]{3,4,5,-2,-3,-5,-4,13};
        System.out.println(optimizedMaxSubArray(Arrays.asList(testArray)));
    }
    
    // time complexity of O(n)
    // assumes that there is atleast a positive integer in array
    // key observation to store the max sum until the current index, and store the max sum observed so far
    // reset sum to 0 and discard current sub array when encountered with a large negative value a
    public static int optimizedMaxSubArray(final List<Integer> a){
        int sum=0;
        int max_sum= Integer.MIN_VALUE;

        // when all the elements in the array are negative, return the max element
        boolean isNegative = true;
        for(int i=0;i<a.size();i++){
            if(a.get(i) > 0){
                isNegative=false;
                break;
            }
            if (a.get(i) > max_sum ) max_sum = a.get(i);
            
        }
        
        if(isNegative) return max_sum;
         
        // other wise
         for(int i=0; i< a.size();i++){
             sum = sum+a.get(i);
             if(sum < 0)
                 sum=0;            
             max_sum = Math.max(max_sum, sum);
             
         }
        
         return max_sum;
        
    }
    
    
    // time complexity of O(n^2)
    public static int maxSubArray(final List<Integer> a){

        int max_sum =Integer.MIN_VALUE;
        
        //start to search from first through last element in array
        for(int index=0;index< a.size();index++){
            int index_sum = a.get(index);
            if(index_sum > max_sum)
                max_sum = index_sum;
            // calculate the sum for the subsequent elements
            for(int itr=index+1;itr< a.size(); itr++){
                index_sum = index_sum+a.get(itr);
                if(index_sum > max_sum)
                    max_sum = index_sum;
            }
        }
        
        return max_sum;
    }
    
}
