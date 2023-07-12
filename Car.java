//Create 1 class , 5 variables -> 2 enums 1 should have string , 1 should have int , initialize the values using constructor
public class Car{
	long price;
	int numberOfSteering;
	int numberOfMirrors;
	CarColor color = CarColor.WHITE;
	NumberOfDoors totalDoors = NumberOfDoors.TWO;
	
	public Car(long price, int numberOfMirrors, int numberOfSteering){
	this.price = price;
	this.numberOfMirrors = numberOfMirrors;
	this.numberOfSteering = numberOfSteering;
	}
	
	public static void main(String[] args){
		
		Car car = new Car(250000L, 1, 2);
		System.out.println(car.price);
		System.out.println(car.numberOfMirrors);
		System.out.println(car.numberOfSteering);
		
		System.out.println("....................................");
		System.out.println("Enum start");
		System.out.println(car.color.getValue());
		System.out.println(car.totalDoors.getValue());
	}
	
	
	//GET MWTHOD
	public long getPrice(){
		return price;
	}
	public int getNumberOfSteering(){
		return numberOfSteering;
	}
	public  int getNumberOfMirrors(){
		return numberOfMirrors;
	}

} 
//ENUM ONE
enum CarColor{
	WHITE("White"),BLACK("Black"),BROWN("Brown"),BLUE("Blue");
	
	String value;
	CarColor(String value){
		this.value=value;
		
	}
	public String getValue(){
		return value;
	}
	
	
}
//ENUM TWO
enum NumberOfDoors{
	TWO(2),THREE(3),FOUR(4),FIVE(5),EIGHT(8);
	
	int value;
	NumberOfDoors(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
}