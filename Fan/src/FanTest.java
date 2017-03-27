import java.util.Scanner;

public class FanTest {
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);

		Fan f = new Fan();
		System.out.println(" Please state the Color of the Fan: ");
		f.fanColor = keyboard.next();
		
		System.out.print("Please state the Radius of the Fan: ");
		f.radius = keyboard.nextInt();
		
		System.out.print("Is the fan on? true or false: ");
		f.fanStatus = keyboard.nextBoolean();
		
		System.out.println("What is the speed?");
		f.fanSpeed = keyboard.nextInt();
		
		
		System.out.println(f.toString());
		
		
		
		
		
		

		

	}
}