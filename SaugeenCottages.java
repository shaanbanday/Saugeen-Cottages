/*
Project: ICS3U
Package: decisions
Class: SaugeenCottages
Programmer: Shaan Banday.
Teacher: Mr. Elliott.
Date Created: 16th September, 2020.
Program Description: A program used to calculate the cost of a cottage rental, based on the time of year, the number of time the user is renting for, and if 
they have a SSCR (Saugeen Sunset Cottage Rentals) membership. All these parameters change the final cost.
*/
package intro; //start of package

import java.util.Scanner; //import the scanner method

public class SaugeenCottages //start of class
{
	public static void main(String[] args) //start of main method. Note: only one method is used 
	{
		//Declare all variables
		double price1, finalPrice; //price1 is the price after all calculations, finalPrice is the rounded price
		int startMonth, rentTime, monthlyPrice; //declare both integer variables. One is for the starting month, one is for the number of time the user for renting
		String monthName, isSCCR; //string variable, used to determine if the person has a membership
		
		
		//Initialize all variables needed
		monthlyPrice = 0; //initialize the monthly rate to 0
		price1 = 0; //initialize the calculated price to 0
		monthName = ""; //initialize the month name to ""
		
		
		//Declare all constants
		final double TIME = 0.8; //constant if only the 3+ month discount is applied
		final double MEMBERSHIP = 0.9; //constant if only the membership discount is applied
		final double BOTH = 0.7; //constant if both discounts are applied
		
		
		//Declare all scanners
		Scanner enter = new Scanner(System.in); //scanner for the "Press ENTER to continue
		Scanner checkSCCR = new Scanner(System.in); //scanner to store the input
		
		
		//Introductory statements to inform the user
		System.out.println("Hello, Welcome to the Saugeen Sunset Cottage Rentals!"); //introduction
		System.out.println("Cottage Rental Rates (NOTE: It is based on the starting month):"); //stating that there are different rates
		System.out.println("\tOctober to March: $800\n\tApril to June: $1200\n\tJuly to September: $1600"); //the rates based on starting month
		System.out.println("\n\t20% discount when the cottage is rented for more than three months.\n\t10% Discount for SSCR premium members."); //stating the discounts
		System.out.println("To rent a cottage, press ENTER to continue."); //telling the user to press enter to continue
		enter.nextLine(); //when the user presses enter, execute the next line of code
		
		enter.close();
		
		//Get Information from user
		System.out.println("Can you please input the number of the starting month (1-12), then press ENTER: "); //prompt user for month number
		startMonth = checkSCCR.nextInt(); //store whatever the user inputs
		System.out.println("Can you please input the number of months the cottage is to be rented, then press ENTER: "); //prompt user for how ling they will be renting for
		rentTime = checkSCCR.nextInt(); //store whatever the user inputs
		System.out.println("Do you have an SCCR premimum memberhsip(Y/N)? ");
		isSCCR = checkSCCR.next(); //store whatever the user inputs in the scanner
		char yesNo = isSCCR.charAt(0); //take the first character at index : 0, and store it in a new variable called yesNO
		
		checkSCCR.close();
		
		//switch statements
		switch (startMonth) //a switch statement based on what the starting month is
		{
		   case 1:  //first case
		        monthName = "January"; //if the user inputs 1, the month is January
		        monthlyPrice = 800; //price for starting in January
		        break; //break the case, the parameters above are only valid for this month
		   case 2:  //second case...
		        monthName = "Febuary"; //if the user inputs 2, the month is February
		        monthlyPrice = 800; //price for starting in February
		        break; //break the case, the parameters above are only valid for this month
		   case 3: 
		        monthName = "March"; //if the user inputs 3, the month is March
		        monthlyPrice = 800; //price for starting in March
		        break; //break the case, the parameters above are only valid for this month
		   case 4: 
		        monthName = "April"; //if the user inputs 4, the month is April
		        monthlyPrice = 1200; //price for starting in April, Note: the price changes, since cottage renting becomes more commonplace
		        break; //break the case, the parameters above are only valid for this month
		   case 5: 
		        monthName = "May"; //if the user inputs 5, the month is May
		        monthlyPrice = 1200; //price for starting in May
		        break; //break the case, the parameters above are only valid for this month
		   case 6: 
		        monthName = "June"; //if the user inputs 6, the month is June
		        monthlyPrice = 1200; //price for starting in June
		        break; //break the case, the parameters above are only valid for this month
           case 7: 
		        monthName = "July"; //if the user inputs 7, the month is July
		        monthlyPrice = 1600; //price for starting in July, Note: the price changes, as cottages are even more common that before
		        break; //break the case, the parameters above are only valid for this month
		   case 8: 
		        monthName = "August";//if the user inputs 8, the month is August
		        monthlyPrice = 1600; //price for starting in August
		        break; //break the case, the parameters above are only valid for this month
		   case 9: 
		        monthName = "September"; //if the user inputs 9, the month is September
		        monthlyPrice = 1600; //price for starting in September
		        break; //break the case, the parameters above are only valid for this month
		   case 10: 
		        monthName = "October"; //if the user inputs 10, the month is October Note: the price changes, as cottages are now less common
		        monthlyPrice = 800; //price for starting in October
		        break; //break the case, the parameters above are only valid for this month
		   case 11: 
		        monthName = "November"; //if the user inputs 11, the month is November
		        monthlyPrice = 800; //price for starting in November
		        break; 
		   case 12: //last case
		        monthName = "December"; //if the user inputs 12, the month is December
		        monthlyPrice = 800; //price for starting in December
		        break; 
		   default: //default case
		        System.out.println("Invalid selection for month, make sure it is between 1-and 12!"); //if the user inputs something less than 1, and greater than 12, tell user that their selection is invalid
		} //end of switch statement
		
		
		//decisions
		if ((rentTime >= 1) && (rentTime <=3)) //start of if, this is if the rent time is between 1 and 3, which means no time discount
		{
			if ((yesNo == 'Y') || (yesNo == 'y')) //if a capital Y, or lower case y is inputed, the program will still work
			{
				//calculations
				price1 = monthlyPrice * rentTime * MEMBERSHIP; //calculate price, and apply membership discount
				finalPrice = Math.round(price1*100.0)/100.0; //round the price
				
				//final print statements
				System.out.println("Sunset Cottage Rentals");
				System.out.println("\n\t" + rentTime + " months, starting in " + monthName + ".");
				System.out.println("\tMonthly Rate: $" + monthlyPrice);
				System.out.println("\tDiscount(s): \n\t\t10% (SCCR Membership)");
				System.out.println("\nTotal Cost: $" + finalPrice); //display final price
			}
			else if ((yesNo == 'N') || (yesNo == 'n')) //if a capital N, or lower case n is inputed, the program will still work
			{
				//calculations
				price1 = monthlyPrice * rentTime; //calculate price, but apply no discount
				finalPrice = Math.round(price1*100.0)/100.0; //round the price
				
				//final print statements
				System.out.println("Sunset Cottage Rentals");
				System.out.println("\n\t" + rentTime + " months, starting in " + monthName + ".");
				System.out.println("\tMonthly Rate: $" + monthlyPrice);
				System.out.println("\tDiscount(s): \n\t\tN/A");
				System.out.println("\nTotal Cost: $" + finalPrice); //display final price
			}
			else //case if neither y or n is inputed
			{
				System.out.println("Invalid selection for whether you have a membership or not. Make sure you type 'Y' or 'N'"); //tell user that their selection is invalid
			}	
		}
		else if (rentTime > 3) // this is the case if the rented time is greater than 3, which means a time discount
		{
			if ((yesNo == 'Y') || (yesNo == 'y')) //if a capital Y, or lower case y is inputed, the program will still work
			{
				//calculations
				price1 = monthlyPrice * rentTime * BOTH; //calculate price, and apply both discounts
				finalPrice = Math.round(price1*100.0)/100.0; //round the price
				
				//final print statements
				System.out.println("Sunset Cottage Rentals");
				System.out.println("\n\t" + rentTime + " months, starting in " + monthName + ".");
				System.out.println("\tMonthly Rate: $" + monthlyPrice);
				System.out.println("\tDiscount(s): \n\t\t20% (3+ Months)\n\t\t10% (SCCR Membership)");
				System.out.println("\nTotal Cost: $" + finalPrice); //display final price
			}
			else if ((yesNo == 'N') || (yesNo == 'n')) //if a capital N, or lower case n is inputed, the program will still work
			{
				//calculations
				price1 = monthlyPrice * rentTime * TIME; //calculate price, and apply time discount
				finalPrice = Math.round(price1*100.0)/100.0; //round the price
				
				//final print statements
				System.out.println("Sunset Cottage Rentals");
				System.out.println("Sunset Cottage Rentals");
				System.out.println("\n\t" + rentTime + " months, starting in " + monthName + ".");
				System.out.println("\tMonthly Rate: $" + monthlyPrice);
				System.out.println("\tDiscount(s): \n\t\t20% (3+ Months)");
				System.out.println("\nTotal Cost: $" + finalPrice); //display final price
			}
			else
			{
				System.out.println("Invalid selection for whether you have a membership or not. Make sure you type 'Y' or 'N'"); //tell user that their selection is invalid
			}	
		}
		else 
		{
			System.out.println("Invalid selection for number of months you are going to rent for. Make sure it is a positive number"); //tell user that their selection is invalid
		}
	} // End of main method
} //End of class