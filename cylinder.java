/*
Class cylinder
Description: compute vol of a cylinder.
Author: Alex Thompson.
Student id: D13129082
Date: 24/09/2014
*/

import java.util.Scanner;  //Scanner is in the java.util package

class cylinder {

	public static void main(String [] args){

    //Create a Scanner object
	Scanner input = new Scanner(System.in);

	//Prompt the user to enter r and l of cyl
	System.out.print("Enter radius: ");
	double radius = input.nextDouble();
	System.out.print("Enter length: ");
	double length = input.nextDouble();

	double area = radius*radius*Math.PI;
	double volume = area*length;

	System.out.println("The volume of the cylinder is " + "" + volume);
	System.out.printf("Volume = %.2f", volume); //To restrict to 2 dec places.

    } //end of PSV thing
} //end of class