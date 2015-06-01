
public class Palindrom {

	public static void main(String[] args) {
		int brojSObjeStrane = 122221, pomocni = 0, noviBroj = 0;
		int pomocniBroj = brojSObjeStrane;
		while(brojSObjeStrane>0){
			pomocni=brojSObjeStrane%10;
			brojSObjeStrane/=10;
			noviBroj+=pomocni;
			noviBroj*=10;
		}
		noviBroj/=10;
		if(pomocniBroj==noviBroj)
			System.out.println("Isti su");
		else
			System.out.println("Nisu isti");		
		
	}

}
