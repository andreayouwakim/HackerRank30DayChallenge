/**
 * Objective 
 Link to problem: https://www.hackerrank.com/challenges/30-running-time-and-complexity?h_r=next-challenge&h_v=zen
Today we're learning about running time! Check out the Tutorial tab for learning materials and an instructional video!

Task 
A prime is a natural number greater than  that has no positive divisors other than  and itself. 
Given a number, , determine and print whether it's  or .

Note: If possible, try to come up with a  primality algorithm, or see what sort of optimizations 
you come up with for an  algorithm. Be sure to check out the Editorial after submitting your code!

Input Format

The first line contains an integer, , the number of test cases. 
Each of the  subsequent lines contains an integer, , to be tested for primality.

Constraints

Output Format

For each test case, print whether  is  or  on a new line.

Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime
Explanation

Test Case 0: . 
 is divisible by numbers other than  and itself (i.e.: , , ), so we print  on a new line.

Test Case 1: . 
 is only divisible  and itself, so we print  on a new line.

Test Case 2: . 
 is only divisible  and itself, so we print  on a new line.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        boolean is_prime = true;
        Scanner scan = new Scanner(System.in);
       
        int num_times = scan.nextInt();
     
        for(int k = 1; k <= num_times; k++ ){
           int n = scan.nextInt();
             if(n == 0 || n == 1){
                 System.out.println("Not prime");
                 break;
             }
             if(n == 2 || n == 3){
                 System.out.println("Prime");
                 break;
             }
      
             for(int i = n - 1; i > 1; i--){
                if(n % i == 0){
                  System.out.println("Not prime");
                  // the break line makes the best case O(1)
                  // and the worst case O(N)
                  is_prime = false;
                  break;
                }
            }
            
        if(is_prime)
            System.out.println("Prime");
        is_prime = true;
        
      }
    }
}
