package loops.com;

public class ForEach {
	public static void main(String[] args) {
		
	
		int [] number= {1,2,3,4,5};
		//int i;
		int sum=0;
		for(int i:number)
		{
			sum=sum+i;
			//System.out.println(sum);
		}
		System.out.println(sum);
}}
