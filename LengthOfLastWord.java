package practice;

public class LengthOfLastWord 
{
	public static int Length(String s) 
	{
		if(s.length()==0 ||s==null)
		{
			System.out.println(0);
			return 0;
		}
		
		int result =0;
		int len = s.length();
		
		boolean flag = false;
		for(int i =len-1; i>=0;i--)
		{
			char c = s.charAt(i);
			if((c>='a' && c<='z')||(c>='A' && c<'z'))
			{
				flag = true;
				result= result +1;
			}
			else
			{
				if(flag)
				{
					System.out.println(result);
	                return result;
				}
			}
				
		}
		System.out.println(result);
	return result;
	}
		
	

	public static void main(String[] args) 
	{
		String s = "hellow world";
		Length(s);

	}

	

}
