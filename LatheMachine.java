public class LatheMachine{

		//States
	long price;
	static String brand;
	float chargingCapacity;
	int storageCapacity;
	static String condition;
	int weightCapacity;
	static String inputs;
	int sizeOfMachine;
	static String TypeOfDisplay;
	static String displayProductSelection;
	int consumingUnits;
	static String state;
	float diameterOfMacine ;
	int weightOfMachine;
	static String typeOfWorkDone;
	int bladeSize;
	static String typeOfLatheMachine;
	int range;
	static String typeOfHandelers;
	static String typeOfDevice;
	
	
	
	
	public LatheMachine(int sizeOfMachine, String brand, String condition)
	{
		this.sizeOfMachine = sizeOfMachine;
		this.brand = brand;
		this.condition = condition;
	}
	//Behaviours
	public static void continueWinding(){
	}
	public static void tapping(){
	}
	public static void cuttingTheProducts(){
	}
	public static void shapingTheProduct(){
	}
	public static void rotation(){
	}
	public static void typesOfWorkDone(){
	}
	public static void removingUnwantedParts(){
	}
	public static void turning(){
	}
	public static void threading(){
	}
	public static void drilling(){
	}
	
	
	public static void main(String[] args)
	{
		LatheMachine machine= new LatheMachine(5000, "Amada", "Idle");
		
		System.out.println(machine.sizeOfMachine);
		System.out.println(machine.brand);
		System.out.println(machine.condition);
	
	}
}