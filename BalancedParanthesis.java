/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackGeek;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author manmindersinghsodhi
 */
public class BalancedParanthesis {
    
   public static void main (String args[])
   {
       Stack s = new Stack();
       String original = "";
       
       System.out.println("Please enter the String to be used");
       Scanner read=  new Scanner(System.in);
       
       original = read.nextLine();
       
       for(int i=0;i<original.length();i++)
       {
           if(original.charAt(i)=='(' || original.charAt(i)=='[' || original.charAt(i)== '{')
           {
               s.push(original.charAt(i));
           }
       }
       
       for(int i=0;i<original.length();i++)
       {
           if(original.charAt(i)==')' || original.charAt(i) == ']' || original.charAt(i) == '}')
           {
               System.out.println(s.pop());
           }
       }
       
       
       if(s.isEmpty())
       {
           System.out.println("Paranthesis and brackets are balanced");
       }
       else
       {
           System.out.println("Parathesis and brackets are not balanced");
       }
   }
}
