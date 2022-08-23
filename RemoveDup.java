package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDup 
{
		
		public static int removeDuplicates(int[] nums, int n) 
		{
	        
	        int count = 0;
	        
	        for (int i = 0; i < nums.length; i++) 
	        {
	            if (i < nums.length - 1 && nums[i] == nums[i + 1]) 
	            {
	                continue;
	            }
	            
	            nums[count] = nums[i];
	            count++;
	        }
	        System.out.println(count);
	        return count;
	    
	}
		
	public static void main(String[] args) 
	{
		
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;
 
        n = removeDuplicates(arr, n);
 
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
		
		
	}
}
