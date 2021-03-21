package loops.com;

public class LoopDemo1 {
	char [] str_char1()
	{
		char [] str_char= {'A','B','C','D','E'};
		return str_char;
	}
	public static void main(String[] args) {
		LoopDemo1 ld1=new LoopDemo1();
		for (int i = 4; i>=0; i--) {
			System.out.println(ld1.str_char1()[i]);
		}
		
	}
	

}
