/*
Name:  Jeilymar Brady
Assignment:   3
Title: Coffee
Course: CSCE144 
Section: 1 - Hauser
Lab Section: 2 - Hauser
Semester: Spring 2014 
Instructor: Hauser
Date: 27 February 2014
Sources consulted:   
Known Bugs: none
Program Description: Take coffee orders for drive through
Creativity: change drink to plural if more than 1 - 2pts
	    tell user they had invalid input and System.exit(1) - 3 pts
	    Display the user's name in proper form - 3 pts
	    Use System.out.printf - 4 pts
Instructions: javac Coffee.java then java Coffee then follow onscreen instructions
*/

import java.util.Scanner;

public class Coffee
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); 
		
		//identifier declarations
		String first ;		//first name
		String lower ;
		String upper ;
		String choice ;		//drink choice
		String size ;		//drink size
		String caramel ;	//flavoring
		String vanilla ; 	//flavoring
		String cinnamon ;	//flavoring
		String hazelnut ; 	//flavoring
		String summaryMsg = "" ;//Final output
		int number = 1 ;	//number of drinks
		double discount = 0 ;	//possible discount
		double subtotal = 0.0 ; //total before tax
		final double TAX_RATE = 9.4 ;
		
		//greet the customer and ask for their first name
		System.out.println("Welcome to Caffeinator's") ;
		System.out.print("Please enter your first name: ") ;
		first = keyboard.nextLine() ;
		lower = first.toLowerCase() ;
		upper = first.toUpperCase() ;
		//CREATIVITY: Display the user's name in proper form
		first = upper.charAt(0) + lower.substring(1) ;
		
		//display current drink options, sizes and prices
		System.out.println( "\nHere are our current drink options (Syrup flavors are $1.00 each):" ) ;
		System.out.println( "DRINK\t\tSMALL\t\tMEDIUM\t\tLARGE" ) ;
		System.out.println( "Espresso\t\t$1.00\t\t$1.50\t\t$2.00" ) ;
		System.out.println( "Latte\t\t$2.00\t\t$2.50\t\t$3.00") ;
		System.out.println( "Cappuccino\t\t$2.50\t\t$3.00\t\t$3.50" ) ;
		System.out.println( "Mocha\t\t$3.00\t\t$3.50\t\t$4.00" ) ;
		
		//get customer's drink selection
		System.out.println( "\nWhat drink would you like?" ) ;
		System.out.print( "(E)spresso, (L)atte, (C)appuccino, (M)ocha	(please enter E, L, C, or M): " ) ;
		choice = keyboard.nextLine() ;
		
	 	//CREATIVITY: tell user they had invalid input and System.exit(1)
		if ( choice.charAt(0) != 'E' && choice.charAt(0) != 'L' && choice.charAt(0) != 'C' && choice.charAt(0) != 'M' ) {
			if ( choice.charAt(0) != 'e' && choice.charAt(0) != 'l' && choice.charAt(0) != 'c' && choice.charAt(0) != 'm' ) {
				System.out.print("Please enter E, L, C, or M.\n") ;
				System.exit(1) ;
			}
		}
	
		//get customer's size selection				
		System.out.print( "(S)mall, (M)edium or (L)arge  (please enter S, M or L): " ) ;
		size = keyboard.nextLine() ;
		size.charAt(0) ;
		
		//CREATIVITY: tell user they had invalid input and System.exit(1)
		if ( size.charAt(0) != 'S' && size.charAt(0) != 'M' && size.charAt(0) != 'L' ) {
			if ( size.charAt(0) != 's' && size.charAt(0) != 'm' && size.charAt(0) != 'l' ) {
				System.out.print("Please enter S, M, L.\n") ;
				System.exit(1) ;
			}
		}
		
		//update subtotal and summary message based on drink choice
		if ( choice.charAt(0) == 'E' || choice.charAt(0) == 'e' ) {
			subtotal  = 1 ;
			summaryMsg = "Espresso" ;
		}  else if ( choice.charAt(0) == 'L' || choice.charAt(0) == 'l' ) {
			subtotal = 2 ;
			summaryMsg = "Latte" ;
		} else if ( choice.charAt(0) == 'C' || choice.charAt(0) == 'c' ) {
			subtotal = 2.5 ;
			summaryMsg = "Cappuccinio" ;
		} else if ( choice.charAt(0) == 'M' || choice.charAt(0) == 'm' ) {
			subtotal = 3 ;
			summaryMsg = "Mocha" ;
		}
		
		//inquire if the customer wants any syrup flavors added to their drink
		//update subtotal and summary message based on flavoring
		//CREATIVITY: tell user they had invalid input and System.exit(1)
		System.out.println( "Syrup Flavors ($1.00 each): " ) ;
		System.out.print("Caramel (Y/N): ") ;
		caramel = keyboard.nextLine() ; 
		if ( caramel.charAt(0) == 'Y' || caramel.charAt(0) == 'y' ) {
			subtotal = subtotal + 1 ;
			summaryMsg = "caramel " + summaryMsg ;
		}  else if ( caramel.charAt(0) != 'N' && caramel.charAt(0) != 'n' ) {
			System.out.print("Please enter Y or N") ;
			System.exit(1) ;
		} 
		
		System.out.print( "Vanilla (Y/N): " ) ;
		vanilla = keyboard.nextLine() ; 
		if ( vanilla.charAt(0) == 'Y' || vanilla.charAt(0) == 'y' ) {
			subtotal = subtotal + 1 ;
			summaryMsg = "vanilla " + summaryMsg ;
		} else if ( vanilla.charAt(0) != 'N' && vanilla.charAt(0) != 'n' ) {
			System.out.print("Please enter Y or N") ;
			System.exit(1) ;
		} 
		
		System.out.print( "Cinnamon (Y/N): " ) ;
		cinnamon = keyboard.nextLine() ;
		if ( cinnamon.charAt(0) == 'Y' || cinnamon.charAt(0) == 'y' ) {
			subtotal = subtotal + 1 ;
			summaryMsg = "cinnamon " + summaryMsg ;
		} else if ( cinnamon.charAt(0) != 'N' && cinnamon.charAt(0) != 'n' ) {
			System.out.print("Please enter Y or N") ;
			System.exit(1) ;
		} 
		
		System.out.print( "Hazelnut (Y/N): " ) ;
		hazelnut = keyboard.nextLine() ;
		if ( hazelnut.charAt(0) == 'Y' || hazelnut.charAt(0) == 'y' ) {
			subtotal = subtotal + 1 ;
			summaryMsg = "hazelnut " + summaryMsg ;
		} else if ( hazelnut.charAt(0) != 'N' && hazelnut.charAt(0) != 'n' ) {
			System.out.print("Please enter Y or N") ;
			System.exit(1) ;
		} 
		
		//update subtotal and summary message according to size
		if ( size.charAt(0) == 'M' || size.charAt(0) == 'm' ) {
			subtotal = subtotal + 0.5 ;
			summaryMsg = "medium " + summaryMsg ;
		}
		if ( size.charAt(0) == 'L' || size.charAt(0) == 'l' ) {
			subtotal = subtotal + 1 ;
			summaryMsg = "medium " + summaryMsg ;
		} else 
			summaryMsg = "small " + summaryMsg ;
		
		//get number of drinks
		System.out.println( "How many of these drinks would you like? " ) ;
		number = keyboard.nextInt() ;
		
		//CREATIVITY: change drink to plural if more than 1
		if (number > 1) 
			summaryMsg = number + " " + summaryMsg + "s" ;
		
		//COMPUTE the subtotal
		subtotal = subtotal * number ;
		
		//determine if the customer has earned any discounts
		if ( first.equalsIgnoreCase( "George" ) || first.equalsIgnoreCase( "Martha" ) || subtotal >= 5 ) {
			discount = subtotal * 0.10 ;
		}
		
		//calculate the total due taking into account any discounts and local sales tax
		double cost = subtotal - discount ;
		double tax = cost / TAX_RATE ;
		double total = cost + tax ;
		
		//display a summary of what they ordered as well as itemized list of charges, discounts, taxes and total due
		System.out.printf( first + ", your order is as follows:\n$%.2f\t" + summaryMsg, subtotal) ;
		
		if ( subtotal > 5 ) {
			System.out.printf( "\n-$%.2f\t10.0 percent discount for placing an order over $5.00\n", discount ) ;
		} else if 
			( first.equalsIgnoreCase( "George" ) ) {
			System.out.printf( "\n-$%.2f\t10.0 percent discount for having the name George\n", discount ) ;
		} else if 
			( first.equalsIgnoreCase( "Martha" ) ) {
			System.out.printf( "\n-$%.2f\t10.0 percent discount for having the name Martha\n", discount ) ;
		}
		
		System.out.printf( "\nThat will be $%.2f plus $%.2f sales tax for a total of $%.2f \nThanks!\n", cost, tax, total ) ; 
		
	}		
}
