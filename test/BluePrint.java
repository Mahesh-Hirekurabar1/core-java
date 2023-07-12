//Create a class and achive constructor chaining.
//create blue print for objects=fish ,camera , headphone
public class BluePrint{
	//states of fish
	String shape;
	int noOfeyes;
	String typeof;
	//camera
	int lens;
	string color;
	//headphone
	String type;
	int cost;
	
	
	public BluePrint(String shape, int noOfeyes,String typeof,int lens,String color,String type, int cost){
		this.shape=shape;
		this.noOfeyes=noOfeyes;
		this.typeof=typeof;
		this.lens=lens;
		this.color=color;
		this.type=type;
		this.cost=cost;
	}
	//behaviour
	public static void canSwim(){
	}
	public static void canBreath(){
	}
	//camera
	public static void storePicture(){
	}
	public static void clickThePhotos(){
	}
	//headphones
	public static void playMusic(){
	}
	public static void reciveTheCalls(){
	}
	public static void main(String[] args){
		BluePrint print=new BluePrint("round", 2, "jelly",60,"Black","wireless",1200);
		
		System.out.println(print.shape);
		System.out.println(print.noOfeyes);
		System.out.println(print.typeof);
		System.out.println(print.lens);
		System.out.println(print.color);
		System.out.println(print.type);
		System.out.println(print.cost);
		
	
	
	
	

}
	
}
	