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

/*
Deleting a Node
*/
public class DeletingANode {
    
    
   
    
    private static class Node
    {
        int data;
        Node next;
    }
    
    
    public void push(Node head, int data)
    {
        Node pNode = new Node();
        pNode.data = data;
        pNode.next = head;
        head= pNode;
        
    }
    
    public void deleteNode(Node head, int key)
    {
        Node p = head;
        Node previous = null;
        int a;
        
        if(p!=null&&p.data==key)
        {
            a = head.data;
            head = head.next;
        }
        else
        {
            while(p!=null)
            {
                previous = p;
                if(p.data==key)
                    break;
                p=p.next;
            }
            
            if(p==null)
            {
                System.out.println("Did not find the entry");
            }
            else
            {
                previous.next = p.next;
            }
        }
    }
    
    public void printList(Node node)
    {
        while(node!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    
    
    
    public static void main (String [] args)
    {
        
      
        Node head = null;
        
        DeletingANode ds = new DeletingANode();
        ds.push(head, 7);
        ds.push(head, 1);
        ds.push(head, 3);
        ds.push(head, 2);
        
        
        System.out.println("Created Linked List");
        ds.printList(head);
        
        ds.deleteNode(head, 1);
        System.out.println("Linked List after Deletion");
        ds.printList(head);
    }
    
    
}
