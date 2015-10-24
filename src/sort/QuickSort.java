package sort;

/**
 *
 * @author Praveen
 */
public class QuickSort {
    public static void main(String args[]){
        
        int[] testArray = new int[]{23,24,21,6,43,9};
        quickSortArray(testArray,0,testArray.length-1);
        
        for(int i:testArray)
            System.out.println(i);
    }
    // worst-case - O(n2)
    // average case - O(nlogn)
    // in-place sorting unlike merge sort algorithm
    // most prefered sorting algorithm
    // use recursion to sort the sub parts of array by using the partition function
    public static void quickSortArray(int [] oArray, int start, int end){
        if(start < end){
            int p_index = partitionArray(oArray,start,end);
            quickSortArray(oArray,start,p_index-1);
            quickSortArray(oArray,p_index+1,end);
            
        }
    }
    // select a pivot and reorganize the array such that,
    // all the elements less than pivot are to the left of partition index
    // all the elements greater than pivot are to the right of partition index
    public static int partitionArray(int[] iArray, int start, int end){
        
        // the pivot will always be the last element of the array
        int pivot = iArray[end];
        // initialize the pivot index to the start of array
        int pivot_index =start;
        
        for(int itr=start;itr<end;itr++){
            
            if(iArray[itr] < pivot){
                //swap the pivot index element with the current element
                int tempVar = iArray[pivot_index];
                iArray[pivot_index] = iArray[itr];
                iArray[itr] = tempVar;
                // increment the pivot index
                pivot_index ++;
            }
            
            
        }
        
        int tempInt = iArray[end];
        iArray[end] = iArray[pivot_index];
        iArray[pivot_index] = tempInt;
        
        return pivot_index;
    }
    
}
