
package sort;

import java.util.Arrays;

/**
 *
 * @author Praveen
 */
public class MergeSort {
    public static void main(String args[]){
        
        int[] array1 = new int[]{7,9,11,13};
        int[] array2 = new int[]{6,8,10};
        int[] array3 = new int[]{4,6,12,32,35,40};
        int[] uarray = new int[]{43,22,12,32,26,14};
        mergeSort(uarray);
        for(int i:uarray)
            System.out.println(i);
    }
    
    // using recursion to solve the problem
    // divide and conqeur solution
    // additional arrays generated through recursion, space complexity of O(n log n)
    // time complexity of O(n log n)
    // // Assume T(n) is the time taken for function, it is represented as
    // // T(n) = 2*T(n/2)+ c1*n + c2, and we only know T(1)=const, hence 
    // // T(n) = 2^k * T(n/2^k) + k*c1*n .. for  k = log n
    // // T(n) = O(nlogn)
    
    
    public static void mergeSort(int[] unsortedArray){
        if(unsortedArray.length == 1)
            return;
        else{
            int split_index = (0+unsortedArray.length)/2;
            int [] left_array = Arrays.copyOfRange(unsortedArray, 0, split_index);
            int [] right_array = Arrays.copyOfRange(unsortedArray, split_index, unsortedArray.length);
            mergeSort(left_array);
            mergeSort(right_array);
            mergeArrays(unsortedArray,left_array,right_array);
         }
            
        
    }
    
    // assumes that the two parts of the array are sorted, merges two sorted arrays into one
    public static void mergeArrays(int[] mergedArray,int [] leftArray, int[] rightArray){
        

        // indexes to store the posistion in arrays
        int i=0;
        int j=0;
        int k=0;
        
        // loop untill both conditions hold true
        while(i < leftArray.length && j < rightArray.length){
         
            // when left array element in less than the right array element
            if(leftArray[i] < rightArray[j]){
                mergedArray[k] = leftArray[i];
                k++;
                i++;
            }
            // when right array element is less than the left array element
            else if (leftArray[i] >= rightArray[j]){
                mergedArray[k] = rightArray[j];
                j++;
                k++;
            }
            
        }
        //copy the remainig elements
        while(i < leftArray.length){
            mergedArray[k] = leftArray[i]; i++; k++;
        }
        // copy the remaining elements
        while(j < rightArray.length){
            mergedArray[k] = rightArray[j]; j++; k++;
        }
        return ;
                
    }
    
}
