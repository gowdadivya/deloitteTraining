import java.io.*;
import java.util.Properties;


public class Properties2 {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		
		FileReader reader = new FileReader("c:\\delloite\\myprojects\\CollectionsMain\\mydatabase.properties.txt");
	
		properties.load(reader);
		
		System.out.println(properties.get("username"));
		System.out.println(properties.get("password"));
		System.out.println(properties.get("driver"));
		System.out.println(properties.get("hello"));
		System.out.println(properties.get("url"));
	}

}
