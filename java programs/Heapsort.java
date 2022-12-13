package com.chatapp;
import java.util.*;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Server 
{
	ServerSocket server;
	Socket socket;
	BufferedReader br;
	PrintWriter out;
	
	
	//Constructor..
	
	
	public Server()
	{
		try 
		{
			server=new ServerSocket(7777);
			System.out.println("Server is ready to accept connection");
			System.out.println("Waiting...");
			socket=server.accept();
			
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new PrintWriter(socket.getOutputStream()); 
			startReading();
			startWriting();
			
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	 
	
	public void startReading()
	{
		//thread-read karke deta rahega
		
		Runnable r1=()->
		{ 
			
			System.out.println("Reader started..");
			while(true)
			{
				try 
				{
					String msg=br.readLine();
					if(msg.equals("Exit"))
					{
						System.out.println("Client terminated the chat");
						break;
					}
					System.out.println("Client : "+ msg);
				} catch (IOException e) 
				{
					
					e.printStackTrace();
				}
			}
		};
		
		new Thread(r1).start();
	}
	
	
	
	
	
	
	
	
	
	
	public void startWriting() 
	{
		//thread -data user lega and the send karega client tak 
		Runnable r2=()->
		{
			System.out.println("Writer started...");
			while(true)
				try {
					
					BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
					String content=br1.readLine();
					out.println(content);
					out.flush();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		};
		
		new Thread(r2).start();
	}
	
	

	public static void main(String[] args) 
	{
		System.out.println("This is server ..going to start server");

		new Server(); 
	}

}