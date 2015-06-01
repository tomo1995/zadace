
public class Metar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ukupnoMetara = 41150;
		int predjenihKm = 0;
		double metaraPretrcanih = 0;
		int brojIteracija = 0;
		
		do {
			metaraPretrcanih += Math.random();
			brojIteracija ++;
			if (metaraPretrcanih / 1000> predjenihKm){
				predjenihKm++;
				System.out.println(".");
			}
			
			
			
			
				
		} while ( metaraPretrcanih < ukupnoMetara);
		System.out.println("Cilj");
		System.out.println( "Iteracija" + brojIteracija);
			
		}

	}


