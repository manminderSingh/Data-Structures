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
public class InsertionSortLinkedList {
    
    
    private class Node
    {
        int data;
        Node next;
    }
    
    public Node push(Node head, int new_Data)
    {
        Node pNode = new Node();
        pNode.data = new_Data;
        pNode.next = head;
        head = pNode;
        return pNode;
    }
    
    
    public void printLists(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    
    public void insertionSort(Node head)
    {
        Node sorted  = null;
        
        Node current = head;
        
        while(current!=null)
        {
            Node second = current.next;
            
            sortedInsert(sorted, current);
            
            current = second;
        }
        
        head = sorted;
    }
    
    
    public void sortedInsert(Node head, Node newNode)
    {
        Node current;
        if(head==null||head.data>=newNode.data)
        {
            newNode.next = head;
            head = newNode;
        }
        
        else
        {
            current = head;
            while(current.next!=null&&current.next.data<newNode.data)
            {
                current = current.next;
            }
            
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    public static void main (String args[])
    {
        Node a = null;
        InsertionSortLinkedList is = new InsertionSortLinkedList();
        
        a = is.push(a, 5);
        a = is.push(a, 20);
        a = is.push(a, 4);
        a = is.push(a, 3);
        a = is.push(a, 30);
        
        
        System.out.println("Linked List Before Sorting");
        is.printLists(a);
        
        is.insertionSort(a);
        
        System.out.println("Linked List after Sorting");
        is.printLists(a);
        
        
    }
    
}
