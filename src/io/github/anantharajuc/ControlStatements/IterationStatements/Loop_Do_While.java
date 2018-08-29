package io.github.anantharajuc.ControlStatements.IterationStatements;

//do-while evaluates its expression at the bottom of the loop.
//statements within the do block are always executed at least once.

public class Loop_Do_While
{
	public static void main(String[] args)
	{
		int count = 11;
		
		do 
		{
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

	}
}
