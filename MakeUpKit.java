//Declare methods with return type - specify all posible return types and save the returned value 
public class MakeUpKit{
public static void main(String[] args) {
	
	float additionOfTwoValues=calculateSum();
	int cValue=add();
	double multiplicationOfTwoNum=mul();
	char firstLatterOfName=name();
	addMethod();
	checkTheNo();
	long subtractionOfTwoNumber=sub();
	
	System.out.println(additionOfTwoValues);
	System.out.println(cValue);
	System.out.println(multiplicationOfTwoNum);
	System.out.println(firstLatterOfName);
	System.out.println(subtractionOfTwoNumber);
	
	
}
public static float calculateSum() {
	float a=55.454f;
	float b=66.5666f;
    float c=a+b;
	return c;
}


public static boolean checkTheNo(){
		int number=-1;
		if(number>=0){
			return true;
		}
		else{
			return false;
		}
	}


public static int add(){
	int a=256;
	int b=54;
	int c=a+b;
	return c;
	}
	
public static double mul(){
	double tempOfJayanagar=25.2;
	double tempOfBtmLayout=66.7;
	double multiplicationOfBothTemp=tempOfJayanagar*tempOfBtmLayout;
	return multiplicationOfBothTemp;
}
public static char name(){
	char nameStartWith='m';
	return nameStartWith;
}
public static long sub(){
	long a=256645L;
	long b=565565L;
	long c=a-b;
	return c;
}
public static void addMethod() {
        int[] numbersArray= {1, 2, 3, 4, 5};
        for (int i = 0; i < numbersArray.length; i++) {
           System.out.println( numbersArray[i]);
			return;
        }

}

}




