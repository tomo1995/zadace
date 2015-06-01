
public class Matematika {

	public static void main(String[] args) {
		
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		 
		for ( int i = 1; i <1000; i++ ){
			int d = (int) (Math.random() * 5 + 1);
			
			System.out.println(d);
			
			if (d==1){
				counter1 ++;
				
			}else if (d==2){
				counter2 ++;
				
			}else if (d==3){
				counter3 ++;
				
			}else if (d==4){
				counter4 ++;
				
			}else{
				counter5 ++;
			}
			System.out.println("number1 :" + counter1 );
			System.out.println("number2 :" + counter2 );
			System.out.println("number3 :" + counter3 );
			System.out.println("number4 :" + counter4 );
			System.out.println("number5 :" + counter5 );
		}	
		
		
	}

}
