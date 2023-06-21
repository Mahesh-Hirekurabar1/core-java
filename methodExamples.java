public class methodExamples{
    public static void main(String[] args) {
        addMethod();
        multiplier();
        divider();
        selfMethod();
		myMethod();
		userMethod();
    }

    public static void addMethod() {
        int[] numbersArray= {1, 2, 3, 4, 5};
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }
		System.out.println();   
    }


    public static void multiplier() {
        long[] mobNumbers= {879267025L,734606179L,9265653535L,736746747L,9686776865L};
        for (int i = 0; i < mobNumbers.length; i++) {
            System.out.println(mobNumbers[i]);
        }
        System.out.println();
    }

    public static void divider() {
        short[] array = {16, 7, 1, 5, 2};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void selfMethod() {
        double[] array = {25.32,53.45,54.56,1.221,45.46,565.2555};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
	}
	public static void myMethod() {
        char[] array = {'m','a','h','e','s','h'};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
   
	}
	public static void userMethod() {
		char[] array = {'m','a','h','e','s','h'};
        for (int i = 5; i>=0; i--) {
            System.out.print(array[i]);
        }
	System.out.println();
	}	
}