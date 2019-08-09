package iofile;

import java.io.File;
import java.io.IOException;

public class filedemo {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\delloite\\batch");
		File f2 = new File("C:\\delloite\\batch\\student");
		File f3 = new File("C:\\delloite\\batch\\batchmates.txt");
	
		if (f1.exists()) {
			File allFiles[]=f1.listFiles();
			for(File temp : allFiles){
				if(temp.isDirectory()) {
					System.out.println(temp + "is directory" );
				} else {
					System.out.println(temp + " is file");
				}
			}
		}
			else {
					f1.mkdir();
					f2.mkdir();
					f3.createNewFile();
					System.out.println("files and folders created");
					
				}
	}
}