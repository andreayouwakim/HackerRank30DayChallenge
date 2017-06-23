/**
 * Objective 
In this challenge, we're going to use loops to help us do some simple math. 
Check out the Tutorial tab to learn more.

Task 
Given an integer, , print its first  multiples. Each multiple  (where ) 
should be printed on a new line in the form: n x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form: 
n x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static String composite(String s){
        String done = "";
        char[] word = s.toCharArray();
        for(int i = 0; i < s.length(); i+= 2){
            done += word[i];
        }
        done += " ";
        for(int i = 1; i < s.length(); i+= 2){
            done += word[i];
        }
        return done;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i = 1; i < n; i++){
            while(in.hasNext()){
                String first_word = in.nextLine();
                String second_word = in.nextLine();
                System.out.println(composite(first_word));
                System.out.println(composite(second_word));
            }
        }
   }
}
