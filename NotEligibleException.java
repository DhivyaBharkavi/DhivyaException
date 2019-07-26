package exercise23july19;

public class NotEligibleException extends Exception{

	public NotEligibleException(String s,int age) {
		System.out.println(s+" because not eligible to vote"+age);
		// TODO Auto-generated constructor stub
	}
	public NotEligibleException(String s)
	{
		System.out.println(s);
	}
	
}
