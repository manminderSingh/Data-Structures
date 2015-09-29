/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeGeek;

/**
 *
 * @author manmindersinghsodhi
 * 
 */


  class Node
    {
        int data;
        Node left;
        Node right;
        
        
        public Node(int data)
        {
            this.data = data;
            left = null;
            right  = null;
        }
    }
public class GreatTreeListRecursion {
    
   
    
    
    public static void join(Node a, Node b)
    {
        a.right = b;
        b.left = a;
    }
    
    
    public static Node append (Node a, Node b)
    {
        if(a==null)
            return b;
        if(b==null)
            return a;
        
        Node aLast = a.left;
        Node bLast = b.left;
        
        join(aLast,b);
        join(bLast, a);
        return a;
    }
   
    public static Node treeToList(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node aList = treeToList(root.left);
        Node bList = treeToList(root.right);
        
        root.left = root;
        root.right = root;
        
        
        aList = append(aList, root);
        aList = append(aList, bList);
        
        return aList;
    }
    
    
    public static void treeInsert(Node root, int new_data)
    {
        if(new_data<=root.data)
        {
            if(root.left!=null)
                treeInsert(root.left, new_data);
            else 
                root.left = new Node(new_data);
        }
        
        else
        {
            if(root.right!=null)
                treeInsert(root.right, new_data);
            else
                root.right = new Node(new_data);
        }
    }
    
    
    public static void printTree(Node root)
    {
        if(root==null)
        {
            return;
        }
        
        printTree(root.left);
        System.out.println(Integer.toString(root.data)+ " ");
        printTree(root.right);
    }
    
    
    public static void printList(Node head)
    {
        if(head==null)
        {
            return;
            
        }
        
        else
        {
            Node current = head;
            while(current!=null)
            {
                System.out.println(Integer.toString(current.data)+ " ");
                current = current.right;
                if(current==head)
                    break;
            }
            System.out.println(" ");
        }
    }
    
    public static void main (String args[])
    {
        Node root = new Node(4);
        treeInsert(root, 2);
        treeInsert(root, 1);
        treeInsert(root, 3);
        treeInsert(root, 5);
        
        System.out.println("Tree: ");
        printTree(root);
        System.out.println("");
        
        
        System.out.println("List: ");
        
        Node head = treeToList(root);
        printList(head);
        
    }
    
}
