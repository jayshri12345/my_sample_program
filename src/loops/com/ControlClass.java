package loops.com;

import java.util.Scanner;

public class ControlClass {
public static void main(String[] args) {
	
	System.out.println("Enter no.between 1 to 12");
	Scanner s=new Scanner(System.in);
	int number=s.nextInt();
	switch(number)
	{
	case 1:
		System.out.println("january");
		break;
	case 2:
		System.out.println("feb");
		break;
	
	case 3:
		System.out.println("march");
		break;
	
	case 4:
		System.out.println("april");
		break;
	
	case 5:
		System.out.println("may");
		break;
	case 6:
		System.out.println("june");
		break;
	case 7:
		System.out.println("jully");
		break;
	case 8:
		System.out.println("august");
		break;
	
	case 9:
		System.out.println("september");
		break;
	case 10:
		System.out.println("octomber");
		break;
	case 11:
		System.out.println("november");
		break;
	case 12:
		System.out.println("december");
		break;
	default:
		System.out.println("Invalid month");
	
	
	}
}
}
