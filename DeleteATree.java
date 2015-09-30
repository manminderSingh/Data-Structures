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
public class DeleteATree {
    
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
    
    
    public void deleteTree(Node root)
    {
        if(root==null)
        {
            return;
        }
        deleteTree(root.left);
        deleteTree(root.right);
        
        System.out.println(root.data);
    }
    
    public static void main (String args[])
    {
        DeleteATree ds = new DeleteATree();
        Node root = ds.newNode(1);
        root.left = ds.newNode(2);
        root.right = ds.newNode(3);
        root.left.left = ds.newNode(4);
        root.left.right = ds.newNode(5);
        
        
        ds.deleteTree(root);
        
        System.out.println("Tree Deleted");
        root= null;
        ds.deleteTree(root);
    }
    
}
