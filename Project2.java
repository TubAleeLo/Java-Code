/*
 * Title: 		Project 2 - Bookstore Order Calculator
 * Class: 		CS 1323
 * Instructor: 	Dr. Trytten
 * Author: 		Tub A. Lo - 113526300
 * Date: 		09/12/2022
 */
public class Project2 {

	public static void main(String[] args) {
		
		// String variables used to store the title of the books.
		String book1Title = "Three Sisters";
		String book2Title = "Song of Solomon";
		String book3Title = "Owls Don't Have to Mean Death";
		
		// String variables used to store the author of the books.
		String book1Author = "Bi Feiyu";
		String book2Author = "Toni Morrison";
		String book3Author = "Chip Livingston";
		
		// Double variables used to store the prices of the books.
		double book1Price = 18.99;
		double book2Price = 11.99;
		double book3Price = 80.50;
		
		// Int variables used to store the number of each book sold.
		int numOfBook1Sold = 2;
		int numOfBook2Sold = 4;
		int numOfBook3Sold = 1;
		
		// Fix tax rate.
		final double TAX_RATE = 8.75 * 0.01;
		
		// Double variables used to store the different sales values.
		double preTaxSales = 0;
		double salesTax = 0;
		double totalOrderCost = 0;
		
		// Calculation for pre-tax sales.
		preTaxSales = (book1Price * numOfBook1Sold) + (book2Price * numOfBook2Sold) + (book3Price * numOfBook3Sold);
		// Calculation for sales tax.
		salesTax = preTaxSales * TAX_RATE;
		//Calculation for total order cost.
		totalOrderCost = preTaxSales + salesTax;
		
		// Print output.
		System.out.println("Purchase " + numOfBook1Sold + " copies of " + book1Title + ", " + book1Author + ". Each copy costs $" + String.format("%.2f", book1Price)+ ".\n"
							+ "Purchase " + numOfBook2Sold + " copies of " + book2Title + ", " + book2Author + ". Each copy costs\n"
							+ "$"+ String.format("%.2f", book2Price) + ".\n"
							+ "Purchase " + numOfBook3Sold + " copy of " + book3Title + ", " + book3Author + ". Each\n"
							+ "copy costs $" + String.format("%.2f", book3Price) + ".\n"
							+ "Total before tax: $" + String.format("%.2f", preTaxSales) + "\n"
							+ "Sales tax: $" + String.format("%.2f", salesTax) + "\n"
							+ "The total cost of your order will be $" + String.format("%.2f", totalOrderCost));
	
		// Alternative that I wrote.
		/*System.out.printf(
				"Purchase %d copies of %s, %s. Each copy cost $%5.2f.\n"
				+ "Purchase %d copies of %s, %s. Each copy cost\n$%5.2f.\n"
				+ "Purchase %d copy of %s, %s. Each\ncopy cost $%5.2f.\n"
				+ "Total before tax: $%5.2f\n"
				+ "Sales tax: $%5.2f\n"
				+ "The total cost of your order will be $%5.2f", 
				numOfBook1Sold, book1Title, book1Author, book1Price, 
				numOfBook2Sold, book2Title, book2Author, book2Price,
				numOfBook3Sold, book3Title, book3Author, book3Price,
				preTaxSales, salesTax, totalOrderCost);
		*/
		
		
	}

}
