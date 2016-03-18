/*
Class sales
Description: sales rep exercise.
Author: Alex Thompson.
Student id: D13129082
Date: 02/10/2014
*/

import java.util.Scanner;  //Scanner is in the java.util package

class Sales {

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter miles: ");
	double miles = input.nextDouble();

	System.out.print("Enter engine: ");
	double engine = input.nextDouble();

	double allowance;

     if(engine<=1500){
	     allowance=miles*0.75;
		 System.out.println("The allowance is " + "" + allowance);
	 }
	 else{
	     allowance=miles*1.05;
 		 System.out.println("The allowance is " + "" + allowance);
     }


    } //end of PSV thing
} //end of class

