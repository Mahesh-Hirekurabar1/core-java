public class Runner{
	public static void main(String[] args){
	
	Telivision telivision = new Telivision();

	telivision.color = "black";
	System.out.println(telivision.color);
		Telivision tel= new Telivision();
	Telivision tel1= new Telivision();
	telivision.price = 90000;
	System.out.println(tel1.price);
	
	Telivision tel2 = new Telivision(70,76,68,7.8f,"red");
	System.out.println(tel2.size);
	System.out.println(Telivision.brand);
	
	Telivision tel3 = new Telivision(3,56,54,6.9f,"white");
	System.out.println(tel3.color);
	
	Telivision tel4 = new Telivision(20,55,8,5.1f,"purple");
	System.out.println(tel4.weight);
    Telivision.playSound();
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
        
		System.out.println("Static block");
		brand = "VIVO";
	}
	
	public static void playSound(){
		System.out.println("Static method");
		
	}
	
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