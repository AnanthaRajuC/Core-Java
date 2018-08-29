package io.github.anantharajuc;

import java.lang.String;

public class Member_Variables
{
	//Instance variables - declared in a class but outside a method
	String iv1 = "Java";
	
	//Class variable - also called as static variables. These variables have only one copy that is shared by all the different objects in a class. 
	static int iv2 = 5;
	
	public static void main(String[] args)
	{
		//Local variable - declared within the method of a class.
		int lv = 3;
		
		System.out.println("Local Variable " +lv);
		
		Member_Variables mv = new Member_Variables();		
		System.out.println("Instance Variable 1 : "+mv.iv1);
		
		System.out.println("Instance Variable 2 : "+iv2);
	}
}
