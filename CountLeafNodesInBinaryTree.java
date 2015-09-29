/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeGeek;

import apple.laf.JRSUIStateFactory;
import java.util.concurrent.CountDownLatch;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/**
 *
 * @author manmindersinghsodhi
 */
public class CountLeafNodesInBinaryTree {
    
    private class Node 
    {
        int data;
        Node left;
        Node right;
        
    }
    
    public int getLeafCount(Node root)
    {
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
        {
            return 1;
            
        }
        
        else
        {
            return getLeafCount(root.left) + 
             getLeafCount(root.right);
        }
    }
    
    public  Node newNode(int new_Data)
    {
        Node pNode=  new Node();
        pNode.data = new_Data;
        pNode.left = null;
        pNode.right = null;
        return pNode;
    }
    
    public static void main (String args [] )
    {
        CountLeafNodesInBinaryTree cs = new CountLeafNodesInBinaryTree();
        Node root = cs.newNode(1);
        root.left = cs.newNode(2);
        root.right = cs.newNode(3);
        root.left.left = cs.newNode(4);
        root.left.right = cs.newNode(5);
        
        System.out.println("Leaf count of the tree is " + cs.getLeafCount(root));
    }
}
