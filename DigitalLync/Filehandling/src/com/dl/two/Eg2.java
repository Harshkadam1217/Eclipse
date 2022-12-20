package com.dl.two;
import java.io.FileInputStream;
//import java.io.FileReader;
import java.io.IOException;

public class Eg2 {

	public static void main(String[] args)throws IOException {
//		FileReader reader= new FileReader("cat.txt");
//		int i;
//		while((i=reader.read())!=-1) {
//			System.out.print((char)i);
//		}
//		reader.close();
//
//		FileInputStream fis=new FileInputStream("cat.txt");
//		int i1;
//		while((i1=fis.read())!=-1) {
//			System.out.print((char)i1);
//		}
//		fis.close();
		
		FileInputStream fis=new FileInputStream("cat.txt");
		System.out.println(fis.available());
		int b=fis.available();
		int a;
		for(int i=0;i<b;i++) {
			a=fis.read();
			if(a==32) {
				System.out.print(" ");
				
			}
			else
				System.out.print((char)a);
		}
		System.out.println(" ");
		System.out.print(fis.available());
		fis.close();
		
	}

}
