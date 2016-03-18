/*
Class SumSeries.java
Description: See above.
Author: Alex Thompson.
Student id: D13129082
Date: 12/11/2014
*/



import java.util.Scanner;

class SumSeries{

	public static void main(String [] args){

	int x = 1;
	int y = 3;


for (x=1; x<=5; x=x+2){

	double n = x/y;
	y=y+2;

	if (n>0.5)
		n++;

	System.out.print(n);
	}

 }
}
