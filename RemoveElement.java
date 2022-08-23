package practice;

public class RemoveElement 
{
	public static int removeDuplicates(int[] nums,  int del) 
	{  
        int count = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            //if (i < nums.length - 1 && nums[i] == nums[i + 1]) 
        	if (i < nums.length  && nums[i] == del) 
            {
                continue;
            }
            
            nums[count] = nums[i];
            count++;
        }
        //System.out.println(count);
        return count;
    
}

	public static void main(String[] args) 
	{
		int arr[] = { 3,2,2,3 };
        int n = arr.length;
        System.out.println("arr length value is :-"+n);
        int del = 3;
 
        n = removeDuplicates(arr,  del);
 
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

	}

}





		
		
	
