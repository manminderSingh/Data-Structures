/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListGeek;

import java.util.Stack;

/**
 *
 * @author manmindersinghsodhi
 */
public class FunctionToCheckPalindrome {
    
    int count = 0;
    int top = -1;
    private class Node 
    {
        int data;
        Node next;
        
    }
    
    public Node push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
        count++;
        return head;
    }
    
    int arr[] = new int [6];
    
    public void pushArr(int data)
    {
        arr[++top] = data;
    }
    
    public int pop()
    {
        int a  = arr[top];
        top--;
        return a;
    }
    
    public void CheckPalindrome(Node head)
    {
       
        Node current  = head;
        Node temp=  head;
        while(current!=null)
        {
            pushArr(current.data);
            current = current.next;
        }
        
        int po ;
        po = pop();
        while(head!=null)
        {
           
        if(po==head.data)
        {
            head = head.next;
            System.out.println("It's a palindrome");
            break;
        }
        else
        {
            head= head.next;
            System.out.println("It's not a palindrome");
            break;
        }
         
        }
        
         
    }
    
    
    public static void main (String args[])
    {
        Node head = null;
        FunctionToCheckPalindrome fs = new FunctionToCheckPalindrome();
        head = fs.push(head, 1);
        head = fs.push(head, 2);
        head =fs.push(head, 3);
          head =fs.push(head, 2);
           head = fs.push(head, 2);
            
            System.out.println("Check Palindrome");
            
            fs.CheckPalindrome(head);
        
    }
    
}
