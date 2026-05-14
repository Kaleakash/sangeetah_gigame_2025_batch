package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//		// TODO Auto-generated method stub
//		Employee emp1 = new Employee(100, "Raj", 34000);
//		System.out.println(emp1);
//		
//		// auto GC
//		
//		FileOutputStream fos = new FileOutputStream("employee.ser");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp1);
//		
//		System.out.println("Object serialization done successfully");
		
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee)ois.readObject();	// type casting 
		System.out.println(emp2);
		System.out.println(emp2.getName());
		System.out.println("Object De-serialization done successfully");
	}

}
