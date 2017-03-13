import java.util.Scanner;
import java.text.DecimalFormat;
public class FIndPI {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		DecimalFormat df = new DecimalFormat("0.0000");
		System.out.println("Enter the number of iterations: ");
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		    double pi = 0; 
		    for(int a = 1; a < n; a+= 2) {  
		        pi = pi + ((1.0 / (2.0 * a - 1)) - (1 / (2.0 * a + 1))); 
		        } 
		 double pi2 = 4 * pi; 
		 System.out.println("PI: "+pi2 +" after " +n+" iterations"); 
			
		int i = 1;
	
		while(i < 1001 ) {
			
			i++;
		}
		long finishTime = System.nanoTime();
		long difference = finishTime - startTime;
		double seconds = difference / 1000000000.0;
		
	System.out.println("It took "+seconds+" seconds");
}}