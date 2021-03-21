package loops.com;

public class FactRecursion {
	
	static int factorial(int n)
	{
		if(n!=0)
		{
			 int fact=n*factorial(n-1);
			 return fact;
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args) {
	
		System.out.println(FactRecursion.factorial(5));
	}

}
