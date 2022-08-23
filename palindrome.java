package practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		
		String num = s.next();
		String numNew = "";
		
		for(int i = num.length()-1;i>=0;i--)
		{
			numNew = numNew + num.charAt(i);
		}
		System.out.println(numNew);
		if(numNew.equals(num) )
		{
			System.out.println("true");
		}
		//String num = n.toString();
		
		

	}

}
