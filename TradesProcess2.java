/*
Class TradesProcess2
Description: CA1.
Author: Alex Thompson.
Student id: D13129082
Date: 15/01/2015
NB: Had to format command window width to 85 to get reasonably well displayed output.
*/

import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.JOptionPane;

class TradesProcess2{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	String [] dept = {"Dublin", "London", "London", "Dublin", "Paris", "Paris"};
	String [] firstName = {"John", "Sarah", "Ruth", "Conor", "Jerome", "Patrick"};
	String [] surName = {"Wall", "May", "Lavin", "Smith", "Duignan", "Bateman"};

	/*
	Was trying this sort of thing:

	for (int i = 0; i < firstName.length; i++)
		System.out.print("Enter first quarter figure for" + firstName[i]);
		int [] q1 = {input.nextInt()};

	(But I eventually just did it the long way below)
	*/

	System.out.print("Enter first quarter figure for " + firstName[0] + " " + surName[0] + ": ");
		int q1o1 = input.nextInt();
	System.out.print("Enter second quarter figure for " + firstName[0] + " " + surName[0] + ": ");
		int q2o1 = input.nextInt();
	System.out.print("Enter third quarter figure for " + firstName[0] + " " + surName[0] + ": ");
		int q3o1 = input.nextInt();
	System.out.print("Enter fourth quarter figure for " + firstName[0] + " " + surName[0] + ": ");
		int q4o1 = input.nextInt();

	System.out.print("Enter first quarter figure for " + firstName[1] + " " + surName[1] + ": ");
		int q1o2 = input.nextInt();
	System.out.print("Enter second quarter figure for " + firstName[1] + " " + surName[1] + ": ");
		int q2o2 = input.nextInt();
	System.out.print("Enter third quarter figure for " + firstName[1] + " " + surName[1] + ": ");
		int q3o2 = input.nextInt();
	System.out.print("Enter fourth quarter figure for " + firstName[1] + " " + surName[1] + ": ");
		int q4o2 = input.nextInt();

	System.out.print("Enter first quarter figure for " + firstName[2] + " " + surName[2] + ": ");
		int q1o3 = input.nextInt();
	System.out.print("Enter second quarter figure for " + firstName[2] + " " + surName[2] + ": ");
		int q2o3 = input.nextInt();
	System.out.print("Enter third quarter figure for " + firstName[2] + " " + surName[2] + ": ");
		int q3o3 = input.nextInt();
	System.out.print("Enter fourth quarter figure for " + firstName[2] + " " + surName[2] + ": ");
		int q4o3 = input.nextInt();

	System.out.print("Enter first quarter figure for " + firstName[3] + " " + surName[3] + ": ");
		int q1o4 = input.nextInt();
	System.out.print("Enter second quarter figure for " + firstName[3] + " " + surName[3] + ": ");
		int q2o4 = input.nextInt();
	System.out.print("Enter third quarter figure for " + firstName[3] + " " + surName[3] + ": ");
		int q3o4 = input.nextInt();
	System.out.print("Enter fourth quarter figure for " + firstName[3] + " " + surName[3] + ": ");
		int q4o4 = input.nextInt();

	System.out.print("Enter first quarter figure for " + firstName[4] + " " + surName[4] + ": ");
		int q1o5 = input.nextInt();
	System.out.print("Enter second quarter figure for " + firstName[4] + " " + surName[4] + ": ");
		int q2o5 = input.nextInt();
	System.out.print("Enter third quarter figure for " + firstName[4] + " " + surName[4] + ": ");
		int q3o5 = input.nextInt();
	System.out.print("Enter fourth quarter figure for " + firstName[4] + " " + surName[4] + ": ");
		int q4o5 = input.nextInt();

	System.out.print("Enter first quarter figure for " + firstName[5] + " " + surName[5] + ": ");
		int q1o6 = input.nextInt();
	System.out.print("Enter second quarter figure for " + firstName[5] + " " + surName[5] + ": ");
		int q2o6 = input.nextInt();
	System.out.print("Enter third quarter figure for " + firstName[5] + " " + surName[5] + ": ");
		int q3o6 = input.nextInt();
	System.out.print("Enter fourth quarter figure for " + firstName[5] + " " + surName[5] + ": ");
		int q4o6 = input.nextInt();

