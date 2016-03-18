/*
Class NumbTest
Description: two numbers exercise.
Author: Alex Thompson.
Student id: D13129082
Date: 02/10/2014
*/

import java.util.Scanner;  //Scanner is in the java.util package

class NumbTest {

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Num1: ");
	double Num1 = input.nextDouble();

	System.out.print("Enter Num2: ");
	double Num2 = input.nextDouble();


     if(Num1==0 && Num2==0){
		 System.out.println("Both zero");
	 }
	 else if(Num1==Num2){
 		 System.out.println("Both equal");
     }
     else if(Num1>Num2){
	  	 System.out.println("First");
     }
     else{
	  	 System.out.println("Second");
     }

    } //end of PSV thing
} //end of class