package practice;

import java.util.Arrays;

public class plusOne 
{
	public static int[] plus(int[] digits) 
	{
		int n = digits.length;
		
		for(int i=n-1;i>=0;i--)
		{
			if(digits[i] < 9) 
			{
	            digits[i]= digits[i]+1; 
	            
	            for(int k=0;k<=n-1;k++)
	    		{
	            System.out.print(digits[k]);
	    		}
	            return digits;
	        }
			
			digits[i] = 0;
			
		}
		int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    //System.out.println(newNumber);
	    return newNumber;
		
	}

	public static void main(String[] args) 
	{
		int[] digits = {4,9,2,9};
		int[]ans=plus(digits);
		
		System.out.println(Arrays.toString(ans));
	} 
}
