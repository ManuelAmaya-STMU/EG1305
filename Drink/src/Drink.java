//Manuel Amaya
import java.text.DecimalFormat;
public class Drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		int customers= 12467;
		System.out.println("A soft drink company recently surveyed 12,467 customers");
		System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week is " + customers*0.14);
		System.out.println("And, the amount who prefer citrus flavored energy drinks is " +customers*0.14*0.64);
		
	}

}
