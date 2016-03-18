/*
Class sales
Description: sales rep exercise.
Author: Alex Thompson.
Student id: D13129082
Date: 02/10/2014
*/

import java.util.Scanner;  //Scanner is in the java.util package

class SalesOtherWay {

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter miles: ");
	double miles = input.nextDouble();

	System.out.print("Enter engine: ");
	double engine = input.nextDouble();


     if(engine<=1500){
		 System.out.println("The allowance is " + miles*0.75);
	 }
	 else{
 		 System.out.println("The allowance is " + miles*1.05);
     }


    } //end of PSV thing
} //end of class