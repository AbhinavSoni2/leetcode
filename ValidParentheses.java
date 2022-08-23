package practice;

public class ValidParentheses 
{
	public static boolean Parentheses(String str)
	{
		//System.out.println(str);
		
		String nb1="(";
		String nb2=")";
		String nb3="{";
		String nb4="}";
		String nb5="[";
		String nb6="]";
		
		String nb7=nb1+nb2 +nb3+nb4 +nb5+nb6;  //(){}[]
		String nb8=nb1+nb2 +nb5+nb6 +nb3+nb4;  //()[]{}
		String nb9=nb5+nb6 +nb3+nb4 +nb1+nb2;  //[]{}()
		String nb10=nb5+nb6 +nb1+nb2 +nb3+nb4; //[](){}  
		String nb11=nb3+nb4 +nb1+nb2 +nb5+nb6; //{}()[] 
		String nb12=nb3+nb4 +nb5+nb6 +nb1+nb2; //{}[]()
		
		String nb13=nb3+nb5+nb6+nb4;//{[]} 
		String nb14=nb3+nb5+nb1+nb2+nb6+nb4;//{[()]}
		String nb15=nb3+nb1+nb2+nb4;//{()}
		String nb16=nb5+nb1+nb2+nb6 ;//[()]
		
		
		//System.out.println(nb1+nb2+nb3+nb4+nb5+nb6);
		
		if(str.equals(nb7)||str.equals(nb1+nb2)||str.equals(nb3+nb4)||str.equals(nb5+nb6)
				||str.equals(nb7)||str.equals(nb8)||str.equals(nb9)||str.equals(nb10)||str.equals(nb11)||str.equals(nb12)
				||str.equals(nb13)||str.equals(nb14)||str.equals(nb15)||str.equals(nb16)||str.equals(nb1+nb5+nb6+nb2))
		{
			System.out.println("true");
			return true;
		}
		else
		{
			System.out.println("false");
			return false;
		}
		
		//return 0;
		
	}

	public static void main(String[] args) 
	{
		String str = "([]}";
		Parentheses(str);

	}

}
