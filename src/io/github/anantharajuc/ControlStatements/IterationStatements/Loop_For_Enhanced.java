package io.github.anantharajuc.ControlStatements.IterationStatements;

//for iteration through Collections and arrays 

public class Loop_For_Enhanced
{
	public static void main(String[] args)
	{
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for (int item : numbers) 
		{
            System.out.println("Count is: " + item);
        }
	}
}
