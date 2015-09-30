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

//The diameter of a tree is the longes path from one leaf ndoe to another. 
public class DiameterOfABinaryTree {
    
    
    private class Node
    {
        int data;
        Node left, right;
    }
    
    
    public Node newNode (int new_Data){
        Node pNode = new Node();
        pNode.data = new_Data;
        pNode.left = pNode.right = null;
        return pNode;
    }
}
