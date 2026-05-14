package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWiseExamples {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("abc.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("xyz1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch;
		
		while((ch = bis.read()) != -1) {
//			bis.skip(ch);
//			System.out.println(ch+" "+(char)ch);
			//fos.write(ch);
			bos.write(ch);
		}
		bos.flush();
		fos.close();
		fis.close();
	}

}
