public class BackBencher{
    int value1;
    double value2;
    String value3;
    boolean value4;
    char value5;

    // Default constructor
    public BackBencher(){
		System.out.println(value1);
		System.out.println(value2);
		System.out.println("value3");
		System.out.println(value4);
		System.out.println(value5);
        
    }

    // Parameterized constructor
    public BackBencher(int value11, double value22, String value33, boolean value44, char value55) {
        value1=value11;
		value2=value22;
		value3=value33;
		value4=value44;
		value5=value55;
		
    }

    public static void main(String[] args) {
		new BackBencher();
		BackBencher bench = new BackBencher(42, 3.14, "Hello", true, 'A');
		System.out.println(bench.value1);
		System.out.println(bench.value2);
		System.out.println(bench.value3);
		System.out.println(bench.value4);
		System.out.println(bench.value5);	
	}
}