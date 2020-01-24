import java.util.Scanner;

public class Television{
		private boolean state;
		private int station;
		private int volume;
		
	Scanner input = new Scanner(System.in);
	public Television( int station, int volume){

	this.station = station;
	this.volume =volume;
	}

	public void turnOn(){

	System.out.println("Press 1 to turn on TV. Press 0 to turn off TV");

	int display = input.nextInt();
	if ( display == 1){state = true;}
	if (display == 0){state = false;}	
	}

	public void changeStation(){

		if(state == true){
 
System.out.println(" Your TV is on\n Select 1 for station1\n Select 2 for station2\n Select 2 station3\n");

int channel = input.nextInt();
if (channel == 1 ){
System.out.println("You're watching Station 1");
}
if (channel == 2){
System.out.println("You're watching Station 2");
}22
if (channel == 3){
System.out.println("You're watching Station 3");

}

}

	/*public void increaseVolume(){

	volume += volume;	
	}

	
	public void decreaseVolume(){

	volume -= volume;	
	}*/

	
}















}
	
