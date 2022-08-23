package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger 
{
	public static int romanToInt(String s)
	{
		System.out.println(s);
		Map<Character , Integer>romanMap= new HashMap<>();
		
		romanMap.put('I',1);
		romanMap.put('V',5);
		romanMap.put('X',10);
		romanMap.put('L',50);
		romanMap.put('C',100);
		romanMap.put('D',500);
		romanMap.put('M',1000);
		
		int result = romanMap.get(s.charAt(s.length()-1));
		for(int i=s.length()-1;i>0;i--)
		{
			if(romanMap.get(s.charAt(i))<=romanMap.get(s.charAt(i-1)))
			{
				result = result + romanMap.get(s.charAt(i-1));
			}
			else
			{
				result = result - romanMap.get(s.charAt(i-1));
			}
		}
		
		System.out.println(result);
		return result;
		
	}

	public static void main(String[] args) 
	{
//		System.out.println("eenter the string");
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		String s= "MCMXCIV";
//System.out.println(s);
		
		romanToInt(s);
		
		//sc.close();
		

	}

}
