package practice;

public class LongestCommonPrefix 
{
	public static String longestCommonPrefix(String[] strs) 
	{
		StringBuilder lcp = new StringBuilder();
		// Base condition
        if (strs == null || strs.length == 0) 
        {
        	//System.out.println(lcp.toString());
            //return lcp.toString();
            return "";
        }
        String pref = strs[0];
     // Find the minimum length string from the array
        int minimumLength = strs[0].length();
        System.out.println(strs[0].length());
        
		for(int i=0;i<strs.length-1;i++)
		{
			minimumLength = Math.min(minimumLength, strs[i].length());
		}
		// Loop for the minimum length
		
		for(int i=0;i<minimumLength;i++)
		{
			// Get the current character from first string
			char current = strs[0].charAt(i);
			// Check if this character is found in all other strings or not
			
			for (String str : strs) 
			{
				if(str.charAt(i)!=current)
				{
					System.out.println(lcp);
					 return lcp.toString();
				}
			}
			
			lcp.append(current);
			//System.out.println(lcp.toString());
		}
		//System.out.println(lcp.toString());
		return  lcp.toString();
		
	}
	

	public static void main(String[] args) 
	{
		String[] strs = {"a"};
		//String[] strs = {"flower","flow","flight"};
		longestCommonPrefix(strs);

	}

}
