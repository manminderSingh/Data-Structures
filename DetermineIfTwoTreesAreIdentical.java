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
public class DetermineIfTwoTreesAreIdentical {
    
    private class Node
    {
        int data;
        Node left;
        Node right;
        
    }
    
    public Node newNode (int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.left =  null;
        pNode.right = null;
        return pNode;
    }
    
    
    public boolean isIdenticalTree(Node a, Node b)
    {
        if(a==null&&b==null)
        {
            return true;
        }
        
        if(a!=null&b!=null)
        {
            return (a.data==b.data&&isIdenticalTree(a.left, b.left)&&isIdenticalTree(a.right, b.right));
        }
        
        return false;
    }
    
    public static void main (String args [] )
    {
        DetermineIfTwoTreesAreIdentical ds = new DetermineIfTwoTreesAreIdentical();
        Node root1 = ds.newNode(1);
        Node root2 = ds.newNode(1);
        
        root1.left = ds.newNode(2);
        root1.right = ds.newNode(3);
        
        root1.left.left = ds.newNode(4);
        root1.left.right = ds.newNode(5);
        
        root2.left = ds.newNode(2);
        root2.right = ds.newNode(3);
        
        root2.left.left = ds.newNode(4);
        root2.left.right = ds.newNode(5);
        
        if(ds.isIdenticalTree(root1, root2))
        {
            System.out.println("Both tree are identical");
        }
        else
        {
            System.out.println("Both trees are not identical");
        }
    }
    
}
