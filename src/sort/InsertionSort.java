package sort;

import java.util.Arrays;

/**
 *
 * @author Praveen
 */
public class InsertionSort {
    
    public static void main(String args[]){
        System.out.println("ast");
        int[] iArray = new int[]{5,4,8,3,9,1,7,6,12,11};
        insertSortIntegers(iArray);
        
    }
    public static void insertSortIntegers(int[] intArray){
        
        for(int indx=1;indx < intArray.length ; indx++){
            int value = intArray[indx];
            int open_position = indx;
            for(int j=indx-1;j>=0;j--){
                if(intArray[j] > value){
                    intArray[j+1] = intArray[j];
                    open_position = j;
                }
                else
                    break;
                    
            }
            intArray[open_position] = value;
        }
        for(int i:intArray)
            System.out.println(i);

    }
    
}
