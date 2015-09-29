/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeGeek;

/**
 *
 * @author manmindersinghsodhi
 */
public class TreeTraversals {
    
    private class Node
    {
        int data;
        Node left, right;
    }
    
    public void newNode (int data)
    {
        Node pNode = new Node();
        pNode.data = data;
        pNode.left = null;
        pNode.right = null;
    }
    
    
    public void printPostOrder(Node root)
    {
        if(root==null)
        {
            System.out.println("There is nothing to print");
            return;
        }
        else
        {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.println(root.data);
        }
        
        
    }
    
    
    public void printPreOrder(Node root)
    {
        if(root==null)
        {
            System.out.println("There is nothing to print");
            return;
        }
        
        else
        {
            System.out.println(root.data);
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }
    
    
    public void printInOrder(Node root)
    {
        if(root==null)
        {
            System.out.println("There is nothing to print");
        }
        
        else
        {
            printInOrder(root.left);
            System.out.println("");
            printInOrder(root.right);
        }
    }
    
    public static void main (String args [])
    {
        
    }
    
}
