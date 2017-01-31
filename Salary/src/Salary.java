//ManuelAmaya
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
String age;
String annualPay;

		System.out.println("Enter your name");;
		
		Scanner keyboard = new Scanner(System.in);
		
		name = keyboard.next();
		
		System.out.println("Enter your age");;
		
		age = keyboard.next();
		
		System.out.println("Enter your annualPay");;
		
		annualPay = keyboard.next();
		
		System.out.println("My name is " + name); 
		System.out.println("My age is " + age);
		System.out.println("and I hope to earn $" + annualPay +" this year!!!");
		

	}

}