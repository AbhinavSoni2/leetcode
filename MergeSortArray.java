package practice;

public class MergeSortArray 
{
	static void merge(int[] a , int m , int[] b , int n)
    {
        int i = m - 1 , j = n - 1 , idx = m + n - 1;
        while(i >= 0 && j >= 0)
        {
            if(a[i] >= b[j])
            {
                a[idx] = a[i];
                i--;
            }
            else
            {
                a[idx] = b[j];
                j--;
            }
            idx--;
        }
        while(i >= 0)
            a[idx--] = a[i--];
        while(j >= 0)
            a[idx--] = b[j--];
        return;
    }
    public static void main(String args[])
    {
        int m = 3 , n = 3;
        int[] a = new int[m + n];
        
       // a(0,1,2) = {1,2,3};
        
         a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        int[] b = {2 , 6 , 7};
        merge(a , m , b , n);
        for(int i = 0 ; i < a.length ; i++)
            System.out.print(a[i] + " ");
    }
	
}

