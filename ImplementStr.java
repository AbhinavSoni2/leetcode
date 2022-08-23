package practice;
//Input: haystack = "hello", needle = "ll"
//Output: 2

public class ImplementStr 
{
	public static int strStr(String haystack, String needle) 
	{
		if (haystack == null || needle == null) 
		{
			//System.out.println(-1);
            return -1;
        }
		if (haystack.equals(needle)) 
		{
			//System.out.println(0);
            return 0;
        }
		int needleLength = needle.length();
        for (int i = 0; i < haystack.length() - needleLength + 1; i++)
        {
           
            if (haystack.substring(i, i + needleLength).equals(needle)) 
            {
            	//System.out.println(i);
                return i;
            }
        }
        //System.out.println(-1);
        return -1;
    }

		

        
    
	public static void main(String[] args) 
	{
		String haystack = "Hello";
		String needle = "ll";
		strStr( haystack,  needle);
	}

}
