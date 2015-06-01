
public class Palindroms {

	public static void main(String[] args) {
		
		for( int i = 1001; i < 10000; i++){
			int d1 = i % 10;
			int d2 = i/10 % 10;
			int d3 = i/100 % 10;
			int d4 = i/1000 ;
			
			int reverse = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
			if ( i == reverse){
				System.out.println(i);
			}
			
			}
		
		}
		
	}


