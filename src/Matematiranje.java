import java.util.Scanner;


public class Matematiranje {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int counter = 0;
		boolean zelisJos = true;
		int tezina = 1;

		while (zelisJos == true){
			
			counter = 0;
			for ( int i = 0; i <10; i++ ){
				int a = (int) (Math.random() * 9 + 1) * tezina;
				int b = (int) (Math.random() * 9 + 1);
				
				System.out.println(a + "*" + b);
				int rez = a * b;
				
				int r = in.nextInt();
				if (rez == r){
					counter++;
					System.out.println("True");
				}else{
					System.out.println("false");
				}
				
			}System.out.println("Imali ste " + counter + "poena");
			
			if(counter > 5){
				tezina++;
			}
			
			
			System.out.println("Ukoliko zelite jos ukucajte 1, za izlazak ukucaj 0");
			int n = in.nextInt();
			if(n == 0){
				zelisJos = false;
			}
			
			
		}
		

  }
}