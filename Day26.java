/**
 * Objective 
 Link to problem : https://www.hackerrank.com/challenges/30-nested-logic
Today's challenge puts your understanding of nested conditional statements to the test. 
You already have the knowledge to complete this challenge, but check out the Tutorial tab for a video on testing!

Task 
Your local library needs your help! Given the expected and actual return dates for a library book, 
create a program that calculates the fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: .
If the book is returned after the expected return day but still within the same calendar 
month and year as the expected return date, .
If the book is returned after the expected return month but still within the same calendar 
year as the expected return date, the .
If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
Input Format

The first line contains  space-separated integers denoting the respective , ,
and  on which the book was actually returned. 
The second line contains  space-separated integers denoting the respective , , 
and  on which the book was expected to be returned (due date).

Constraints

Output Format

Print a single integer denoting the library fine for the book received as input.

Sample Input

9 6 2015
6 6 2015
Sample Output

45
Explanation

Given the following return dates: 
Actual:  
Expected: 

Because , we know it is less than a year late. 
Because , we know it's less than a month late. 
Because , we know that it was returned late (but still within the same month and year).

Per the library's fee structure, we know that our fine will be . We then print the result of  as our output.
 */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int current_day = scan.nextInt();
        int current_month = scan.nextInt();
        int current_year = scan.nextInt();
        int expected_day = scan.nextInt();
        int expected_month = scan.nextInt();
        int expected_year = scan.nextInt();
        scan.close();
        int months_late = current_month - expected_month;
        int days_late = current_day - expected_day;
        int year_late = current_year - expected_year;


        if(current_year - expected_year > 0 ){
            System.out.println(10000);
        }else if(current_month - expected_month > 0 && year_late == 0){
            System.out.println(months_late * 500);
        }else if(current_day - expected_day > 0 && year_late == 0){
            System.out.println(days_late * 15);
        }else{
            System.out.println(0);
        }
           
    }
        
}
