/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package math;

/**
 *
 * @author Praveen
 */
public class DigitsInBinary {
    
public String findDigitsInBinary(int a) {
            if(a ==0)
                return "0";
            StringBuffer sb = new StringBuffer();
            while(a > 0){
                 int rem= a%2;
                 a = a/2;
                 sb.append(String.valueOf(rem));
            }
            return sb.reverse().toString();
	}
        
    
}
