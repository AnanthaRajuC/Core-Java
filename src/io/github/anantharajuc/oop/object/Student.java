package io.github.anantharajuc.oop.object;

public class Student
{
	//Instance variables
	int id;
	String name; 
	
	public static void main(String[] args)
	{
		//creating an object of Student  
		Student s1 = new Student();
		
		//Printing values of the object  
		 System.out.println(s1.id); //accessing member through reference variable  
		 System.out.println(s1.name);  
	}
}
