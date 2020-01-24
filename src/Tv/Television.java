import java.util.Scanner;

public class Television{
	Scanner input = new Scanner(System.in);

	private boolean state;
	private int station;
	private int volume;

	public void turnOn(){
		//this.state = state;
		System.out.println("Enter 1 to turn on tv\n Enter 2 to turn off tv\n");
		int on = input.nextInt();
		if (on == 1){
			state = true;
			setStation();
			changeStation();
		}
		else {
			
			on = 2;
			turnOn();
		}
	}
	public boolean isOn(){
			return state;
	}

	public void setStation(){
		
		if(state == true){
			System.out.println("Your tv is on\n press 1 to select Arial Tv\n press 2 to select MongDb Tv\n press 3 to select Semicolon Tv\n press 4 to select Oyin Tv\n ");
			this.station = input.nextInt();
		}
	}

	public int getStation(){
		return station;
	}
	public void setVolume(){
		this.volume = volume + 1;
		
	}

	public int getVolume(){
		return volume;
		
	}

	public void changeStation(){
		if(state == true){
			if(station==1){
				System.out.println("you're watching Arial Tv\n Stay tune for the hourly news\n");
			}
			if(station==2){
				System.out.println("you're watching MongDb Tv\n Stay tune for the hourly news\n");
			}
			if(station==3){
				System.out.println("you're watching Semicolon Tv\n Stay tune for the hourly news\n");
			}
			if(station==4){
				System.out.println("you're watching Oyin Tv\n Stay tune for the hourly news\n");
			}
			
		}
	}
}