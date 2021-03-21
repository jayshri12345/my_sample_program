package loops.com;

public class LoopDemo8 {
	 public static String[] arr1()
	{
		String [] name_str= {"mouse","UPS","keyboard"};
		return name_str;
	
	}
	public static void main(String [] args) {
		for (int i = 0; i < LoopDemo8.arr1().length; i++) {
			System.out.println(LoopDemo8.arr1()[i] + "\t");
		}
	}

}
