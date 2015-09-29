/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeGeek;

import static TreeGeek.LevelOrderTreeTraversal.new_Node;

/**
 *
 * @author manmindersinghsodhi
 */
public class LevelOrderTreeTraversal {
    
  public static void printGivenLevel(NodeTree root, int level)
  {
    
      if(root==null)
              {
                  return;
                  
              }
      
      if(level==1)
      {
          System.out.println(root.data);
         
      }
      else if(level>1)
      {
          printGivenLevel(root.left, level-1);
          printGivenLevel(root.right, level-1);
      }
  }
  
  
  public static int height ( NodeTree root)
  {
      if(root==null)
      {
          return 0;
      }
      
      else
      {
          int lHeight = height(root.left);
          int rHeight = height(root.right);
          
          
          if(lHeight>rHeight)
          {
              return lHeight+1;
              
          }
          else
          {
              return rHeight+1;
          }
      }
  }
    
  
  public static NodeTree new_Node(int data)
  {
      NodeTree pNode = new NodeTree();
      pNode.data = data;
      pNode.left = null;
      pNode.right = null;
      
      return pNode;
      
  }
  
  
  public static void main (String args[])
  {
      NodeTree root = new_Node(1);
      root.left = new_Node(2);
      root.right = new_Node(3);
      root.left.left = new_Node(4);
      root.left.right = new_Node(5);
      
      System.out.println("Level Order Traversal of Binary tree is");
      
      printLevelOrder(root);
      
      
  }
  
  
  public static void printLevelOrder (NodeTree root)
  {
      int h = height(root);
      int i;
      for(i=1;i<=h;i++)
      {
          printGivenLevel(root, i);
      }
      
  }
  
  
}
