import java.util.Random;

public class Coin {

		int headcount;
		int tailscount;
		int trials;
	
	
	
	void CoinToss(){
		
	
    for(int i=0; i<trials; i++){
    Random rand = new Random();
    int toss =  rand.nextInt(2);
    	if (toss==1){
    		headcount++;
    }
    	else if (toss == 0){
    		tailscount++;
    		
    	}
    	}
	System.out.println("Tail Count: "+tailscount);				
	System.out.println("Head Count: "+headcount);

	}
}
	
	


