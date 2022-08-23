package practice;

import java.util.Stack;

public class ValidParentheses2 
{
	public static boolean isValid(String s)
	{
		Stack<Character>bracket = new Stack<>();
		for(char c: s.toCharArray())
		{
			switch(c)
			{
			case '(' :bracket.push(c);break;
			case '{' :bracket.push(c);break;
			case '[' :bracket.push(c);break;
			
			case ')' :if (bracket.empty() || bracket.peek()!='(') return false; else bracket.pop(); break;
			case '}' :if (bracket.empty() || bracket.peek()!='{') return false; else bracket.pop(); break;
			case ']' :if (bracket.empty() || bracket.peek()!='[') return false; else bracket.pop(); break;
			
			default:;
			
			}
		}
		return bracket.isEmpty();
		
	}

	public static void main(String[] args) 
	{
		String s = "{}()[]";
		boolean check = isValid(s);
		
		if(check)
		{
			//System.out.println("the string contains valid parentheses");
			System.out.println(true);
		}
		else
		{
			//System.out.println("the string contains invalid parentheses");
			System.out.println(false);
		}

	}

}
