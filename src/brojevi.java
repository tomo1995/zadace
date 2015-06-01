import java.util.Scanner;


public class brojevi {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int num = 0;
		int parni = 0;
		int neparni = 0;
		do{
			System.out.println("unesi broj:");
			num = in.nextInt();
			if (num % 2 == 0 && num != 0){
				parni++;
				
			}else if (num % 2 == 1 ){
				neparni ++;
				
			}
			
		} while (num != 0);
		System.out.println(parni + " "  + neparni);
		in.close();
		
		
				
		
		}
		
	}


