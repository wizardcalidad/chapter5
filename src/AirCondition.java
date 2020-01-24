import java.util.Scanner; 
class MyAirCondition {

	private double acTemperature = 16;
	private boolean state;

	//public MyAirCondition(){
	//}

	public void setAcTemperature(double acTemperature){
	this.acTemperature = acTemperature;
	}

		
	public double getAcTemperature(){
		return acTemperature;
	}

	public void turnOn(){
	this.state = true;
	 
	}

	public void increaseTemp(){
		if(state){
		acTemperature += 1;
		}

	}

	public void decreaseTemp(){
		if(state){
		acTemperature -= 1;
		}
	}

	/*public void setTemp( double roomTemp){

	if(roomTemp < 16)
	Actemperature += 5.0;

	else if(roomTemp >= 20)
	Actemperature -= 5.0;
	
	}*/

	//public double getTemperature(){
	//   return Actemperature;	
	//}


}
 

	


public class AirCondition{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
MyAirCondition AirConditionObj = new MyAirCondition();

AirConditionObj.turnOn();
AirConditionObj.increaseTemp();

AirConditionObj.increaseTemp();
AirConditionObj.increaseTemp();
AirConditionObj.decreaseTemp();
/*System.out.println("Enter room temp :");
double user = input.nextDouble();*/
//AirConditionObj.setTemp();

System.out.printf("The ac temp is now : %.1f%n",
  AirConditionObj.getAcTemperature());	


  }
}

