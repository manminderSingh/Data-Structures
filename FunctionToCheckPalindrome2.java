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

//This method is used to reverse the Linked List and find if it is Palindrome
public class FunctionToCheckPalindrome2 {
    
    private class Node
    {
        int data;
        Node next;
        
    }
    
    public boolean isPalindrome(Node head)
            {
                Node slow = head;
                Node fast = head;
                Node second_half;
                Node previousOfSlow = head;
                Node midNode = null;
                boolean res = true;
                
                
                if(head!=null&&head.next!=null)
                {
                    while(fast!=null&&fast.next!=null)
                    {
                        fast = fast.next.next;
                        previousOfSlow = slow;
                        slow = slow.next;
                    }
                    
                    if(fast!=null)
                    {
                        midNode = slow;
                        slow = slow.next;
                    }
                    
                    second_half = slow;
                    previousOfSlow.next = null;
                    reverse(second_half);
                    res = compareLists(head, second_half);
                    reverse(second_half);
                    if(midNode!=null)
                    {
                        previousOfSlow.next = midNode;
                        midNode.next = second_half;
                        
                    }
                    
                    else
                    {
                        previousOfSlow.next = second_half;
                    }
                }
                return res;
            }
    
    public void reverse(Node head)
    {
        Node previous = null;
        Node current = head;
        Node temp;
        
        while(current!=null)
        {
         temp = current.next;
         current.next = previous;
         previous = current;
         current = temp;
        }
        
        head = previous;
    }
    
    
    public boolean compareLists(Node head1, Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp1!=null&&temp2!=null)
        {
            if(temp1.data==temp2.data)
            {
                temp1 = temp1.next;
                temp2 = temp2.next;
                
            }
            else
                return false;
            
            
        }
        
        if(temp1==null&&temp2==null){
            return true;
        }
        
        return false;
    }
    
    public Node push (Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head= pNode;
        return head;
    }
    
    
    public void printList(Node head)
    {
        if(head!=null)
        {
            Node current = head;
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public static void main (String args[])
    {
        Node head = null;
        String s = "abacaba";
        char str []  = s.toCharArray();
        
        int i;
        FunctionToCheckPalindrome2 fs = new FunctionToCheckPalindrome2();
        boolean b = false;
        for(i=0;i<str.length;i++)
        {
            head =fs.push(head, str[i]);
            fs.printList(head);
            b = fs.isPalindrome(head);
        }
            if(b==true)
            {
                System.out.println("It's a palindrome");
            }
            else
            {
                System.out.println("It's not a palindrome");
            }
                   
        
    }
    
    
}
