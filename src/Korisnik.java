
public class Korisnik {

	public static void main(String[] args) {
		int endInterval = 10;
		
		for (int j = 1; j <= endInterval; j++){
			int num = j;
			boolean isPrime = true;
			for (int i =2; i < num; i++){
				
				if ( num % i == 0){
					isPrime = false;
					break;
					
				}
			}
			if ( isPrime == true){
				System.out.println(num);
			}
			isPrime = true;
		}
	}

}
