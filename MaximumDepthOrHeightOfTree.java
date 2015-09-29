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
public class MaximumDepthOrHeightOfTree {
    
    
    private class Node
    {
        int data;
        Node left;
        Node right;
        
    }
    
    public int maxDepth(Node root)
    {
        if(root==null)
        {
           
            return 0;
        }
        else
        {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            
            if(lDepth>rDepth)
                return (lDepth+1);
            else
                return (rDepth+1);
        }
    }
    
    public Node newNode (int data)
    {
        Node pNode = new Node();
        pNode.data = data;
        pNode.left = null;
        pNode.right = null;
        return pNode;
    }
    
    public static void main (String args [])
    {
        MaximumDepthOrHeightOfTree ms = new MaximumDepthOrHeightOfTree();
        Node root= ms.newNode(1);
        root.left = ms.newNode(2);
        root.right = ms.newNode(3);
        root.right.left = ms.newNode(4);
        root.right.right = ms.newNode(5);
        
        System.out.println("Height of Tree is " + ms.maxDepth(root));
        
    }
    
    
    
    
}
