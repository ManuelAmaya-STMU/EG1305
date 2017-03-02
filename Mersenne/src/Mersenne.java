import java.util.Scanner;
public class Mersenne {
		
		public static void main(String[] args) {
			int x=0;
			int max;
			System.out.println("Please enter any number. This program will generate Mersenne prime numbers from 0 to the value");
			Scanner value=new Scanner(System.in);
			max=value.nextInt();
		      
			int mPrime = 0;
			int i = 0;
			     
				do {
					i++;
					mPrime = (int) ((Math.pow(2, i)) - 1);

					if(mPrime % 2 != 0 && mPrime %3 != 0 && mPrime %5 != 0 && mPrime != 1|| mPrime ==3){
						x++;
			          System.out.print(mPrime + " ");}
					}		while (max >mPrime );
				

				
				System.out.println("There are a total of "+ x+" Myrsenne prime numbers.");
			}

	}

			