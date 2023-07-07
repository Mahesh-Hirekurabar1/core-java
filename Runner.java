public class Runner{
	public static void main(String[] args){
	
	Telivision telivision = new Telivision();
	telivision.price = 25000;
	telivision.size = 100;
	telivision.brightness = 10;
	telivision.color = "Red";
	System.out.println(telivision.color);
	
	Telivision tel1ivision = new Telivision();
	telivision.price = 80000;
	System.out.println(tel1ivision.price);
	
	Telivision tel2 = new Telivision(10,56,78,5.8f,"black");
	System.out.println(tel2.size);
	System.out.println(Telivision.brand);
	
	Telivision tel3 = new Telivision(11,57,79,5.9f,"Red");
	System.out.println(tel3.color);
	
	Telivision tel4 = new Telivision(12,58,80,6.1f,"Brown");
	System.out.println(tel4.weight);
	}
	

}

class Telivision{
	static String brand;
	int price;
	int size;
	String displayType;
	int sound;
	float weight;
	float height;
	int  warrenty;
	String color;
	int brightness;
	
	static{
		brand = "Samsung";
	}
	
	public static void playSound(){
		int price = 50000;
		int size = 51;
		int warrenty = 12;
		float weight = 7.9f;
		String color = "black";
		
	}
	
	public static void playVedio(){
		int price = 60000;
		int size = 55;
		int warrenty = 15;
		float weight = 8.5f;
		String color = "white";
	}
	public Telivision(int price,int size,int warrenty,float weight,String color){
		this.price = price;
		this.size = size;
		this.warrenty = warrenty;
		this.weight = weight;
		this.color =  color;
	}
	
	public Telivision(){
		
	}
	
	
	
}