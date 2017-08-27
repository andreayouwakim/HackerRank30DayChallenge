/**
 * Objective 
Today, we're delving into Inheritance. Check out the attached tutorial for learning materials and an instructional video!

Task 
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. 
Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student 
inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has  parameters:
A string, .
A string, .
An integer, .
An integer array (or vector) of test scores, .
A char calculate() method that calculates a Student object's average and returns the grade character 
representative of their calculated average:
Grading.png

Input Format

The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. 
It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin: 
The first line contains , , and , respectively. The second line contains the number of test scores. 
The third line of space-separated integers describes .

Constraints

Output Format

This is handled by the locked stub code in your editor. Your output will be correct if your Student 
class constructor and calculate() method are properly implemented.

Sample Input

Heraldo Memelli 8135627
2
100 80
Sample Output

 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
Explanation

This student had  scores to average:  and . The student's average grade is . An average grade of 
corresponds to the letter grade , so our calculate() method should return the character'O'.
 */

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] test_scores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
   public Student (String first, String last, int num, int[] tests){
        super(first, last, num);
        test_scores = tests;
    }
    
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int sum = 0;
        for(int i = 0; i < test_scores.length; i++){
            sum += test_scores[i];
        }
        double avg = sum / test_scores.length;
        if(90 <= avg && avg <= 100)
            return 'O';
        if(80 <= avg && avg < 90)
            return 'E';
        if(70 <= avg && avg < 80)
            return 'A';
        if(55 <= avg && avg < 70)
            return 'P';
        if(40 <= avg && avg < 55)
            return 'D';
        if(avg < 40)
            return 'T';
        return ' ';
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
