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
public class UnionOfTwoSortedLinkedLists {
    
    private class Node 
    {
        int data;
        Node next;
        
    }
    int count = 0;
//    Node temp  = new Node();
//    Node r ;
//    
//    
    public Node sortedUnion(Node a, Node b)
    {
        Node temp = null;
             if(a==null||b==null)
                return null;
            if(a.data<=b.data)
            {
            temp = a;
            temp.next = sortedUnion(a.next, b);
            }
            if(a.data>=b.data)
            {
            temp = b;
            temp.next = sortedUnion(a, b.next);
            }
        
        
        return temp;
        
    }
    
    
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
    
    
    public Node getSortedUnion(Node head1, Node head2)
    {
        Node result = null;
        
        Node t1= head1;
        Node t2 = head2;
        
        while(t1!=null&&t2!=null)
        {
            if(t1==null)
                return t2;
            
            else if(t2==null)
                return t1;
            
            if(t1.data<=t2.data)
            {
                result = push(result, t1.data);
                t1 = t1.next;
            }
            else if(t1.data>t2.data)
            {
                result = push(result, t2.data);
                t2 = t2.next;
            }
            
                
        }
        
        
        
        return result;
    }
    
    
    public Node getUnion(Node head1, Node head2)
    {
        Node result = null;
        
        Node t1 = head1;
        Node t2 = head2;
        
        while(t1!=null)
        {
            result = push(result, t1.data);
            t1=t1.next;
        }
        
        while(t2!=null)
        {
            result =push(result, t2.data);
            t2 = t2.next;
        }
        return result;
    }
    
    
    public Node push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
        return pNode;
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
    
    public static void main (String args[])
    {
        Node a = null;
        Node b = null;
        Node union = null, unionSorted = null;
        
        UnionOfTwoSortedLinkedLists us = new UnionOfTwoSortedLinkedLists();
        a = us.push(a, 9);
        a = us.push(a, 7);
        a = us.push(a, 5);
        a = us.push(a, 3);
        a = us.push(a, 1);
        
        b = us.push(b, 10);
        b = us.push(b, 8);
        b = us.push(b, 6);
        b = us.push(b, 4);
        b = us.push(b, 2);
        
        
        System.out.println("List 1");
        us.printLists(a);
        System.out.println("");
        System.out.println("List 2");
        us.printLists(b);
        System.out.println("");
        union = us.sortedMerge(a, b);
        System.out.println("Final List");
        us.printLists(union);
        System.out.println("");
//        System.out.println("Sorted Final List");
//         unionSorted = us.sortedMerge(a, b);
//         us.printLists(unionSorted);
    }
    
    
    
}
