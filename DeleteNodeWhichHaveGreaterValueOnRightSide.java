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

//Use Recursive Method
public class DeleteNodeWhichHaveGreaterValueOnRightSide {
    
    
    private class Node
    {
        int data;
        Node next;
    }
    
    public void push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next  = head;
        head =  pNode;
    }
    
    
    public void reverseList(Node head)
    {
        Node current = head;
        Node previous =  null;
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
    
    public void printLists(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    
    public void delLesserNodes(Node head)
    {
        reverseList(head);
        _delLesserNodes(head);
        reverseList(head);
    }
    //12->15->10->11->5->6->2->3
    //12<-15<-10<-11<-5<-6<-2<-3
    
    public void _delLesserNodes(Node head)
    {
        Node current = head;
        Node maxNode = head;
        Node temp;
        
        while(current!=null&&current.next!=null)
        {
            if(current.next.data<maxNode.data)
            {
                temp = current.next;
                current.next = temp.next;
                
            }
            else
            {
                current = current.next;
                maxNode = current;
            }
        }
    }
}
