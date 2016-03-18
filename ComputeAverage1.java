import java.util.Scanner;  //Scanner is in the java.util package

public class ComputeAverage1 {
	public static void main(String[] args) {

	//Create a Scanner object
	Scanner input = new Scanner(System.in);

	//Prompt the user to enter four numbers
	System.out.print("Enter four numbers: ");
	double number1 = input.nextDouble();
	double number2 = input.nextDouble();
	double number3 = input.nextDouble();
	double number4 = input.nextDouble();

	//Compute average
	double average = (number1 + number2 + number3 + number4)/4;

	//Display result
	System.out.println("The average of" + number1 + "" + number2 + "" + number3 + "" + number4 + "is" + average);
	 }
   }