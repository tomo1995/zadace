
public class text {

	public static void main(String[] args) {

		TextIO.readFile("src/text.txt");
		
		
		int n = TextIO.getInt() ;
		int sum = 0;
		for (int i = 0; i <n; i++){
			 	
			sum += TextIO.getInt();
		}System.out.println(sum);
		
	}

}
