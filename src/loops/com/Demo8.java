package loops.com;

public class Demo8 {

	static String [] names_array= {"I","don't","want","to","go","school"};
	static String result;
	public static void main(String[] args) {
		String str_final=" ";
		for(int i=0;i<names_array.length;i++)
		{
			str_final=str_final+names_array[i];
		}
		/*Demo4 d1=new Demo4();
		for(int i=0;i<5;i++)
		{
			result=names_array[0]+names_array[1]+names_array[2]+names_array[3]+names_array[4]+names_array[5];
		}*/

		System.out.println(str_final);
	}
}
