import java.text.DecimalFormat;
import static java.lang.Math.*;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.0000");
		int radius= 5;
		System.out.println("The circle's radius is " + radius );
		double area= (radius*radius*PI);
		System.out.println("The area is "+ (df.format(area)));
		int diameter= (radius*2);
		System.out.println("The diameter is " + diameter);
	}

}
