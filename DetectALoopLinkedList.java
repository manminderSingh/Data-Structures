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
public class DetectALoopLinkedList {
    
    
    //Floyd Cycle - Finding Algorithm
    
    private class Node 
    {
        int data;
        Node next;
    }
    
    public Node push (Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
        return head;
        
    }
    
    public int detectLoop (Node list)
    {
        Node slow = list;
        Node fast = list;
        while(slow.next!=null&&fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                System.out.println("Found Loop");
                return 1;
            }
        }
        return 0;
    }
    
    
    public static void main (String args [])
    {
        Node head = null;
        DetectALoopLinkedList ds = new DetectALoopLinkedList();
        ds.push(head, 1);
        ds.push(head, 2);
        ds.push(head, 3);
        ds.push(head, 4);
        
        head.next.next.next.next =head;
        ds.detectLoop(head);
        
    }
    
    public void detectALoop(Node head)
            
    {
        Node current = head;
        Node slow = head;
        Node fast= head;
        while(slow.next!=null&&fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast)
            {
                System.out.println("Found loop");
                break;
            }
        }
    }
    
}
