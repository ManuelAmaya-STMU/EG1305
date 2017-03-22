import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("The program will calculate the distance between two points.");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the x and y values for the first point \nx1:");
		int x1 = keyboard.nextInt();
		System.out.print("y1:");
		int y1 = keyboard.nextInt();
		System.out.print("Please enter the x and y values for the second point \nx2:");
		int x2 = keyboard.nextInt();
		System.out.print("y2:");
		int y2 = keyboard.nextInt();
		System.out.println("The distance between these two points is " +(df.format(getDistance(x1 , x2 , y1 , y2))));

		
		
		

	}
		public static double getDistance(double x1, double x2, double y1, double y2) {
			
			double distance = Math.sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );
			return distance;
		}

	}


