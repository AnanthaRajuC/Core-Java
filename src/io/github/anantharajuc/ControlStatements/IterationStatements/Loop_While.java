package io.github.anantharajuc.ControlStatements.IterationStatements;

//The while statement continually executes a block of statements while a particular condition is true.
//The while statement evaluates expression, which must return a boolean value.

public class Loop_While
{
	public static void main(String[] args)
	{
		int count = 8;
		
        while (count < 11) 
        {
            System.out.println("Count is: " + count);
            count++;
        }
	}
}
