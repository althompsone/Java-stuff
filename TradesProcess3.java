/*
Class TradesProcess3
Description: CA1.
Author: Alex Thompson.
Student id: D13129082
Date: 16/01/2015
NB: After trying many different strategies, I was able to get quite close to success with some methods,
but ultimately returning arrays within methods proved very tricky for me, and below is my best take on
part 3 as it stands.
*/

import java.util.Scanner;
import javax.swing.JTable;

class TradesProcess3{

public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	String [] dept = {"Dublin", "London", "London", "Dublin", "Paris", "Paris"};
	String [] firstName = {"John", "Sarah", "Ruth", "Conor", "Jerome", "Patrick"};
	String [] surName = {"Wall", "May", "Lavin", "Smith", "Duignan", "Bateman"};

	int [] q1 = readInQuarter1(firstName, surName);
	int [] q2 = readInQuarter2(firstName, surName);
	int [] q3 = readInQuarter3(firstName, surName);
	int [] q4 = readInQuarter4(firstName, surName);

	int [] brokerTotal = getBrokerTotals(q1,q2,q3,q4);

	double [] bonus = getBonuses(dept, brokerTotal);

	int [] totalq1 = getQuarterlyTotals(q1);
	int [] totalq2 = getQuarterlyTotals(q2);
	int [] totalq3 = getQuarterlyTotals(q3);
	int [] totalq4 = getQuarterlyTotals(q4);

	int [] quarterlyTotals = {totalq1, totalq2, totalq3, totalq4};

	System.out.print(printTable(String [] firstname, String [] surName, int [] q1, int [] q2, int [] q3, int [] q4, int [] brokerTotal, double [] bonus, int [] quarterlyTotal));
	}

public static int readInQuarter(String [] firstName, String [] surName){

	Scanner input = new Scanner(System.in);

	int [] q1;
	for (int i = 0; i < firstName.length; i++)
		System.out.print("Enter first quarter figure for " + firstName[i] + " " + surName[i] + ": ");
		q1[i] = input.nextInt();

	return q1; //(Local var - doesn't necessarily have to be same name as the variable that info is passed to when method invoked in main)
	}

public static int readInQuarter2(String [] firstName, String [] surName){

	Scanner input = new Scanner(System.in);

	int [] q2;

	for (int i = 0; i < firstName.length; i++)
		System.out.print("Enter second quarter figure for " + firstName[i] + " " + surName[i] + ": ");
		q2[i] = input.nextInt();

	return q2;
	}

public static int readInQuarter3(String [] firstName, String [] surName){

	Scanner input = new Scanner(System.in);

	int [] q3;

	for (int i = 0; i < firstName.length; i++)
		System.out.print("Enter third quarter figure for " + firstName[i] + " " + surName[i] + ": ");
		q3[i] = input.nextInt();

	return q3;
	}

public static int readInQuarter4(String [] firstName, String [] surName){

	Scanner input = new Scanner(System.in);

	int [] q4;

	for (int i = 0; i < firstName.length; i++)
		System.out.print("Enter fourth quarter figure for " + firstName[i] + " " + surName[i] + ": ");
		q4[i] = input.nextInt();

	return q4;
	}

public static int getBrokerTotals(int [] q1, int [] q2, int [] q3, int [] q4){

	for (int i = 0; i < q1.length; i++)
		int [] bt = {q1[i]+ q2[i] + q3[i] + q4[i]};

	return bt;
	}

public static double getBonuses(String [] dept, int [] brokerTotal){

	double [] bonus;

	for(int i = 0; i < dept.length; i++)
		if (dept[i]=="Dublin")
			bonus[i] = bonus[i]*0.12;
		else if (dept[i]=="London")
			bonus[i] = bonus[i]*0.15;
		else
			bonus[i] = bonus[i]*0.1;

	return bonus;
	}

public static int getQuarterlyTotals(int [] q){

	int totalq = 0;
	for (int i = 0; i < q1.length; i++)
		totalq = totalq + q[i];

	return totalq;
	}

public static void printTable(String [] firstname, String [] surName, int [] q1, int [] q2, int [] q3, int [] q4, int [] brokerTotal, double [] bonus, int [] quarterlyTotal){

	System.out.print("\nDept\tFirstName\tSurname\tQ1\tQ2\tQ3\tQ4\tBroker Total\tBonus\n"); //Table heading
	System.out.print("_____________________________________________________________________________________");

	//Table body
	for(int i = 0; i < dept.length; i++)
		System.out.printf(dept[i] + "\t" + firstName[i] + "\t\t" + surName[i] + "\t" + q1[i] + "\t" + q2[i] + "\t" + q3[i] + "\t" + q4[i] + "\t" + brokerTotal[i] + "\t\t" + "%.3f",bonus[i]);

	System.out.print("----------Quarterly total:" + "-----" + quarterlyTotal[0] + "-----" + quarterlyTotal[1] + "-----" + quarterlyTotal[2] + "-----" + quarterlyTotal[3] + "\n");
	}
}