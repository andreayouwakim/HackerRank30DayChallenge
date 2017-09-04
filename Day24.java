/**
 * Objective 
Link to the problem : https://www.hackerrank.com/challenges/30-linked-list-deletion?h_r=next-challenge&h_v=zen
Check out the Tutorial tab for learning materials and an instructional video!

Task 
A Node class is provided for you in the editor. A Node object has an integer data field, ,
and a Node instance pointer, , pointing to another node (i.e.: the next node in a list).

A removeDuplicates function is declared in your editor, which takes a pointer to the  node of a linked 
list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes from the list and 
returns the head of the updated list.

Note: The  pointer may be null, indicating that the list is empty. Be sure to reset your  pointer when
performing deletions to avoid breaking the list.

Input Format

You do not need to read any input from stdin. The following input is handled by the locked stub code and 
passed to the removeDuplicates function: 
The first line contains an integer, , the number of nodes to be inserted. 
The  subsequent lines each contain an integer describing the  value of a node being inserted at the list's tail.

Constraints

The data elements of the linked list argument will always be in non-decreasing order.
Output Format

Your removeDuplicates function should return the head of the updated linked list. The locked stub code in 
your editor will print the returned list to stdout.

Sample Input

6
1
2
2
3
3
4
Sample Output

1 2 3 4 
Explanation

, and our non-decreasing list is . 
The values  and  both occur twice in the list, so we remove the two duplicate nodes. 
We then return our updated (ascending) list, which is .
 */


import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{
     public static Node removeDuplicates(Node head) {
        //Write your code here
        // check if head == null because that means you have an empty list 
        if (head == null)
            return null;
        Map<Integer, Integer> map =new HashMap<Integer, Integer>();
        Node previous = head;
        Node current = previous.next;
        int key = 0;
        // check if your current node is null because that means
        // the list only has one element, so you need to return 
        // the head node
        if(current == null)
          return head;
        // if you've made it here, we know the list isn't empty
        // and we know that there is more than one element 
        // therefor, we need to add it to our hashmap
        map.put(key, previous.data);
        // the key variable is keeping a sort of index for the map, so 
        // you have to update it everytime you add something so 
        // we don't override any variables.
        key++;
        // iterating through the entire list
        while(current != null){
            // check if the map contains the value =>
            // if it does, you need to remove that node
            if(map.containsValue(current.data)){    
              previous.next = current.next;
              current = current.next;
            }else{
                // the value is not in the map, so we need to add it to the map
                map.put(key, current.data);
                key++;
                // now we can move on with our list 
                previous = current;
                current = current.next;
            }
        }
        return head;
    }
  
      public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }
