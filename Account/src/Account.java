
public class Account {
	
	int id;
	double balance;
	double annualInterestRate;
	double withdraw;
	double depoist;

		public Account() {
	
		}
		
		public static void Account(int id, double balance, double annualInterestRate, int dateCreated){
			
		}
		
		//Accessors
		public void setId(int id){	
		}
		public void setBalance(double balance){	
		}
		public void setannualInterestRate(double annualInterestRate){
		}
		 void date(){
			System.out.print("March 26, 2017");
			
		}
		
		//Mutators
		public int getId( int id){
			return id;
		}
		public double getBalance(double balance){
			return balance;
		}
		public double getannualInterestRate(double annualInterestRate){
			return annualInterestRate;
		}
		
		public double getMonthlyInterestRate(double annualInterestRate){
			return (annualInterestRate/12) ;
		}
		public static double withdraw(double balance, int withdraw){
			 
			return balance - withdraw;
		}
		public static double depoists(double balance, int depoist){
	
			return balance +depoist;

		}		
		public static double finalbalance (double balance, double annualInterestRate, double depoists, double withdraw){
	
			return  (balance-withdraw+depoists) * annualInterestRate;
			
		}
		
		
		

	

	}
