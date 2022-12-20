package com.dl.two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Eg4 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("cat.txt");
		System.out.println("Before "+ fis.available());
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		System.out.println("Byte reading "+fis.read());
		System.out.println("After :"+fis.available());

		fis.close();
	}

}
