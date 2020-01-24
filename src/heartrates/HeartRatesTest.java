public class HeartRatesTest{
	public static void main(String[] args) {
		HeartRates fatMan = new HeartRates();
		fatMan.setFirstName("John");
		fatMan.setLastName("Doe");
		fatMan.setDateOfBirth();
		fatMan.setAge();
		fatMan.setTargetHeartRate();
		System.out.println(fatMan.getFirstName() + fatMan.getLastName()+" born in the year "+ fatMan.getDateOfBirth());
		System.out.println("Your target heart rate is " + fatMan.getTargetHeartRate());
	}
}