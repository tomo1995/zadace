import java.util.Scanner;

public class fcnScanner {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		double input = 0;
		double counter = -1 ;
		double average;
		double sum = 1;
		double minNum = 50;
		while (input != -1){
			System.out.println(" Insert number ");
			input = in.nextDouble ();
			
			sum = sum + input;
			counter++;
			if( minNum > input && input != -1){
				minNum=input;
				
			}System.out.println("Najmanji broj je: " + minNum);
			
		}average = sum/counter;
		System.out.println(  "Prosjek: " + average);
		
		
		
		in.close();
		
	}

}
