import java.util.Scanner;


public class http {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String page = input.next();
		String num = "";
		
		input.close();
		for (int i = 0; i < page.length(); i++){
			if(i%2==0){
			num += page.charAt(i);
			}
		}System.out.println(num);
	}

}
