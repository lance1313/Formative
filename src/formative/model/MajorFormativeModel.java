package formative.model;
import formative.controller.*;

public class MajorFormativeModel 
{
	public MajorFormativeController controller;
	public String[] majors = new String[5];
	public MajorFormativeModel()
	{
		majors[0] = "M";
		majors[1] = "C";
		majors[2] = " I";
		majors[3] = "E";
		majors[4] = "T";
		interpret();
	}
	
		public String interpret()
		{
			
			
			String output = " Your major is" + major(controller.input.substring(1)) +"\n"
					+ "You are a " + year(controller.input.substring(2));
			
			return output;
			
//			return "Your major is" + major(controller.input.substring(1)) +"\n"
//					+ "You are a " + year(controller.input.substring(2));
			
		}
		
		/**
		 * This method takes the input and matches it with a list through a loop to get their major.
		 * @param userMajor
		 * @return what major they are in
		 */
		public String major(String inputMajor)
		{
			String userMajor = "";
			for(int index = 0; index < majors.length; index++)
			{
				if(inputMajor == majors[index])
				{
					userMajor = "";
				}
				
				
				return inputMajor;
				
				
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
