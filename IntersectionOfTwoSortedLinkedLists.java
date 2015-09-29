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

//This can be done in three ways
//1. Using Dummy Node
//2. Using Local references.
//3. Using Recursion
public class IntersectionOfTwoSortedLinkedLists {
    
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
    
    
//    public Node sortedIntersect(Node a, Node b)
//    {
//        Node c1 = a;
//        Node c2 = b;
//        Node temp = null;
//        temp.next = null;
//        
//        while(c1!=null&&c2!=null){
//            if(c1.data==c2.data)
//            {
//                push(temp, c1.data);
//                temp = temp.next;
//                c1 = c1.next;
//                c2 = c2.next;
//            }
//            else if(a.data<b.data)
//            {
//                a = a.next;
//            }
//            else
//            {
//                b = b.next;
//            }
//        }
//        return temp;
//    }
    
    public Node NodeIntersect ( Node a, Node b)
    {
        if(a==null||b==null)
        {
            return null;
        }
        
        if(a.data<b.data)
        {
            return NodeIntersect(a.next, b);
        }
        
        if(a.data>b.data)
        {
            return NodeIntersect(a, b.next);
        }
        
        Node temp  = new Node();
        temp.data = a.data;
        
        temp.next = NodeIntersect(a.next, b.next);
        return temp;
    }
    
    public static void main (String args[])
    {
        Node a = null;
        Node b = null;
        Node intersect = null;
        
        
        IntersectionOfTwoSortedLinkedLists is = new IntersectionOfTwoSortedLinkedLists();
        
        a = is.push(a, 6);
        a = is.push(a, 5);
        a = is.push(a, 4);
        a = is.push(a, 3);
        a = is.push(a, 2);
        a = is.push(a, 1);
        
        
        b = is.push(b,8);
        b = is.push(b,6);
        b = is.push(b,4);
        b = is.push(b,2);
        
        
        System.out.println("List 1");
        is.printLists(a);
        System.out.println("");
        System.out.println("List 2");
        is.printLists(b);
        
        System.out.println("");
        System.out.println("Final List");
//        intersect = is.sortedIntersect(a, b);
        intersect = is.NodeIntersect(a, b);
        is.printLists(intersect);
    }
}
