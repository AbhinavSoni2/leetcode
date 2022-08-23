//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
//The relative order of the elements should be kept the same.

package practice;

public class RemoveDuplicates 
{
	static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty or contains a single element
        if (n == 0 || n == 1)
            return n;
 
        int[] temp = new int[n];
 
        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal to next element then store that current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
 
        // Store the last element as whether it is unique or repeated, it hasn't stored previously
        temp[j++] = arr[n - 1];
     // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
 
        return j;
    }
 
    public static void main(String[] args)
    {
    	System.out.println("enter the elements of array:-");
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
    	
        int n = arr.length;
        
        n = removeDuplicates(arr, n);
 
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
        
 