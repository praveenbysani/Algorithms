package dp;

import java.util.Arrays;


public class MinCoinSumSolver {

    // give n coins of values v1,v2..vn, find the minimum number of coins required to acheive a sum of S
    public static void main(String args[]){
        
        int sum = 25; // sum to be achieved
        int[] values = new int[]{1,3,5,10}; //values of coins available
        int[] minCoins = new int[sum+1]; // array to store the min coins solution for all sums
        Arrays.fill(minCoins,100);  // initialize to some large value
        minCoins[0]=0; // known state to start from
        
        // given the sum for all i-1 states, find the coins that can achieve the sum of state i and update
        // min coins value 
        for(int i=1;i<=sum;i++){
            for(int j=0;j < values.length;j++){
                if(values[j] <= i && minCoins[i-values[j]]+1 < minCoins[i]){
                    minCoins[i]=minCoins[i-values[j]]+1;
                }
            }
            
        }
        System.out.println("number::"+minCoins[25]);
        
    }
}
