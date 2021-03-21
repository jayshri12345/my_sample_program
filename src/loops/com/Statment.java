package loops.com;

import java.util.Scanner;

public class Statment {

	public static void main(String[] args) {
		/*int number=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
		int number=sc.nextInt();
		if(number>0)
		{
			System.out.println("no.is positive");
		}
		else if(number<0)
		{
			System.out.println("no.is negative");
		}
		else
		{
			System.out.println("no.is zero");
		}*/
		
		int number=10;
		String output=(number>0)? "no.is positive":"no.is negative";
		System.out.println(output);
	}
}
