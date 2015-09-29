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
public class FunctionToCheckPalindrome3 {
    
    private class Node
    {
        int data;
        Node next;
        
    }
    
    public static void main (String args [] )
    {
    
    }
    
    
    public void printLists(Node head)
    {
        Node current = head;
        if(current!=null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public Node push (Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
        return head;
    }
    
    
    public boolean compareLists(Node head1, Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp1!=null&&temp2!=null)
        {
            if(temp1.data==temp2.data)
            {
                temp1= temp1.next;
                temp2  = temp2.next;
            }
            
            else
            {
                return false;
            }
        }
        
        if(temp1==null&&temp2==null)
        {
            return true;
        }
        
        return false;
    }
    
    public void reverse (Node head)
    {
        Node temp;
        Node previous = null;
        Node current =  head;
        while(current!=null)
        {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        
        head = previous;
            
    }
    
    public boolean isPalindrome(Node head)
    {
        Node slow = head;
        Node fast = head;
        Node midNode = null;
        Node previousOfSlow = head;
        Node secondHalf;
        
        boolean res = true;
        
        if(head!=null&&head.next!=null)
        {
            while(fast!=null&&fast.next!=null)
            {
                fast = fast.next.next;
                previousOfSlow  =slow;
                slow = slow.next;
            }
            
            if(fast!=null)
            {
                midNode = slow;
                slow = slow.next;
            }
            
         
                
            
            secondHalf = slow;
            previousOfSlow.next = null;
            reverse(secondHalf);
            res = compareLists(head, secondHalf);
            reverse(secondHalf);
            
            
            if(midNode!=null)
            {
                previousOfSlow.next = midNode;
                midNode.next = secondHalf;
            }
            
            else
            {
                previousOfSlow.next = secondHalf;
            }
            
        }
        return res;
    }
    
}
