//Manuel Amaya
import java.text.DecimalFormat;
import static java.lang.Math.*;
public class StockTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		int shares= 1000;
		double price = 32.87;
		final double COMMISSION_RATE = 0.02;
		double fprice = 33.92;
		System.out.println("John bought 1,000 stocks for $32.87 each for a total of $" +shares*price);
		System.out.println("John paid his broker 2% commision therefore $" +shares*price*COMMISSION_RATE);
		System.out.println("John then sold the stocks for $33.92 each for a grand total of $" +shares*fprice);
		System.out.println("John once again paid 2% of that, $" +shares*fprice*COMMISSION_RATE);
		System.out.println("At the end of the day John made $" +(df.format((shares*fprice-shares*price)-(shares*price*COMMISSION_RATE+shares*fprice*COMMISSION_RATE))));
		
		
	}

}