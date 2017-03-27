
public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		a.id = 1122;
		a.balance = 20000;
		a.annualInterestRate = 1.045;
		a.withdraw = 2500;
		a.depoist = 3000;
		
		System.out.println("Your balance is "+a.finalbalance (a.balance, a.annualInterestRate,a.depoist, a.withdraw));

		System.out.println("The montly interest was " +a.getMonthlyInterestRate(a.annualInterestRate)+"%");		
		
		a.date();
		
	

	}
}