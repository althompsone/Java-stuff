/*
Class TradesProcess1
Description: CA1.
Author: Alex Thompson.
Student id: D13129082
Date: 20/11/2014
NB: Had to format command window width to 85 to get reasonably well displayed output.
*/

import java.util.Scanner;
import javax.swing.JTable;

class TradesProcess1{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	String [] dept = {"Dublin", "London", "London", "Dublin", "Paris", "Paris"};
	String [] firstName = {"John", "Sarah", "Ruth", "Conor", "Jerome", "Patrick"};
	String [] surName = {"Wall", "May", "Lavin", "Smith", "Duignan", "Bateman"};

	int [] q1 = {12, 8, 12, 21, 14, 23};
	int [] q2 = {24, 11, 14, 23, 14, 24};
	int [] q3 = {26, 7, 14, 26, 17, 26};
	int [] q4 = {17, 9, 15, 31, 18, 35};

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

	/*double [] bonus;

	for(int i = 0; i < dept.length; i++){

		//Was trying to include the selection statement below (Might try something with parsing later?)
		if (dept[i]=="Dublin")
			bonus[i] = BrokerTotal[i]*0.12;
		else if (dept[i]=="London")
			bonus[i] = BrokerTotal[i]*0.15;
		else
			bonus[i] = BrokerTotal[i]*0.1;
		}*/

	System.out.print("\nDept\tFirstName\tSurname\tQ1\tQ2\tQ3\tQ4\tBroker Total\tBonus\n"); //Table heading
	System.out.print("_____________________________________________________________________________________"); //Was trying to devise a way to program a line to go up to end of row

	//Table body
	for(int i = 0; i < dept.length; i++)

		System.out.printf(dept[i] + "\t" + firstName[i] + "\t\t" /*Not sure why x2 space in heading for here, so had to x2 here also*/ + surName[i] + "\t" + q1[i] + "\t" + q2[i] + "\t" + q3[i] + "\t" + q4[i] + "\t" + BrokerTotal[i] + "\t\t" + "%.3f",bonus[i]);
		//Haven't been able to completely avoid text-wrapping.

		//for(int i = 0; i < quarterlyTotal.length; i++)
		System.out.print("----------Quarterly total:" + "-----" + quarterlyTotal[0] + "-----" + quarterlyTotal[1] + "-----" + quarterlyTotal[2] + "-----" + quarterlyTotal[3] + "\n"); //Improvised, I know!
 	}
}