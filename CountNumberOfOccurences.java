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
public class CountNumberOfOccurences {
    
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
    
    public int count(Node head, int search_for)
    {
        Node current  = head;
        int count  = 0;
        while(current!=null)
        {
            if(current.data==search_for)
            {
                count++;
                
            }
            current = current.next;
        }
        return count;
    }
    
    public static void main (String args[])
    {
        Node head = null;
        
        CountNumberOfOccurences cs = new CountNumberOfOccurences();
        head =cs.push(head, 1);
        head =cs.push(head, 2);
        head =cs.push(head, 4);
        head =cs.push(head, 4);
        head =cs.push(head, 5);
        
        
        System.out.println("Count of 4 is " + cs.count(head, 4));
    }
    
    
    public int countNumberOfOccurences(Node head, int number){
        
        Node current = head;
        int count = 0;
        
        while(current!=null)
        {
           if(number==current.data)
               count++;
         
           current = current.next;
        }
        return count;
    }
    
}
