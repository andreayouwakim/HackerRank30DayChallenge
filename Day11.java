/**
 * Objective 
Today, we're building on our knowledge of Arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video!

Context 
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task 
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Input Format

There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .

Constraints

Output Format

Print the largest (maximum) hourglass sum found in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

 contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
      // reading in values into the array
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
      // setting best to integer.min so you can keep a clean slate
      // for possible negatives
        int best = Integer.MIN_VALUE;
      // loop through the array
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
              // make sure you're in bounds
                if( i + 2 < 6 && j + 2 < 6){
                  // these are the coordinates for the hourglass pattern
                  int temp = arr[i][j] + arr[i][j + 1 ] + arr[i][j + 2 ] +
                         arr[i + 2][j] + arr[i + 2 ][j + 1 ] + arr[i + 2 ][j + 2 ] ;
                 temp += arr[i + 1][j + 1 ];
                
               // if best hasn't been set to an actual value yet, let's go ahead and do that   
               if(best == Integer.MIN_VALUE)
                   best = temp;
               // update and keep track of the best hourglass you've come across
                if(temp > best)
                    best = temp;
              }
           }
        }
      // print the best
        System.out.println(best);
    }
}
  
