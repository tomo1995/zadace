
public class Zadaca {
	public static int getNextOddNumber(int num){
	if ( num%2 == 0){
		return num + 1;
	}else {
		return num + 2;
	}
		
		
		
	}
	public static void main(String[] args) {

		System.out.println(getNextOddNumber (2));
		System.out.println(getNextOddNumber (5));
		System.out.println(getNextOddNumber(10));
	}

}
