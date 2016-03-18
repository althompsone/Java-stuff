public class SimSeries {

    public static void main(String [] args){

		double term, sum = 0;
		int i;

		for( i = 1; i < 98; i= i+2){

			term = i/(i+2.0);

			System.out.println( "i/(i + 2) = " + i + "/" + (i+2) );

			sum += term;

		} // end of for()

		System.out.printf( "\n\n Sum of series = %.2f \n\n", sum );

	}


}
