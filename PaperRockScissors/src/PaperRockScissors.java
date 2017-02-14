import java.util.Scanner;
import java.util.Random;

public class PaperRockScissors {
	
	public static void main(String[] args) {
		
		int user;
		
		System.out.println("Welcome to Paper, Rock, Scissors");
		System.out.println("Which do you choose? "+ "Paper = 1; Rock = 2; Scissors = 3 ");
		Scanner keyboard = new Scanner(System.in);
		user = keyboard.nextInt();
		
		
		int max = 3;
		int min = 1;
		Random computer = new Random();
        int computerchoice =  computer.nextInt( 3 ) + 1;
        
		//System.out.println(computerchoice); Testing the number generated from the computer
		
		if ((computerchoice == 1 && user ==1)||(computerchoice == 2 && user ==2) ||(computerchoice == 3 && user ==3))
			 System.out.println("Tie");
		
		if(computerchoice == 1  && user == 2)
		        System.out.println("You Lose! Paper Beats Rock");
		
		if((computerchoice == 2  && user == 3))
		        	System.out.println("You lose! Rock Beats Scissors");
		
		if((computerchoice == 3  && user == 1))
        	System.out.println("You lose! Scissors Beats Paper");
		
		if(user == 1  && computerchoice == 2)
	        System.out.println("You Win! Paper Beats Rock");
	
		if((user == 2  && computerchoice == 3))
	        	System.out.println("You Win! Rock Beats Scissors");
	
		if((user == 3  && computerchoice == 1))
    	System.out.println("You Win! Scissors Beats Paper");
	}
}