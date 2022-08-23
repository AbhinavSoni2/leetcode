package practice;

import java.util.Scanner;

public class palindromeNum 
{
	//palindromeNum

	public static void main(String[] args) 
	{
		int r,sum=0,temp;  
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		temp=n;
    	
    	while(n>0)
    	{
    		 r = n%10;
    		 sum = (sum*10)+r;
    		 n=n/10;
    		  
    	}
    	System.out.println("reverse of number is:-"+sum);
    	//System.out.println("number is:-"+n);
    	
   
		if(temp==sum)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		//palin(n,sum);
		
    }
		
		
		
		
		
	}

	


