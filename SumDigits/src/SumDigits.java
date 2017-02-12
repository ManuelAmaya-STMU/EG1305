//Use space on both sides of an operator
//Use Ctrl+Shift+F for auto formatting in Eclipse

import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int sum =0; 
		System.out.print("Please choose an integer between 0 and 1000\n");
		Scanner keyboard = new Scanner(System.in);
		a = keyboard.nextInt();
		if (a<1000 & a >0) {
			System.out.println("The Number is Valid");
		} else {
			System.out.println("The number you entered is not valid!!!\n "
					+ "Please Try Again!!!!\n");
		}
		while (a >0){
			int add = a%10; //int add = a % 10;
			sum = sum +add;
			a=a/10; //a  = a / 10;
		}
		System.out.println("The sum of all digits is:" +sum);
	}
}
