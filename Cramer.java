/*
Class Cramer
Description: Cramer exercise.
Author: Alex Thompson.
Student id: D13129082
Date: 02/10/2014
*/

import java.util.Scanner;  //Scanner is in the java.util package

class Cramer {

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a: ");
	double a = input.nextDouble();
	System.out.print("Enter b: ");
	double b = input.nextDouble();
	System.out.print("Enter c: ");
	double c = input.nextDouble();
	System.out.print("Enter d: ");
	double d = input.nextDouble();
	System.out.print("Enter e: ");
	double e = input.nextDouble();
	System.out.print("Enter f: ");
	double f = input.nextDouble();

     if(a*d - b*c == 0){
		 System.out.println("The equation has no solution");
	 }
	 else{
 		 System.out.println("x = " + (e*d - b*f)/(a*d - b*c) + "" + " and y = " + (a*f - e*c)/(a*d - b*c));
     }


    } //end of PSV thing
} //end of class