
public class Rezultat {

	public static void main(String[] args) {
		
		int n = 12574;
		int num = 0;
		while (n>0) {
			n/=10;
			num++;
		}	
			System.out.println("Broj je :" + num);
		

	}

}
