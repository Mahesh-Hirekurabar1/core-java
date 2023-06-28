public class railwayStation{
public static void main(String[] arrgs){
	getAddition(65,6);			//Adding, executing int,int values and printing.
    getAddition(8,6,5);			//Adding, executing int,int,int values and printing.
	getAddition(18,52.4d);		//Adding, executing int,float values and printing.
	getAddition((byte)66,13);	//Adding, executing byte,int values and printing.
	getAddition(79,(short)64);	//Adding, executing int,short values and printing.
	getAddition((short)15,35);	//Adding, executing short,int values and printing.
    sub(12,156);					//Substracting, executing int,int values and printing.
	sub(2,110,51);				//Substracting, executing int,int,int values and printing.
	sub((byte)10,10d);	//Substracting, executing byte,double values  and printing.
	sub(20,(short)5);			//Substracting,executing int,short values and printing.
	sub(30,(byte)10);			//Substracting,executing int,byte values and printing.
	sub((byte)20,20);			//Substracting,executing byte,int values and printing.
	mul("benglore");				//executing string value
	mul("bat","ball");		//executing string,string values
	mul(75,60.4f);				//executing int,float values 
	mul("Mahesh",28);			//executing string,int values
	mul("Rohit",(byte)24);	//executing string,byte values
	mul(45.6f,60);				//executing float,int values

}
//First method Start
public static int getAddition(int value1,int value2)
{
	
	System.out.println("Adding two values="+(value1+value2));
	return value1*value2;
}

public static int getAddition(int value1,int value2,int value3)
{
	
    System.out.println("Adding three values="+(value1+value2+value3));	
	return value1*value2*value3;
	
}

public static double getAddition(int value1,double value2)
{

	System.out.println("Adding different data type values="+(value1+value2));
	return value1*value2;
}

public static int getAddition(byte value1,int value2)
{
	
	System.out.println("Adding two different Data values="+(value1+value2));
	return value1*value2;
	
}

public static int getAddition(int value1,short value2)
{
	
	System.out.println("Addition of two numbers="+(value1+value2));
	return value1*value2;
}

public static int getAddition(short value1,int value2)
{
	
	System.out.println("Addition="+(value1+value2));
	return value1*value2;
	
}

//Second Method Start
public static void sub(int a,int b)
{
	System.out.println("Substraction of a-b="+(a-b));
}

public static void sub(int a,int b,int c)
{
	System.out.println("Giving 3Inputs for Substraction="+(a-b-c));
}


public static void sub(byte a,double b)
{
	System.out.println("Substraction Of Two numbers="+(a-b));

}

public static void sub(int a,short b)
{
	System.out.println("subtraction="+(a-b));

}


public static void sub(int a,byte b)
{
	System.out.println("subtraction="+(a-b));

}

public static void sub(byte a,int b)
{
	System.out.println("subtraction="+(a-b));

}

//Third Method Start
public static void mul(String name)
	{
		System.out.println("My self Mahesh");
	}
	public static void mul(String firstName,String surName)
	{
		System.out.println("Mahesh Hirekurabar");
	}
	public static void mul(int value1 , float value2 )
	{
		System.out.println("I'm Good boy");
	}

	public static void mul(String name , int value)
	{
		System.out.println("Given task is done!!!");
	}
	public static void mul(String name , byte value)
	{
		System.out.println("Hi Everyone");
	}
	public static void mul(float value1 , int value2)
	{
		System.out.println("Good bye Everyone");
	}
	

}