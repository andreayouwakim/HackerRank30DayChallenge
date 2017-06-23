/**
 * Objective
Today we're expanding our knowledge of Strings and combining 
it with what we've already learned about loops. Check out the 
Tutorial tab for learning materials and an instructional video!

Task
Given a string, , of length that is indexed from to , print its 
even-indexed and odd-indexed characters as space-separated strings 
on a single line (see the Sample below for more detail).

Note: is considered to be an even index.

Input Format

The first line contains an integer, (the number of test cases).
Each line of the subsequent lines contain a String, .

Constraints

Output Format

For each String (where ), print 's even-indexed characters, 
followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank

Sample Output

Hce akr
Rn ak

Explanation

Test Case 0:






The even indices are , , and , and the odd indices are , , and .
We then print a single line of space-separated strings; the first 
string contains the ordered characters from 's even indices (), and 
the second string contains the ordered characters from 's odd indices ().

Test Case 1:




The even indices are and , and the odd indices are and . 
We then print a single line of space-separated strings; the 
first string contains the ordered characters from 's even indices 
(), and the second string contains the ordered characters from 's odd indices ().
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
