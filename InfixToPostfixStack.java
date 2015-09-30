/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackGeek;


import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author manmindersinghsodhi
 */
public class InfixToPostfixStack {
   
    int stackSize = 50;
    
    
    private boolean isOperator (char c)
    {
        return c == '+' || c =='-' || c == '*' ||c == '/' || c == '^' ||c == '(' || c ==')' ;
    }
    
    private boolean isSpace(char c)
    {
        return (c==' ');
    }
    
    private boolean lowerPrecedence(char op1, char op2)
    {
        switch(op1)
        {
            case '+':
            case '-':
                return !(op2=='+' || op2=='-');
                
            case '*':
            case '/':
            return op2=='^' || op2=='(';

            case '^':
            return op2=='(';

            case '(': return true;

            default:  // (shouldn't happen)
            return false;
                        
        }
    }
    
    public String convertToPostFix (String infix)
    {
        Stack operStack = new Stack();
        char c;
        StringTokenizer parser = new StringTokenizer(infix, "+-*/^() ", true);
        
        StringBuffer postfix = new StringBuffer(infix.length());
        
        while(parser.hasMoreTokens())
        {
            String token = parser.nextToken();
            c = token.charAt(0);
            if((token.length()==1) && isOperator(c))
            {
                while(!operStack.empty()&& !lowerPrecedence(((String)operStack.peek()).charAt(0), c))
                    postfix.append(" ").append((String)operStack.pop());
                
                if(c==')')
                {
                    String operator = (String) operStack.pop();
                    while(operator.charAt(0)!='(')
                    {
                        postfix.append(" ").append(operator);
                        operator = (String) operStack.pop();
                                
                    }
                 }
                else
                    operStack.push(token);
            }
                else if((token.length()==1)&&isSpace(c))
                {
                    ;
                }
            else
                {
                  postfix.append(" ").append(token);
                }
                
                    
            
        }
        while(!operStack.empty())
            postfix.append(" ").append((String)operStack.pop());
        
        return postfix.toString();
    }
    
    
    private class stack
    {
        int top;
        char items[] = new char [stackSize]; 
    }
    
    
   public static void main (String [] args)
   {
        String[] testString = {"2 + 3 * 4 / 5", 
                          "2*3 - 4 + 5 / 6",
                          " 35 - 42* 17 /2 + 10",
                          " 33.2 - 17.5 * 2.0 ^ 3.2",
                          "3 * (4 + 5)",
                          "3 * ( 4 - (5+2))/(2+3)"};

   InfixToPostfixStack converter = new InfixToPostfixStack();

   System.out.println("\nTest for convertToPostfix:\n");

   for (int i=0; i<testString.length; i++) {
      System.out.println("infix: " + testString[i]);
      System.out.println("postfix: " + converter.convertToPostFix(testString[i]));
      System.out.println();
   }
      
   }
   
   
   
   
   
   public boolean isOperand(char c)
   {
        return c>='A'&&c<='Z'||c>='a'&&c<='z'||c>='0'&&c<='9';
   }
    
    
    
}
