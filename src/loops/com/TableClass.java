package loops.com;

import java.util.Scanner;

public class TableClass {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
			int num=sc.nextInt();
			int [] number= {1,2,3,4,5,6,7,8,9,10};
			
			//for(int i=1;i<=10;i++)
			for(int i:number)
			{
				
				System.out.println(num*i);
			
			}
			
	
	
	}
}
