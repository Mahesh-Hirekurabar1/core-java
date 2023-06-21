public class ArrayClass{
	public static void main(String[] args){
	
	
	
	int[] evenNumbers = {2,4,6,8,10};
	System.out.println(evenNumbers[0]);
	
	int[] roomNumber = {200,201,203,204,205};
	System.out.println(roomNumber[3]);
	
	int[] oddNumbers = {1,3,5,7,9,11};
	System.out.println(oddNumbers[2]);
	
	int[] employeeId = {100,101,102,103,104};
	System.out.println(employeeId[4]);

	int[] rollNumber = {10,15,20,30,40};
	System.out.println(rollNumber[3]);
	
	char[] vowels = {'a','e','i','o','u'};
	System.out.println(vowels[2]);
	
	char[] alphabates = {'b','c','d','e','f','g'};
	System.out.println(alphabates[2]);

	char[] myNameCharecters = {'r','o','h','i','t'};
	System.out.println(myNameCharecters[4]);

	char[] bloodGroup = {'a','b'};
	System.out.println(bloodGroup[1]);
		
	
	float[] roomTemperature = new float[20];
	roomTemperature[14] = 25.6f;
	for(int i=0;i<20;i++){
		System.out.println(roomTemperature[1]);
	}

	int[] rollNo = new int[10];
	rollNo[5] = 10;
	for(int i=0;i<10;i++){
		System.out.println(rollNo[i]);
	}

	int[] roadNo = new int[20];
	roadNo[2] = 9;
	for(int i=0;i>20;i--){
		System.out.println(roadNo[i]);
	}

	char[] englishVowels = new char[5];
	englishVowels[3] = 'o';
	
	
	char[] englishAlphabate = new char[1];
	englishAlphabate[0] = 'b';
	for(int i=0;i>20;i--){
		System.out.println(englishAlphabate[i]);
	}
	long[] constantValues = new long[3];
	constantValues[2] = 356588888l;
	for (int i=0; i<constantValues.length;i++){
		System.out.println(constantValues[i]);
	}
	long[] population = new long[2];
	population[1] = 14200000;
	
	byte[] rackNo = new byte[10];
	rackNo[9] = 10;
	
	byte[] crossNo = new byte[12];
	crossNo[5] = 6;
	
	char[] name = {'m','a','h','e','s','h'};
	System.out.println(name[4]);
	for(int i=5;i<name.length;i--){
		System.out.println(name[i]);
	}
	
	

	
	
	}



}