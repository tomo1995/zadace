public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int brojeva = 100;
		int brojac = 0;

		while (brojac <= 100) {
			brojac++;

			if (brojac% 2 == 1 &&  brojac % 3 == 0 && brojac % 5 != 0) {
				System.out.println(brojac);
			}
		}
	}
}
