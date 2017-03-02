import java.util.Scanner;
public class Prime {
	
   public static void main (String[] args) {
	
	   int max;
       int x = 0;  
       System.out.println("Enter a number. The program will print all the prime numbers smaller than this number");
       Scanner keyboard =new Scanner(System.in);
		max = keyboard.nextInt();
       int i =0;
       int num =0;
       String  isPrime = "";
       
       for (i = 1; i <= max; i++){ 		  	  
          int counter=0; 
          
       for(num =i; num>=1; num--){
             if(i%num==0){
 		counter = counter + 1;}}
       
	   if (counter ==2) { 
		   x++; 
	     isPrime = isPrime + i + " ";
	     
	  }}
	    
       System.out.println("Prime numbers from 1 to " +max +" are :");
       System.out.println(isPrime);
       System.out.println("There are a total of " +x +" Prime Numbers");
   }
}