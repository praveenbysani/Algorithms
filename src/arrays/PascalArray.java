package arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Praveen
 */
public class PascalArray {
     public static void main(String args[]){
        ArrayList<ArrayList<Integer>> pArrays= generate(0);
        for(ArrayList<Integer> outerArray:pArrays){
            for(Integer number:outerArray){
                System.out.print(number+ " ");
            }
            System.out.println();
        }
         
     }
    
    	public static ArrayList<ArrayList<Integer>> generate(int a) {
	    
            ArrayList<ArrayList<Integer>> pascalArray  = new ArrayList<ArrayList<Integer>>();
            for(int i=1;i <=a;i++ ){
                Integer[] inArray = new Integer[i];
                // initialize first and last elements
                inArray[0]=1;
                inArray[i-1]=1;
                //generate elements in between
                if(i > 2){
                    ArrayList<Integer> prevRow = pascalArray.get(i-2);
                    for(int j=1;j<i-1;j++){

                        inArray[j] = prevRow.get(j)+prevRow.get(j-1);

                    }
                }
                pascalArray.add( new ArrayList(Arrays.asList(inArray)));
            }
            
            return pascalArray;
	}

    
}
