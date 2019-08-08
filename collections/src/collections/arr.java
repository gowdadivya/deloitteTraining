package collections;
 
//Wrapper class
// boxing, unboxing, auto boxing and auto unboxing


public class arr {
	
	public static void main(String[] args) {
		String n = "90";
		int i = Integer.parseInt(n);
		System.out.println(i+5);
		
		int n1=999;
		Integer n2 = new Integer(n1);
		
		int n3 = n2.intValue();
	}

}
