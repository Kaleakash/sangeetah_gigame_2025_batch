package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PrimitiveReadAndWriteOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		int id=100;
//		String name = "Raj";
//		float salary = 34000;
//		
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		System.out.println("Data Stored");
//		dos.close();
//		fos.close();
		
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int id = dis.readInt();
		String name = dis.readUTF();
		float salary = dis.readFloat();
		System.out.println(id+" "+name+" "+salary);
	}

}
