package formative.controller;
import javax.swing.*;

import formative.model.*;

public class MajorFormativeController 
{

	public String message;
	public String input;
	public JOptionPane startWindow = new JOptionPane();
	public MajorFormativeModel model;
	public String[] majors = new String[5];
	
	public MajorFormativeController()
	{
		message = "Type in the first letter of your major and then do a number after it for what year\n"
				+ "you are at Ex. M2 = Mathimatics sophomore, ";
		majors[0] = "M";
		majors[1] = "C";
		majors[2] = " I";
		majors[3] = "E";
		majors[4] = "T";
		
	}

	@SuppressWarnings("static-access")
	public void start()
	{
		
		input = startWindow.showInputDialog(message);
		interpret(); 
		
	}
	
	public String interpret()
	{
		
		
		String output = " Your major is" + major(input.substring(0,1)) +"\n"
				+ "You are a " + year(input.substring(1,2));
		
		return output;
		
		
	}
	
	/**
	 * This method takes the input and matches it with a list through a loop to get their major.
	 * @param userMajor
	 * @return 
	 */
	public String major(String inputMajor)
	{
		String userMajor = "";
		if(inputMajor == majors[0])
		{
			userMajor = "Mathematics";
		}
		
		else
		{
			
		
		for(int index = 1; index < majors.length; index++)
		{
			if(inputMajor == majors[1])
			{
				userMajor = "Computer Science";
			}
			else if(inputMajor == majors[2])
			{
				
				userMajor = " Information Technology";
			}
			
			else if(inputMajor == majors[3])
			{
				
				userMajor = "English";
			}
			
			else if(inputMajor == majors[4])
			{
				
				userMajor = "Teacher";
			}

			else
			{
				
				userMajor = "Thats not a major:(";
			}
			
		}
		}
		return userMajor;
		
	}
	
	/**
	 * This method takes the second user number and parses it to a string and tests it to see what year they are.
	 * @param userYear
	 * @return the year they are at.
	 */
	public String year(String inputYear)
	{
				int intYear = Integer.parseInt(inputYear);
		
		
		
		
		String userYear = "";
		
		if(intYear == 1)
		{
			userYear = "FreshMan";
		}
		
		else if(intYear == 2 )
		{
			userYear = "Sophmore";
		}
		
		else if(intYear == 3)
		{
			userYear = "Junior";
		}
		
		else if(intYear == 4) 
		{
			userYear = "Senior";
		}
		
		
		else
		{
			userYear = "Not a year in colledge. ";
		}
		
		
		return userYear;
	
	}

	
	
	
	

	 
	
	

}
