package practice;

public class StringPalindrome 
{
	
	public static boolean palindrome(String s) 
	{
		String rev = "";
		String str = s.replaceAll("[^a-zA-Z0-9]+","");
		System.out.println("str chk1:-"+str);
		str = str.toLowerCase();
		System.out.println("str chk2:-"+str);
		
		boolean result = false;
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			 rev =rev+ str.charAt(i) ;	 
		}
		System.out.println("reverse :-"+rev);
		
		if(rev.equals(str)==true)
		{
			System.out.println("palindrome");
			 result = true;
			return result;
		}
		else
		{
			System.out.println("not palindrome");
			result = false;
			return result;
		}
		
	}

	public static void main(String[] args) 
	{
		String s = "0P";
		palindrome(s);
		

	}

	

}
