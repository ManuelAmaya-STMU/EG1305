
public class Chess {
	
	public static void main(String[] args) {
		
		double rice = 0;
		double total = 0;
		double last;
		int i = 0;
		
		while(i < 64 ) {
			rice = Math.pow(2, i);
			i++;
			total = rice+rice;
		}
		
		last = rice- 1;
		
		System.out.println("The total grains that cover a chess board are: "+total);
		System.out.println("The number of grains in the last square of a chess board is: "+last);

	}
}
