/*
Class TradesProcess4
Description: CA1.
Author: Alex Thompson.
Student id: D13129082
Date: 16/01/2015
NB: I am adapting TradesProcess1 for this file.
*/

import java.util.Scanner;  //Scanner is in the java.util package

class TradesProcess4 {

public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	String [][] namesPlaces = new String [7][3];

	namesPlaces [0][0] = "Dublin";
	namesPlaces [1][0] = "London";
	namesPlaces [2][0] = "London";
	namesPlaces [3][0] = "Dublin";
	namesPlaces [4][0] = "Paris";
	namesPlaces [5][0] = "Paris";
	namesPlaces [6][0] = "000";

	namesPlaces [0][1] = "John";
	namesPlaces [1][1] = "Sarah";
	namesPlaces [2][1] = "Ruth";
	namesPlaces [3][1] = "Conor";
	namesPlaces [4][1] = "Jerome";
	namesPlaces [5][1] = "Patrick";
	namesPlaces [6][1] = "000";

	namesPlaces [0][2] = "Wall";
	namesPlaces [1][2] = "May";
	namesPlaces [2][2] = "Lavin";
	namesPlaces [3][2] = "Smith";
	namesPlaces [4][2] = "Duignan";
	namesPlaces [5][2] = "Bateman";
	namesPlaces [6][2] = "Q Total";

	double [][] tp4 = new double [7][6]; //Double to avoid "lossy conversion"

	tp4 [0][0] = 12;
	tp4 [0][1] = 24;
	tp4 [0][2] = 26;
	tp4 [0][3] = 17;
	tp4 [1][0] = 8;
	tp4 [1][1] = 11;
	tp4 [1][2] = 7;
	tp4 [1][3] = 9;
	tp4 [2][0] = 12;
	tp4 [2][1] = 14;
	tp4 [2][2] = 14;
	tp4 [2][3] = 15;
	tp4 [3][0] = 21;
	tp4 [3][1] = 23;
	tp4 [3][2] = 26;
	tp4 [3][3] = 31;
	tp4 [4][0] = 14;
	tp4 [4][1] = 14;
	tp4 [4][2] = 17;
	tp4 [4][3] = 18;
	tp4 [5][0] = 23;
	tp4 [5][1] = 24;
	tp4 [5][2] = 26;
	tp4 [5][3] = 35;

	tp4 [0][4] = ((tp4[0][0])+(tp4[0][1])+(tp4[0][2])+(tp4[0][3]));
	tp4 [1][4] = ((tp4[1][0])+(tp4[1][1])+(tp4[1][2])+(tp4[1][3]));
	tp4 [2][4] = ((tp4[2][0])+(tp4[2][1])+(tp4[2][2])+(tp4[2][3]));
	tp4 [3][4] = ((tp4[3][0])+(tp4[3][1])+(tp4[3][2])+(tp4[3][3]));
	tp4 [4][4] = ((tp4[4][0])+(tp4[4][1])+(tp4[4][2])+(tp4[4][3]));
	tp4 [5][4] = ((tp4[5][0])+(tp4[5][1])+(tp4[5][2])+(tp4[5][3]));

	tp4 [0][5] = (tp4[0][4])+(tp4[0][4]*0.12);
	tp4 [1][5] = (tp4[1][4])+(tp4[1][4]*0.15);
	tp4 [2][5] = (tp4[2][4])+(tp4[2][4]*0.15);
	tp4 [3][5] = (tp4[3][4])+(tp4[3][4]*0.12);
	tp4 [4][5] = (tp4[4][4])+(tp4[4][4]*0.1);
	tp4 [5][5] = (tp4[5][4])+(tp4[5][4]*0.11);

	tp4 [6][0] = ((tp4[0][0])+(tp4[1][0])+(tp4[2][0])+(tp4[3][0])+(tp4[4][0])+(tp4[5][0]));
	tp4 [6][1] = ((tp4[0][1])+(tp4[1][1])+(tp4[2][1])+(tp4[3][1])+(tp4[4][1])+(tp4[5][1]));
	tp4 [6][2] = ((tp4[0][2])+(tp4[1][2])+(tp4[2][2])+(tp4[3][2])+(tp4[4][2])+(tp4[5][2]));
	tp4 [6][3] = ((tp4[0][3])+(tp4[1][3])+(tp4[2][3])+(tp4[3][3])+(tp4[4][3])+(tp4[5][3]));

	/*Thought this might work:
	tp4 [6][4] = null;
	tp4 [6][5] = null;*/

	tp4 [6][4] = 000;
	tp4 [6][5] = 000;

	/*System.out.print(tp4[0][4]); (Testing)*/

	int rows1 = 7;
	int columns1 = 3;
	int i, j;

	int rows2 = 7;
	int columns2 = 6;
	int ii, jj;

	System.out.print("\nDept\tFirstName\tSurname\tQ1\tQ2\tQ3\tQ4\tBroker Total\tBonus\n"); //Table heading
	System.out.print("_____________________________________________________________________________________");

	{{//Trying to do a "printing block"
	for (i=0; i<rows1; i++){
		for (j=0; j<columns1; j++){
			System.out.print(namesPlaces[i][j] + " ");
		}
		System.out.println();
 	}
	System.out.print("/t");}

	//System.out.print("/t"); //Trying to get next stuff beside prev.

	for (ii=0; ii<rows2; ii++){
		for (jj=0; jj<columns2; jj++){
			System.out.print(tp4[ii][jj] + " ");
		}
		System.out.println();
 	}}

	}//End main
 }