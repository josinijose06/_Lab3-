package com.gl.brackets;

import java.util.Stack;

public class BalancingBrackets {

	static boolean checkingBracketsBalanced(String strBalanceBrackets) {
		Stack<Character> stack = new Stack <Character>();
		
		
		for( int i=0;i<strBalanceBrackets.length();i++) {
			char character = strBalanceBrackets.charAt(i);
			if(character=='{' || character=='[' || character=='(') {
				stack.push(character);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char c;
			switch(character) {
			
			case'}':
				c= stack.pop();
			if(c== '('  || c== '[') 
				return false;
				break;
				case ')':
					c=stack.pop();
				if( c=='{'|| c=='[') 
					return false;
					break;
				case']':
						c=stack.pop();
					if( c=='('|| c=='{') 
						return false;
						break;
				}
				
			
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String strBracketExpression=" [[{}]]";
		//String strBracketExpression2="([[{}]]))";
				Boolean result;
				//Boolean result2;
		result=checkingBracketsBalanced(strBracketExpression);
		//result2=checkingBracketsBalanced(strBracketExpression);
		
		if(result)
			System.out.println("Entered bracket are balanced");
		else
			System.out.println("Enetered bracket are not balanced");
		
		/*
		 * if(result2) System.out.println("Entered bracket are balanced"); else
		 * System.out.println("Enetered bracket are not balanced");
		 */
	}
}
