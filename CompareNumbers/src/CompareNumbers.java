import java.util.Scanner;

public class CompareNumbers {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first integer");
		int a = keyboard.nextInt();
		System.out.println("Enter second integer");
		int b = keyboard.nextInt();
		System.out.println("Enter third integer");
		int c = keyboard.nextInt();
		System.out.println("For the numbers "+a+ ", " +b+ ", " +"and " +c);
		int sum = a + b + c;
		int product = a * b * c;
		double average = sum / 3;
		
		if (a > b && a > c && b > c){
			System.out.println("Largest: " +a);
			System.out.println("Smallest: " +c);}
		
		if (a > b && a > c && c > b){
			System.out.println("Largest: " +a);
			System.out.println("Smallest: " +b);}
		
		if (b > a && b > c && a > c){
			System.out.println("Largest: " +b);
			System.out.println("Smallest: " +c);}
		
		if (b > a && b > c && c > a){
			System.out.println("Largest: " +b);
			System.out.println("Smallest: " +a);}
		
		if (c > b && c > a && b > a){
			System.out.println("Largest: " +c);
			System.out.println("Smallest: " +a);}
		
		if (c > b && c > a && a > b){
			System.out.println("Largest: " +c);
			System.out.println("Smallest: " +b);}
		
		
		System.out.println("Sum is " +sum);
		System.out.println("product is " + product);
		System.out.println("Average is " + average);
	}
}