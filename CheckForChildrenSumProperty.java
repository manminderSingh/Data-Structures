/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeGeek;

import javax.swing.text.StyleConstants;

/**
 *
 * @author manmindersinghsodhi
 */
public class CheckForChildrenSumProperty {
    
    private class Node
    {
        int data;
        Node left, right;
        
    }
    
    public Node newNode (int new_Data)
    {
        Node pNode = new Node();
        pNode.data = new_Data;
        pNode.left = pNode.right = null;
        return pNode;
    }
    
    
    public boolean isSumProperty(Node root)
    {
        int left_Data = 0;
        int right_Data = 0;
        
        if(root==null||root.left==null||root.right==null)
        {
            return true;
        }
        else
        {
            if(root.left!=null)
            {
                left_Data = root.left.data;
            }
            
            if(root.right!=null)
            {
                right_Data = root.right.data;
            }
            
            if((root.data==left_Data+right_Data)&&isSumProperty(root.left)&&isSumProperty(root.right))
            {
                return true;
            }
            return false;
        }
    }
    
    public static void main (String args[])
    {
        CheckForChildrenSumProperty cs = new CheckForChildrenSumProperty();
        Node root = cs.newNode(10);
        root.left = cs.newNode(8);
        root.right = cs.newNode(2);
        
        root.left.left = cs.newNode(3);
        root.left.right = cs.newNode(5);
        
        root.right.right = cs.newNode(2);
        
        if(cs.isSumProperty(root))
        {
            System.out.println("The tree satisfies the child parent sum");
        }
        else
        {
            System.out.println("Tree does not satisfy child parent relation");
        }
    }
    
}
