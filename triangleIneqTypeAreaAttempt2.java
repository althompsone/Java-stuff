/*
Class triangleIneqTypeAreaAttempt2
Description: Triangles: Inequality theorem, type, & area exercise.
Author: Alex Thompson.
Student id: D13129082
Date: 07/10/2014
*/

//Seems to be running without errors, but won't print anything except for initial Entry prompts and for the final else clause.
//Now just seeing "Could not find or load main class" in cmd window.

	import java.util.Scanner;  //Scanner is in the java.util package
	class triangleIneqTypeAreaAttempt2 {

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter sideA: ");
	double sideA = input.nextDouble();
	System.out.print("Enter sideB: ");
	double sideB = input.nextDouble();
	System.out.print("Enter sideC: ");
	double sideC = input.nextDouble();

	double t = ((sideA+sideB+sideC)/2);
    double area = Math.sqrt(t*(t-sideA)*(t-sideB)*(t-sideC));


     if(((sideA+sideB>sideC) && (sideA+sideC>sideB) && (sideB+sideC>sideA))){

	     if (((sideA == sideB) && (sideA != sideC)) ^ ((sideA == sideC) && (sideA != sideB)) ^ ((sideB == sideC) && (sideB != sideA)))
	 	 System.out.println("It's an Isoceles triangle, with area" + area);

	 }

	 else if(((sideA+sideB>sideC) && (sideA+sideC>sideB) && (sideB+sideC>sideA))){

		 if (((sideA == sideB) && (sideB == sideC)))
	     System.out.println("It's an equilateral triangle, with area" + area);
     }

	 else if(((sideA+sideB>sideC) && (sideA+sideC>sideB) && (sideB+sideC>sideA))){

	 	  if (((sideA != sideB) && (sideB != sideC)))
	 	 System.out.println("It's a Scalene triangle, with area" + area);
     }

	 else{
 		 System.out.println("Ain't a triangle, dude!");
     }

   } //end of PSV thing
} //end of class