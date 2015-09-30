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
public class ConvertABinaryTreeToMirrorTree {
    
    
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
    
    
    public void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    
    public void mirror(Node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            Node temp;
            mirror(root.left);
            mirror(root.right);
            
            temp= root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
    
    
    public static void main (String args[])
    {
        ConvertABinaryTreeToMirrorTree cs = new ConvertABinaryTreeToMirrorTree();
        Node root = cs.newNode(1);
        root.left = cs.newNode(2);
        root.right = cs.newNode(3);
        
        root.left.left = cs.newNode(4);
        root.left.right = cs.newNode(5);
        
        System.out.println("In Order traversal of the constructed tree is ");
        cs.inOrder(root);
        
        cs.mirror(root);
        
        System.out.println("In Order traversal of the mirror tree is ");
        cs.inOrder(root);
    }
    
}