	int [] q1 = {q1o1, q1o2, q1o3, q1o4, q1o5, q1o6};
	int [] q2 = {q2o1, q2o2, q2o3, q2o4, q2o5, q2o6};
	int [] q3 = {q3o1, q3o2, q3o3, q3o4, q3o5, q3o6};
	int [] q4 = {q4o1, q4o2, q4o3, q4o4, q4o5, q4o6};


	/*int [] q1 = {12, 8, 12, 21, 14, 23};
	int [] q2 = {24, 11, 14, 23, 14, 24};
	int [] q3 = {26, 7, 14, 26, 17, 26};
	int [] q4 = {17, 9, 15, 31, 18, 35};
	*/

	int [] BrokerTotal = {((q1[0])+(q2[0])+(q3[0])+(q4[0])), ((q1[1])+(q2[1])+(q3[1])+(q4[1])), ((q1[2])+(q2[2])+(q3[2])+(q4[2])), ((q1[3])+(q2[3])+(q3[3])+(q4[3])), ((q1[4])+(q2[4])+(q3[4])+(q4[4])), ((q1[5])+(q2[5])+(q3[5])+(q4[5]))};
	/*This was the cleanest way I could come up with of doing the computations for this array. Otherwise, including ((q1[i])+(q2[i])+(q3[i])+(q4[i])) in the For Loop's output instead of BrokerTotal[i] would also work*/

	double [] bonus = {BrokerTotal[0]*0.12, BrokerTotal[1]*0.15, BrokerTotal[2]*0.15, BrokerTotal[3]*0.12, BrokerTotal[4]*0.1, BrokerTotal[5]*0.1};

	//Getting quarterly totals.
	int totalq1 = 0;
	for (int i = 0; i < q1.length; i++)
		totalq1 = totalq1 + q1[i];

	int totalq2 = 0;
	for (int i = 0; i < q2.length; i++)
		totalq2 = totalq2 + q2[i];

	int totalq3 = 0;
	for (int i = 0; i < q3.length; i++)
		totalq3 = totalq3 + q3[i];

	int totalq4 = 0;
	for (int i = 0; i < q4.length; i++)
		totalq4 = totalq4 + q4[i];
	//Finished getting quarterly totals.

	//System.out.println(dept.length); (Just verifying that this'd output 6)

	int [] quarterlyTotal = {totalq1, totalq2, totalq3, totalq4};

	System.out.print("\nDept\tFirstName\tSurname\tQ1\tQ2\tQ3\tQ4\tBroker Total\tBonus\n"); //Table heading
	System.out.print("_____________________________________________________________________________________"); //Was trying to devise a way to program a line to go up to end of row

	//Table body
	for(int i = 0; i < dept.length; i++)

		/*Was trying to include the selection statement below (Might try something with parsing later?)
		if (dept[i]=="Dublin")
			bonus[i] = bonus[i]*0.12;
		else if (dept[i]=="London")
			bonus[i] = bonus[i]*0.15;
		else
			bonus[i] = bonus[i]*0.1;*/

		System.out.printf(dept[i] + "\t" + firstName[i] + "\t\t" /*Not sure why x2 space in heading for here, so had to x2 here also*/ + surName[i] + "\t" + q1[i] + "\t" + q2[i] + "\t" + q3[i] + "\t" + q4[i] + "\t" + BrokerTotal[i] + "\t\t" + "%.3f",bonus[i]);
		//Haven't been able to completely avoid text-wrapping.

		//for(int i = 0; i < quarterlyTotal.length; i++)
		System.out.print("----------Quarterly total:" + "-----" + quarterlyTotal[0] + "-----" + quarterlyTotal[1] + "-----" + quarterlyTotal[2] + "-----" + quarterlyTotal[3] + "\n"); //Improvised, I know!

 	}
}