package JUnitTestPackage;

public class JUnitFunctions {
	
	void AddSum()
	{
	int n1 = 225, n2 = 115, sum;  
	sum = n1 + n2;  
	System.out.println("The sum of numbers is: "+sum);  
	}  
	void TestStringConcatenation1()
    {  
		   String s="Bhargav"+"Raju";  
		   System.out.println(s);  
    }  
	public static void main(String args[])   
	{  
		JUnitFunctions ob = new JUnitFunctions();
		ob.AddSum();
		ob.TestStringConcatenation1();
		
	}
}