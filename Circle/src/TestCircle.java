import java.text.DecimalFormat;
import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		double r;
		Circle c = new Circle();
		DecimalFormat df = new DecimalFormat("0.0000");
		System.out.print("Please enter the radius of your circle! ");
		Scanner keyboard= new Scanner(System.in);
		r = keyboard.nextDouble();
		System.out.print("The Radius: " +df.format(c.getRadius(r)));
		System.out.print('\n' +"The Diameter: " +df.format(c.getDiameter(r)));
		System.out.print('\n' +"The Area: " +df.format(c.getArea(r)));
		System.out.print('\n' +"The Circumference: " +df.format(c.getCircumference(r)));
		keyboard.close();
	}

}
