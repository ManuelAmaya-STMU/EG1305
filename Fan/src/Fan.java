
public class Fan {
	
	
	int fanSpeed;
	boolean fanStatus;
	double radius;
	String fanColor;
	
	public Fan(){
		fanStatus = false;
		radius = 5;
		fanColor = "Blue";
		
		
	}
	
	
	public Fan(int fanSpeed, boolean fanStatus, double radius, String fanColor){
		this.fanSpeed = fanSpeed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.fanColor = fanColor;
		
		

	}
	public boolean isFanStatus() {
		return fanStatus;
	}
	
	

	public String toString(){
		String OnVsOff;
		
		if (isFanStatus())
			 OnVsOff ="on";		
		else
			OnVsOff = "off";
		
		
		if (isFanStatus()){
			
		return "The " +fanColor +" fan is " +OnVsOff +" with a speed of " +fanSpeed +" and a radius of " + radius;
		} 
		else 
			return "The" +fanColor +" fan is " +OnVsOff +"with a radius of " + radius;
	}
}
