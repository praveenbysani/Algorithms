package math;

import java.util.ArrayList;

/**
 *
 * @author Praveen
 */

/*
re arragne array such that the arr[i] = arr[arr[i]], core assumptions
all elements in the array will be < n-1 ( multiplication factor)
n*n will not overflow integer

*/
public class ReArrangeArray {
     
    
    	public void arrange(ArrayList<Integer> a) {
            int aSize = a.size();
            for(int i=0;i< aSize;i++){
                a.set(i, a.get(i)+(a.get(a.get(i)) % aSize)*aSize );          
            }
            for(int i=0;i<aSize;i++)
            a.set(i, a.get(i)/aSize );          
	}
    
}
