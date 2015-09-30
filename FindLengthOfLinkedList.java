/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListGeek;

/**
 *
 * @author manmindersinghsodhi
 */

//The length of the Linked List can be founf in two ways. 
/* One being the iterative way and other being the recursive way.


*/
public class FindLengthOfLinkedList {
    
    private class Node
    {
        int data;
        Node next;
    }
    
    
    public Node push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        
        pNode.next = head;
        head = pNode;
        return head;
    }
    
    
    public int getCount(Node head)
    {
        int count  = 0;
        Node current = head;
        while(current!=null)
        {
            count++;
            current = current.next;
        }
        
        return count;
    }
    
    public static void main (String args[])
    {
        Node head = null;
     
        
        FindLengthOfLinkedList fs = new FindLengthOfLinkedList();
        head = fs.push(head, 3);
        head =fs.push(head, 4);
        head = fs.push(head, 5);
        
        System.out.println(fs.getCount(head));
//      System.out.println(fs.getRecursive(head));
    }
    
    
    public int getCountRecursive(Node head)
    {
        if(head==null)
            return 0;
        return 1 + getCountRecursive(head.next);
    }
    

}
