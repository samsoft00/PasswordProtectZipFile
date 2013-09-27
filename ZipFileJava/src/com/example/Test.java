package com.example;

public class Test
{

	public static void main(String args[])
	{
		
		Zip zipper= new Zip();
		zipper.create("C:\\programs\\java_file_zip\\test.txt", "C:\\programs\\java_file_zip\\zipped\\test.zip");
		System.out.println("done zipping....");
		
	}
	
}
