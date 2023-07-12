//Create a class and achive constructor chaining.

public class Railway{
	int age;
	long number ;
	double weight;
	
	public Railway(){
		System.out.println(age);
		System.out.println(number);
		System.out.println(weight);
	}
	public Railway(int age, long number, double weight){
		this.age=age;
		this.number=number;
		this.weight=weight;
	}
	
	public static void main(String[] args){
		new Railway();
		Railway railway = new Railway( 15, 7349606179l,65.5d);
		System.out.println(railway.age);
		System.out.println(railway.number);
		System.out.println(railway.weight);
		
		
	}
}