/**
 * Objective 
Today, we're working with binary numbers. 
Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given a base- integer, , convert it to binary (base-). 
Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
Explanation

Sample Case 1: 
The binary representation of  is , so the maximum number of consecutive 's is .

Sample Case 2: 
The binary representation of  is , so the maximum number of consecutive 's is .
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toBinaryString(n);
        int count = 0;
        int max = 0;
        int i = 0;
        
        while(i < s.length()){
            while(i < s.length() && s.charAt(i) == '1'){
                max++;
                i++;
            }
            if(count < max){
                count = max;
            }
            max = 0;
            while(i < s.length() && s.charAt(i) == '0'){
                i++;
            }
        }
        System.out.println(count);
    }
     
}

