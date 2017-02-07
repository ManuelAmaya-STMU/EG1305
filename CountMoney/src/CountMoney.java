import java.util.Scanner;
public class CountMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter an amount as an integer:");
		Scanner keyboard= new Scanner (System.in);
		int amount = keyboard.nextInt();
		int leftover= amount;
		System.out.println("You amount: "+amount+" consists of");
	
		int dollars = amount/100;
		if (dollars > 0){
			leftover= leftover-(dollars*100);
			System.out.println(+dollars +" Dollar(s)");}
		
		int quarters = leftover/25;
		if (quarters >0){
			leftover = leftover-(quarters*25);
			System.out.println(quarters +" Quarter(s)");}
		
		int dimes = leftover/10;
		if (dimes >0){
			leftover = leftover-(dimes*10);
			System.out.println(dimes +" Dime(s)");}
		
		int nickels = leftover/5;
		if (nickels >0){
			leftover = leftover-(nickels*5);
			System.out.println(nickels+" Nickel(s)");}
		
		int pennies = leftover;
		System.out.println(leftover+" Penny/Pennies");
		
		}
		
	}