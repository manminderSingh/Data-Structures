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
public class LevelOrderTraversalSpiralForm {
    
    
    private class Node
    {
       int data;
       Node left;
       Node right;
       
    }
    
    
    public Node newNode (int data)
    {
        Node pNode = new Node();
        pNode.data  = data;
        pNode.left = null;
        pNode.right = null;
        return pNode;
    }
    
    public int height(Node root)
    {
        if(root==null)
            return 0;
        else
        {
          int lHeight = height(root.left);
          int rHeight = height(root.right);
          
          if(lHeight>rHeight)
          {
              return rHeight+1;
          }
          return lHeight+1;
        }
    }
    
    
    public void printSpiral (Node root)
    {
        int h = height(root);
        int i;
        
        int ltr = 0;
        for(i=1;i<=h;i++)
        {
            printGivenLevel(root, i, ltr);
        
        }
    }
    
    public void printGivenLevel(Node root, int level, int ltr)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.println(root.data);
        }
        
        else  if(level>1)
        {
            if(ltr==1)
            {
                printGivenLevel(root.left, level-1, ltr);
                printGivenLevel(root.right, level-1, ltr);
            }
            else
            {
                printGivenLevel(root.right, level-1, ltr);
                printGivenLevel(root.left, level-1, ltr);
            }
        }
        
        
    }
}
