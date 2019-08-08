import java.util.Scanner;

public class Sum {
	int a, b, c;
	Scanner sc = new Scanner(System.in); 
	
	
	public static void main(String args[]) {
		System.out.println("enter the two numbers");
		Sum sum = new Sum();
		sum.add();
		
		}
	public void add() {
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("the sum is "+c);
	}
	

}
