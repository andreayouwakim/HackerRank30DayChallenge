/**
 * Objective 
Link to problem : https://www.hackerrank.com/challenges/30-binary-trees?h_r=next-challenge&h_v=zen
Today, we're going further with Binary Search Trees.
Check out the Tutorial tab for learning materials and an instructional video!

Task 
A level-order traversal, also known as a breadth-first search, 
visits each level of a tree's nodes from left to right, top to bottom. You are given a pointer, 
, pointing to the root of a binary search tree. Complete the levelOrder function provided in your
editor so that it prints the level-order traversal of the binary search tree.

Hint: You'll find a queue helpful in completing this challenge.

Input Format

The locked stub code in your editor reads the following inputs and assembles them into a BST: 
The first line contains an integer,  (the number of test cases). 
The  subsequent lines each contain an integer, , denoting the value of an element that must be added to the BST.

Output Format

Print the  value of each node in the tree's level-order traversal as a single line of  space-separated integers.

Sample Input

6
3
5
4
7
2
1
Sample Output

3 2 5 1 4 7 
Explanation

The input forms the following binary search tree: 
BST.png

We traverse each level of the tree from the root downward, and we process the nodes 
at each level from left to right. The resulting level-order traversal is , and we print 
these data values as a single line of space-separated integers.
 */


import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
  
      static void levelOrder(Node root){
      //Write your code here
      Queue<Node> queue = new LinkedList();
      // add the root node 
      queue.add(root);
      while(!queue.isEmpty()){
          Node current_node = queue.remove();
          System.out.print(current_node.data + " ");
          // enqueue child elements from next level in order
          // check if tree has non-empty left subtree
          if(current_node.left != null) 
            queue.add(current_node.left);
          // check if tree has non-empty right subtree
          if(current_node.right != null) 
            queue.add(current_node.right); 
      }
   }
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}





