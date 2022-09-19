/*
 * Title:		Project 3: Yarn Ball Converter
 * Class:		CS 1323/1324 Fall 2022
 * Professor:	Dr. Trytten
 * Name:		Tub A. Lo
 * Student ID:	113526300
 * Date:		09/19/2022
 */

import java.util.Scanner;
public class Project3 {
	
	public static void main(String[] args) {
		
		// Scanner object used to read in user input.
		Scanner userInput = new Scanner(System.in);
		
		// Variables used to store data in respect to name of variable.
		String nameOfMainYarn = "";
		String nameOfSubYarn = "";
		int numberOfBallsRequired = 0;
		double yardsPerBallOfMainYarn = 0.0;
		double yardsPerBallOfSubYarn = 0.0;
		double yardsOfYarnNeeded = 0.0;
		double numberOfBallsNeededToBuy = 0.0;
		long roundedNumberOfBallsNeededToBuy = 0;
		
		// Prompting the user for their input and storing the data into their respective variables.
		System.out.println("Eneter the name of the yarn specified by your pattern.");
		nameOfMainYarn = userInput.nextLine();
		
		System.out.println("Enter the number of balls of " + nameOfMainYarn + " that are required.");
		numberOfBallsRequired = userInput.nextInt();
		
		System.out.println("Enter the number of yards per ball of " + nameOfMainYarn + ".");
		yardsPerBallOfMainYarn = userInput.nextDouble();
		
		// Ensuring that the input above is read and not skipped.
		userInput.nextLine();
		
		System.out.println("Enter the name of the substitute yarn.");
		nameOfSubYarn = userInput.nextLine();
		
		System.out.println("Enter the number of yards per ball of " + nameOfSubYarn + ".");
		yardsPerBallOfSubYarn = userInput.nextDouble();
		
		// Closing the scanner object.
		userInput.close();
		
		// Calculate how many yards of yarn is needed.
		yardsOfYarnNeeded = numberOfBallsRequired * yardsPerBallOfMainYarn;
		
		// Calculate the number of balls of substitute yarn needed to buy.
		numberOfBallsNeededToBuy = yardsOfYarnNeeded / yardsPerBallOfSubYarn;
		
		// Rounding number of balls of the substitute yarn, that is needed to buy.
		roundedNumberOfBallsNeededToBuy = Math.round(numberOfBallsNeededToBuy);
		
		// Displaying the number of balls of the substitute yarn needed instead of the main yarn.
		System.out.println("You should purchase " + roundedNumberOfBallsNeededToBuy + " balls of " + nameOfSubYarn + " instead of " + numberOfBallsRequired + " balls of " + nameOfMainYarn +".");
		
	}
	
}
