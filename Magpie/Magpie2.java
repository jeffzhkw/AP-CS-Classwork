package Magpie;/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

import java.util.Random;

public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if (statement.indexOf("hobby")>=0) {
			response = getRandomHobbyResponse();
		}
		else
		
		{
			response = getRandomResponse();
		}
		
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	
	private String getRandomResponse()
	{
		
		Random rng =new Random();
		
		final int NUMBER_OF_RESPONSES = 4;
		double r = rng.nextDouble();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String [] response = new String[4];
		
		response[0] = "I like playing Counter-Strike.";
		response[1] = "Hmmm.";
		response[2] = "Do you really think so?";
		response[3] = "You don't say.";
		


		return response[whichResponse];
	}
	
	
	private String getRandomHobbyResponse()
	{
		
		Random rng =new Random();
		
		final int NUMBER_OF_RESPONSES = 2;
		
		double r = rng.nextDouble();
		
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String [] response = new String[NUMBER_OF_RESPONSES];
		
		response[0] = "I like Rush B.";
		response[1] = "I like playing Counter-Strike.";
		
		return response[whichResponse];
	}
}
