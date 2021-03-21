package loops.com;

public class LoopsDemo {
	int [] roll_num_array={1,2,3,4,5,6,7,8,9,10};
	public static void main(String[] args) {
		System.out.println("Inside main method");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("roll number is="+(i+1));
		}
		System.out.println("Outside for loop");
	}

}
