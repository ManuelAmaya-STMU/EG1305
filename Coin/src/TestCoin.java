import java.util.Scanner;

public class TestCoin {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);

		
		Coin c = new Coin();
		c.headcount = 0;
		c.tailscount = 0;
		System.out.println("How many times would you like to flip the coin? ");
		c.trials = keyboard.nextInt();
		
		
		c.CoinToss();

	}
}