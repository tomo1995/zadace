import java.util.Scanner;


public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxBroj= 100;
		
		int zamisljeni = (int) (Math.random () * maxBroj);
		System.out.println("Yamislio sam broj od 0 do" + maxBroj);
		System.out.println(zamisljeni);
		int pokusaj, brojPokusaja = 0;
		Scanner ulaz = new Scanner(System.in);
		do{
			brojPokusaja++;
			System.out.print("Unesi broj:");
			pokusaj = ulaz.nextInt();
			if (pokusaj>zamisljeni){
				System.out.println("Unesi manji broj:");
			} else if (pokusaj <zamisljeni){
				System.out.println("Unesi veci broj");
				
			}
		}while (pokusaj != zamisljeni);
		System.out.println("Pogodjen broj" + zamisljeni + "u" + brojPokusaja + "pokusaja" );
		
		
		
		}

	}


