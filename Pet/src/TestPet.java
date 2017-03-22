import java.text.DecimalFormat;
import java.util.Scanner;

public class TestPet {
	
	public static void main(String[] args) {
		
	Pet p = new Pet();
	Scanner keyboard= new Scanner(System.in);
	
	System.out.println("Please enter the name of your pet ");
	p.name = keyboard.next();
	
	System.out.println("Please enter the type ");
	p.type = keyboard.next();
	
	System.out.println("Please enter the age ");
	p.age = keyboard.next();
	
	System.out.println("Pet object created");
	System.out.println("The name is "+p.getName());
	System.out.println("The type is "+p.getType());
	System.out.println("The age is "+p.getAge());

	
	
	}
}