
public class Homework1 {

	public static void main(String[] args) {

		
		int num = 50, counter = 1, sum = 0;
		while(counter<num){
			if(num%counter==0){
				num/=counter;
				sum++;
			}
			counter++;
		}
		System.out.println("Broj se moze podjeliti "+sum+" puta.");
	}

}
