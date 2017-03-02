
import java.util.Random;
import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
		
		int human = 100;
		System.out.println("Enter a number between 1 and 100");
		Scanner keyboard = new Scanner(System.in);
		int max =100;
		int min = 1;
		Random computer = new Random();
        int computerchoice =  computer.nextInt(max - min +1) +min;
        
        
        while(human != computerchoice   ){ 
        human = (int) keyboard.nextInt();
        
		if (computerchoice > human){
			System.out.println("Guess Higher");}
			else if(computerchoice < human){
				System.out.println("Guess Lower");}
			else if (computerchoice == human){
				System.out.println("You're right; the number was " +computerchoice);
			
		
		}

}}}