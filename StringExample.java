//Create Strings 20 string , 10 using literals , 10 using new keyword - > try any 5 methods in String class

public class StringExample {
    public static void main(String[] args) {
        // Strings created using literals
        String greating = "Hello Everyone";
        String source = "laptop";
        String village = "Benglore";
        String skills = "C Programming";
        String language = "Kannada";
		String name="Mahesh";
		String myStr="Hirekurabar";
		String institute="HSIT";
		String instrument="Chair";
		String buldingName="Palace";

        // Strings created using the new keyword
        String world = new String("World");
        String software = new String("Artificial Intelligence");
        String codingLanguage = new String("Java");
        String branch = new String("Electrical and electronics Engg.");
        String study = new String("Study");
		String tv = new String("TV");
		String building = new String("Building");
		String studying = new String("Xworkz");
		String thing = new String("Tree");
		String vehical = new String("Car");

        // Using String methods
        int length = greating.length();
        String strip = greating.strip();
        String subStr = village.substring(0, 4);
        int index = name.indexOf("ming");
        String upperCaseStr = myStr.toUpperCase();
		String lowerCaseStr = myStr.toLowerCase();

        System.out.println(length); 
        System.out.println(strip);
        System.out.println(subStr); 
        System.out.println(index); 
        System.out.println(upperCaseStr); 
		 System.out.println(lowerCaseStr); 
    }
}
