package loops.com;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		//int n=2;
		int temp;
		boolean isprime=true;
		//Scanner sc=new Scanner(System.in);
		
		for(int i=100; i<=200; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isprime= false;
					
				}
			}	
			if(isprime)
			System.out.println(i);
		}
		
		
		/*System.out.println("enter a no.");
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println("no.is prime number");
		}
		else
		{
			System.out.println("no.is not prime");
		}*/
		
			
	}
	
}
