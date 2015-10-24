
package math;

public class PrimeNumber {
    public int isPrime(int a) {
        if(a < 2)
            return 0;
        for(int i=2;i<=a/2;i++)
            if(a % i ==0)
                return 0;
        
        return 1;
           
    }
    
}
