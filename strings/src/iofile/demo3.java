package iofile;

import java.io.*;

//streams
public class demo3 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fw = new FileOutputStream("C:\\delloite\\first.txt");
		fw.write(100);
		FileInputStream fr = new FileInputStream("C:\\delloite\\first.txt");
		int i=0;
		while((i = fr.read())!= -1) {
			System.out.println((char)i);
		}
		fw.close();
		fr.close();
		System.out.println("Done");
	}
}
