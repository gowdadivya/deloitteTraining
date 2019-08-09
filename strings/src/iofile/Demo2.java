package iofile;

import java.io.*;

//streams
public class Demo2 {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("C:\\delloite\\first.txt");
		fw.write("Hello Good Morning!!!");
		FileReader fr = new FileReader("C:\\delloite\\first.txt");
		int i=0;
		while((i = fr.read())!= -1) {
			System.out.println((char)i);
		}
		fw.close();
		fr.close();
		System.out.println("Done");
	}
}
