package loops.com;

public class LoopDemo9 {
	static String [] s_name()
	{
		String [] s_name= {"jaya","supriya","priya","dipa"};
		return s_name;
	}
	public static void main(String[] args) {
		
		for (int i =s_name().length-1; i >0; i--) {
			System.out.println(s_name()[i]);
			
		}
	}
}
