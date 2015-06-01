public class Prost {

	public static void main(String[] args) {

		int n = 79;
		int a = 1;
		int num = 0;
		
		while (a<=n){
			boolean b = n % a == 0;
			
			
			a++;
			if ( b == true ){
				num++;   
			}
			
		}
		
		System.out.println(num);
		
		if (num==2){
			System.out.println("Prost je ");
		}
		
	}

	}
