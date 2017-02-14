import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int month;
	int year;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter a Year" );
	year = keyboard.nextInt();
	System.out.println("Please enter a Month" );
	month = keyboard.nextInt();
	
	//31 days: January, March, May, July, August, October, December
	//30 days: April, June, September, November
	// February = 28 || February = 29 in Leap Year
	
	if ((month == 1 || month == 3 || month == 5 || 
		month == 7 || month == 8 || month == 10 || month == 12)){
		System.out.println("There are 31 days in "+ month +"/" +year);}
	
	if ((month == 4 || month == 6 || month == 9 || month == 11)){
			System.out.println("There are 30 days in "+ month +"/" +year);}
	{
	if ((month == 2 && year %4 == 0 && year % 100 != 0 || 
		 month == 2 && year %4 == 0 && year % 100 == 0 && year%400 == 0)){
			System.out.println("There are 29 days in "+ month +"/" +year);}
	
		else if ((month == 2))
		System.out.println("There are 28 days in "+ month +"/" +year);}
		
}}
	


