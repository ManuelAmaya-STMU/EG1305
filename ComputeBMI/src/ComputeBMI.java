import javax.swing.*;
public class ComputeBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double weight = Integer.parseInt(JOptionPane.showInputDialog("Enter your weight"));
		double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height"));
		double weightInKilo = (weight* 0.45359237);
		double heightInMeters = (height * 0.0254 );
		double denominator = heightInMeters *heightInMeters;
		double BMI = weightInKilo/ denominator;
		JOptionPane.showMessageDialog(null, "Your BMI is "+BMI);
		
	}

}
