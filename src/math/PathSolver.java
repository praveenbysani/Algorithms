package math;

/**
 *
 * @author Praveen
 */
public class PathSolver {
    /*A robot is located at the top-left corner of an A x B grid (marked ‘Start’ in the diagram below).
    The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below).
    How many possible unique paths are there?
    */
    // requires a-1 steps to the down, b-1 steps to the right to reach the end
    // total of a+b-2 steps with combinations of b-1 right steps
    
    public static void main(String args[]){
       System.out.println(uniquePaths(1,3000));
    }
    public static int uniquePaths(int a, int b) {
        if(a+b ==2 )return 1;
        else{
          int n = a+b-2;
          int r = Math.min(a-1,b-1);
          long numerator =1;
          for(int i=n-r+1;i<=n;i++){
              numerator = numerator*i;
          }
          for(int i=1;i<=r;i++)
              numerator = numerator/i;
        
          return (int)numerator;
        }
        
    }
    
}
