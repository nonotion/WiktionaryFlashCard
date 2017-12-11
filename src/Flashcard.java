/**
 * This project is a quizzing program for Russian language verb conjugations. It loads the verbs
 * and conjugations from a text file assembled by a python script that scrapes the english language wikitionary.
 * Each conjugation is in a separate file with aligned line numbers such that the nth element of i.e. the file 
 * "russ 1pl.txt" is the 1st person plural conjugation of the nth element of "Russian Verbs.txt".
 */
import java.io.File;
import java.util.Random;
/**
 * @author Alan & Ziyang
 *
 */
public class Flashcard {
	private static final String verbs = "Russian Verbs.txt";
	private static final String verb1stPerson = "russ 1.txt";
	private static final String verb1stPersonPl = "russ 1pl.txt";
	private static final String verb2ndPerson = "russ 2.txt";
	private static final String verb2ndPersonPl = "russ 2pl.txt";
	private static final String verb3rdPerson = "russ 3.txt";
	private static final String verb3rdPersonPl = "russ 3pl.txt";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while(showFlashcard()) {
		}
	}
	/**
	 * Returns a random line from a file specified in a 2 element array. 
	 * The other element is the line number in the file.
	 * @param filename
	 * @return Returns a random lineand line number  from a file specified.
	 */
	public static String[] getRandomLine(String filename){
		return null;
	}
	
	public static boolean showFlashcard() {
		//Choose random from list
		Random rand = new Random();
		int lineNumber = 0;
		
		
		boolean plural = false;
		/* Choose random number between 1 and 6. 1 is 1st person, 2 is 2nd person,
		 *  3 is third, 4 is 1st person plural. 5th is 2nd person plural, 6th is 3rd person plural. */
		int person = rand.nextInt(5) + 1;
		if (person > 3 ) {
			plural = true;
		} else {
			plural = false;
		}
		//word to quiz on
		String word = "";
		//Prompt
		if (!plural) {
			if (((person % 3) + 1) == 1) {
				System.out.println("1st person singular of \"" + word + "\":");
			}
			if (((person % 3) + 1) == 2) {
				System.out.println("2nd person singular of \"" + word + "\":");
			}
			if (((person % 3) + 1) == 3) {
				System.out.println("3rd person singular of \"" + word + "\":");
			}
		} else {
			if (((person % 3) + 1) == 1) {
				System.out.println("1st person plural of \"" + word + "\":");
			}
			if (((person % 3) + 1) == 2) {
				System.out.println("2nd person plural of \"" + word + "\":");
			}
			if (((person % 3) + 1) == 3) {
				System.out.println("3rd person plural of \"" + word + "\":");
			}
		}
		//input scanner goes here:
		String userInput = "";
		
		return false;
	}
 
}

