/*
Class cylinder
Description: convert feet to metres.
Author: Alex Thompson.
Student id: D13129082
Date: 24/09/2014
*/

import java.util.Scanner;  //Scanner is in the java.util package

class feetTometres {

	public static void main(String [] args){

    //Create a Scanner object
	Scanner input = new Scanner(System.in);

	//Prompt the user to enter feet
	System.out.print("Enter feet: ");
	double feet = input.nextDouble();

	double metres = feet*0.305;

	System.out.println("The value is " + "" + metres + "" + "metres");
	System.out.printf("Metres = %.2f", metres); //To restrict to 2 dec places.

    } //end of PSV thing
} //end of class