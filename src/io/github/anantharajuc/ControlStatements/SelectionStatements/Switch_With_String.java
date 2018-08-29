package io.github.anantharajuc.ControlStatements.SelectionStatements;

public class Switch_With_String
{
	public static void main(String[] args)
	{
		String dayOfWeek = "Sunday";
		String typeOfDay;

		switch (dayOfWeek)
		{
			case "Monday":
				typeOfDay = "Start of work week";
				System.out.println(typeOfDay);
				break;

			case "Tuesday":
			case "Wednesday":
			case "Thursday":
				typeOfDay = "Midweek";
				System.out.println(typeOfDay);
				break;

			case "Friday":
				typeOfDay = "End of work week";
				System.out.println(typeOfDay);
				break;

			case "Saturday":
			case "Sunday":
				typeOfDay = "Weekend";
				System.out.println(typeOfDay);
				break;

			default:
				System.out.println("Invalid day of the week: " + dayOfWeek); 
		}
	}
}
