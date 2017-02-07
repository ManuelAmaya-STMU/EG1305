import java.util.Scanner;
public class MilesPerGallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double miles;
		double gallons;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the miles driven:");
		miles = keyboard.nextInt();
		System.out.print("Enter the amount of gallons used:\n");
		gallons = keyboard.nextInt();
		double mpg = miles/gallons;
		System.out.println("The miles-per-gallon is: "+mpg);
	
	}

}
