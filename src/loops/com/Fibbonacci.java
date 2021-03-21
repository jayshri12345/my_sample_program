package loops.com;

public class Fibbonacci {
	public static void main(String[] args) {
		int t1=0,t2=1;
		int sum;
		int n=10;
		System.out.print(" ");
		for(int i=0;i<=n;i++)
		{
			System.out.print(t1 + "+");
			sum=t1+t2;
			t1=t2;
			t2=sum;
			//System.out.print(t2 + "+");
		}
	}

}
