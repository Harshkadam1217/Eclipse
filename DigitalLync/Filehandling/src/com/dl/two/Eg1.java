package com.dl.two;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
public class Eg1 {

	public static void main(String[] args)throws IOException {
		
		//Character passing
		FileWriter write=new FileWriter("C://Eclipse//DigitalLync//Filehandling/cat.txt");
		write.write("Hello this is harsh and you are reading file created by me 1"+"\n");
		write.close();
		System.out.println("File Created and Data Inserted");
	
		//Byte
		FileOutputStream stream=new FileOutputStream("C://Eclipse//DigitalLync//Filehandling/cat.txt",true);
		String s2="Hello this is harsh and you are reading file created by me 2"+"\n";
		String s3="Hello this is harsh and you are reading file created by me 3"+"\n";
		String s4="Hello this is harsh and you are reading file created by me 4"+"\n";
		String s5="Hello this is harsh and you are reading file created by me 5"+"\n";

		
		byte[] bytes=s2.getBytes();
		stream.write(bytes);
		bytes=s3.getBytes();
		stream.write(bytes);
		bytes=s4.getBytes();
		stream.write(bytes);
		bytes=s5.getBytes();
		stream.write(bytes);
		System.out.println(bytes.length);
		System.out.println("New File Created and Inserted");
		stream.close();

	}

}
