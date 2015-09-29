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


//1. Using dummy Node
//2. Using Recursion
//3. Using Local references

//This is by Using Recursion

public class MergeTwoSortedLinkedList {
    
    
    private class Node
    {
        int data;
        Node next;
        
    }
    
    
    public void push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
        
    }
    
    
    public void printLists(Node head)
    {
        Node current = head;
        while(current!=null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    
//    public void moveNode(Node destNode, Node sourceNode)
//    {
//        Node pNode = sourceNode;
//        assert(pNode!=null);
//        
//        sourceNode = pNode.next;
//        pNode.next = destNode;
//        destNode = pNode;
//        
//        
//    }
//    
    
    
    //a |2|3|5|7|9|    b |1|4|6|8|10|
    //result |1|2|3|4|5|6|7|8|9|10|
    
    public Node sortedMerge(Node a, Node b)
    {
        Node result = null;
        if(a==null)
            return b;
        else
            if(b==null)
                return a;
        
        if(a.data<=b.data)
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else
        {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        
        return result;
    }
    
    
    
    
}
