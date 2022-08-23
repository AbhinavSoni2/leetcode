package practice;

public class binaryAddRevise 
{
	
	
	private static String add(String a, String b) 
	{
		
		int alen = a.length();
		int blen= b.length();
		
		int carry =0;
		int i =0;
		
		String result ="";
		
		while(i<alen||i<blen||carry!=0)
		{
			int x =0;
			if(i<alen && a.charAt(alen-1-i)=='1')
			{
				x = 1;
			}
			
			int y =0;
			if(i<blen && b.charAt(blen-1-i)=='1')
			{
				y = 1;
			}
			
			
			result = (x+y+carry)%2 + result;
			carry = (x+y+carry)/2;
			i++;
		}
		System.out.println(result);
		return result;
		
		
	}

	public static void main(String[] args) 
	{
		String a = "1010";
		String b = "1011";
		add(a,b);

	}

	

}
