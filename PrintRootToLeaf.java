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
public class PrintRootToLeaf {
    
    private class Node
    {
        int data;
        Node left;
        Node right;
    }
    
    
    public Node newNode(int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.left = null;
        pNode.right = null;
        return pNode;
    }
    
    public void printArray(int ints[], int length)
    {
        int i;
        for(i=0;i<length;i++)
        {
            System.out.println(ints[i]);
        }
        System.out.println("");
    }
    
    public void printPaths(Node root)
    {
        int path[] = new int[1000];
        printPathRecurs(root, path, 0);
    }
    
    
    public void printPathRecurs(Node root, int path[], int pathLen)
    {
        if(root==null)
        {
            return;
        }
        
        path[pathLen] = root.data;
        pathLen++;
        
        if(root.left==null&&root.right==null)
        {
            printArray(path, pathLen);
        }
        
        else
        {
            printPathRecurs(root.left, path, pathLen);
            printPathRecurs(root.right, path, pathLen);
        }
        
        
    }
    
    
    public static void main (String args[])
    {
       PrintRootToLeaf ps = new PrintRootToLeaf();
       Node root = ps.newNode(1);
       root.left = ps.newNode(2);
       root.right= ps.newNode(3);
       
       root.left.left = ps.newNode(4);
       root.left.right = ps.newNode(5);
       
       ps.printPaths(root);
    }
    
}
