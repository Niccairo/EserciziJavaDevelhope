/**
 * This class contains methods to manipulate words and names 
 * 
 * @author Niccolò Cairone
 */
package com.develhope.javaDoc;

public class WordGames {
	/**
	 * This method add the string "Hello " to the given word
	 * @param word  The word to which "Hello" will be added
	 * @return a string with Hello followed by the input word
	 */
	public String addHelloWord(String word) {
		return "Hello " + word;
	}
	/**
	 * This method concatenate the two input variables
	 * @param name first name
	 * @param surname last name
	 * @return a string with the full name
	 */
	public String getFullName(String name, String surname) {
		return name + " " + surname;
	}
}
