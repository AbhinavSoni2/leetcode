package practice;

import java.util.Scanner;

public class helloWorld 
{
	public static void math()
	{
		Scanner s = new Scanner(System.in);
		
		
		
		
		
		System.out.println("enter the values of both th variable:-");
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println("select from options:-");
		System.out.println("1-add,2-subtract,3-multiply,4-divide");
		int opt = s.nextInt();
		
		//int sum = a+b;
		//return a+b;
		if(opt==1)
		{
		System.out.print("Sum is :-");
		System.out.println(a + b);
		}
		
		else if(opt==2)
		{
		System.out.print("subtract is :-");
		System.out.println(a-b);
		}
		
		else if(opt==3)
		{
		System.out.println("multiply is :-"+ a * b);
		
		}
		else if(opt==4)
		{
			System.out.println("divide is :-"+ a /b);
		}
		else
		{
			System.out.println("invalid input");
		}
		//System.out.print("Sum is :-"+ a  b);
		
	}

	public static void main(String[] args) 
	{
		math();
		//System.out.println("hello world");
		
	}

}
