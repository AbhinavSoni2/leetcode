package practice;

public class BinaryAdd 
{
	private static String add(String a, String b) 
	{
		int alen = a.length();
		int blen = b.length();
		
		int carry = 0;
		String result = "";
		int i=0;
		
		while(i<alen||i<blen||carry!=0)
		{
			int x=0;
			if(i<alen && a.charAt(alen-1-i)=='1')
			{
				x = 1;
			}
			
			int y=0;
			if(i<blen && b.charAt(blen-1-i)=='1')
			{
				y = 1;
			}
			
			result = (x+y+carry)%2 +result;
			carry = (x+y+carry)/2;
			i++;
			//System.out.println(result);
					
		}
		System.out.println(result);
		return result;
		
	}

	public static void main(String[] args) 
	{
		String a = "11";
		String b = "1";
		
		add(a,b);
		//System.out.print(add(a,b));
	

	}

	
}
