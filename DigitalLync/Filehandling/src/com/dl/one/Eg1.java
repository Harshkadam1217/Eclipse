package com.dl.one;
import java.io.File;
import java.io.IOException;
public class Eg1 {

	public static void main(String[] args)throws IOException {
		//relative
//		File file=new File("cat.txt");
//		file.createNewFile();
//		System.out.println("File Created");
		
		//relative
		File file=new File("src/ant.txt");
		file.createNewFile();
		System.out.println("File created");
		
		//Absolute
//		File file=new File("C://Eclipse//Filehandling/dog.txt");
//		file.createNewFile();
//		System.out.println("File Created");
		
		

	}

}
