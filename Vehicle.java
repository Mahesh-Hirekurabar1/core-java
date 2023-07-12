<<<<<<< HEAD
//Create a class , declare 5 static variables , 5 non static , initialize the variables -> create 5 objects
public class Vehicle{
		static {
		System.out.println("Static Block");
		maximumSpeed=300;
		wheels=4;
		mirror=2;
		staring=1;
		vehicleType="Car";
		
		
		}
		//System.out.println(Vehicle.maximumSpeed);
		//System.out.println(Vehicle.wheels);
		//System.out.println(Vehicle.mirror);
		//System.out.println(Vehicle.staring);
		//System.out.println(Vehicle.vehicleType);
		
				

	
	//declring 5 static variables 
	static int maximumSpeed;
	static int wheels;
	static int mirror;
	static int staring;
	static String vehicleType;
	
	//declring 5 nonstatic variables 
	int manufacturingYear;
	String owner;
	String color;
	int price;
	String model;
	
	public Vehicle(int manufacturingYear, String color, String owner,int price, String model){
		System.out.println("Printing nonStatic variables");
		this.manufacturingYear=manufacturingYear;
		this.color=color;
		this.owner=owner;
		this.price=price;
		this.model=model;
		
	}
	public static void main(String[] args){
		Vehicle vehicle= new Vehicle(2023, "Mahesh", "Red", 200000, "E class");
		System.out.println(vehicle.manufacturingYear);
		System.out.println(vehicle.owner);
		System.out.println(vehicle.color);
		System.out.println(vehicle.price);
		System.out.println(vehicle.model);
		
		System.out.println(Vehicle.vehicleType);

		
	
		
	}
	
}



=======
//Create a class , declare 5 static variables , 5 non static , initialize the variables -> create 5 objects
public class Vehicle{
		static {
		System.out.println("Static Block");
		maximumSpeed=300;
		wheels=4;
		mirror=2;
		staring=1;
		vehicleType="Car";
		
		
		}
	
	//declring 5 static variables 
	static int maximumSpeed;
	static int wheels;
	static int mirror;
	static int staring;
	static String vehicleType;
	
	//declring 5 nonstatic variables 
	int manufacturingYear;
	String owner;
	String color;
	int price;
	String model;
	
	public Vehicle(int manufacturingYear, String color, String owner,int price, String model){
		System.out.println("Printing nonStatic variables");
		this.manufacturingYear=manufacturingYear;
		this.color=color;
		this.owner=owner;
		this.price=price;
		this.model=model;
		
	}
	public static void main(String[] args){
		Vehicle vehicle= new Vehicle(2023, "Mahesh", "Red", 200000, "E class");
		System.out.println(vehicle.manufacturingYear);
		System.out.println(vehicle.owner);
		System.out.println(vehicle.color);
		System.out.println(vehicle.price);
		System.out.println(vehicle.model);

		
	
		
	}
	
}



>>>>>>> dd5cecf4d2355845fd629fee82b56064984ee4db
