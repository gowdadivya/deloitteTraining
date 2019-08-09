package strings;
import java.util.StringTokenizer;

public class Strings {
	public static void main(String args[]) {
		String name = "Divya:Shivani:Sham:Ishi:Aadi";
		StringTokenizer tokenizer = new StringTokenizer(name,":");
		System.out.println(tokenizer.countTokens());
		while(tokenizer.hasMoreTokens()) {
			String rev = new String();
			rev = tokenizer.nextToken(name);
			String []new1 = new String[10];
			for(int i =0;i<10;i++) {
			new1[i] = tokenizer.nextToken(name);
			}
	        for(int j =5;j>0;j--) {
	        	System.out.println(new1[j]);
	        }
		}
	}
}

