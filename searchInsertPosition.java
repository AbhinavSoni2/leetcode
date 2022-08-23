package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class searchInsertPosition 
{
	
	public static int searchInsertPos(int[] nums, int target) 
	{
		int n = nums.length;
		for (int i = 0; i < n; i++) 
		{
            if(nums[i]>=target)
            {
            	System.out.println(i);
            	return i;
            }
		}
		System.out.println(n);
		return n;
        
	}

	

	public static void main(String[] args) 
	{
		
		int []nums = {1,3,5,6};
		int target = 4;
		
		searchInsertPos(nums,target);
	}
}
