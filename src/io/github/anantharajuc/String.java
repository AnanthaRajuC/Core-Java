package io.github.anantharajuc;

public class String
{

	public static void main(java.lang.String[] args)
	{
		java.lang.String text1 = "Hello World!"; 
		java.lang.String text2 = "Hello Java!"; 
		
		System.out.println("Text : "+ text1);
		
		//length() method tells the length of the string. It returns count of total number of characters present in the String.
		System.out.println("string length is: "+text1.length());  
		
		System.out.println(text1.compareTo(text2));
		
		
	}
}
