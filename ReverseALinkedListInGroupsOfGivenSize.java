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
public class ReverseALinkedListInGroupsOfGivenSize {
    
    private class Node
    {
        Node next;
        int data;
    }
    
    public Node reverse(Node head, int k)
            {
                Node current = head;
                Node next= null;
                Node previous  = null;
                int count = 0;
                
                
                while(current!=null&&count<k)
                {
                    next = current.next;
                    current.next = previous;
                    previous = current;
                    current = next;
                    count++;
                    
                }
                   if(next!=null)
                   {
                       head.next = reverse(next, k);
                   }
                   
                   return previous;
            }
    
    
    public void push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
        
    }
    
    public void printLists(Node node)
    {
        while(node!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    
    
    public static void main (String args[])
    {
       
    }
    
}
