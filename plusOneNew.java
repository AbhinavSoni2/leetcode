package practice;

import java.util.Arrays;

public class plusOneNew 
{
	public static int[] plusOne(int[] digits) 
	{
	    int n = digits.length;
	    for (int i = n - 1; i >=0; i--) 
	    {
	        if (digits[i] != 9) 
	        {
	            digits[i]++;
	            return digits;
	            //break;
	        } 
	        else 
	        {
	            digits[i] = 0;
	        }
	    }
	    if (digits[0] == 0) 
	    {
	        int[] res = new int[n+1];
	        res[0] = 1;
	        return res;
	    }
	    return digits;
	}
	
	
	
	

	public static void main(String[] args) 
	{
		int[] digits = {4,9,2,9};
		int[]ans=plusOne(digits);
		
		System.out.println(Arrays.toString(ans));

	}

}
