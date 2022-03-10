package lab_2;

/**
 * TASK: Remember to include all necessary headers for your Javadoc,
 * descriptions and explanations of what you have done in the appropriate
 * places. ENSURE that you add appropriate Javadoc style comments to relevant
 * parts of this code as you update this program to show that you understand it.
 * 
 */

/**
 * File Name: Spice.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 02<br>
 * Date: Jan 31st, 2022<br>
 * <p>
 * Purpose:
 * <p>
 * - A program to practice working with 2 dimensional arrays. <br>
 * - In the program consist of a number of traders who conduct business on
 * importation of food spices.<br>
 * - Across 9 cities in Ontario. Over a period of one year - 12 months.<br>
 * 
 * <p>
 * Class List: {@link Spice}
 * <p>
 * 
 * - Output the total number of the traders for each month of the year for each
 * city.<br>
 * - Format the output using printf.<br>
 * 
 * 
 * @author Ishtiaque Matin, ID# 041042199
 * 
 * @version Modified: Jan 31st, 2022
 * 
 * @since JDK 1.8
 */

public class Spice {

	/**
	 * - uses a nested for loop to compute and print the sum of the traders in the
	 * array.<br>
	 * - computes the sum of the food spice traders for each month specified.<br>
	 * - uses printf to format and print the each column sum.
	 * <p>
	 * 
	 * @param args an array of command-line arguments for the main method
	 * 
	 *             <p>
	 *             <u>instance variables:</u>
	 * 
	 *             <p>
	 *             final int ROWS = 9 cities in Ontario.<br>
	 *             final int COLUMNS = a period of one year - 12 months.<br>
	 *             int traders = number of the traders for each month of the year
	 *             for each city<br>
	 *             String cities = name of the 9 cities in Ontario <br>
	 * 
	 *             <p>
	 * 
	 *             - for loop statement to print the cities.<br>
	 *             - use class formatter to align the output as per each column.<br>
	 *             - for loop statement to print the traders.<br>
	 *             - use class formatter to align the output as per each column.<br>
	 *             - {@link java.util.Formatter}<br>
	 * 
	 *             <p>
	 * 
	 *             <u>instance variables:</u>
	 * 
	 *             <p>
	 * 
	 *             int index = to keep track of the rows.<br>
	 *             indexColumn = to keep track of the columns.<br>
	 * 
	 *             <p>
	 * 
	 *             - for loop statement to sum up the traders for each month and
	 *             print them in their respective columns.<br>
	 *             - use class formatter to align the output as per each column.<br>
	 *             - {@link java.util.Formatter}<br>
	 * 
	 *             <p>
	 * 
	 *             <u>instance variables:</u>
	 * 
	 *             <p>
	 * 
	 *             int indexColumn = to keep track of the columns<br>
	 *             int index = to keep track of the rows.<br>
	 *             int sumTraders = to add up the traders for each month.<br>
	 * 
	 */

	public static void main(String[] args) {
		final int ROWS = 9;
		final int COLUMNS = 12;

		int[][] traders = { { 150, 140, 225, 130, 220, 110, 120, 100, 115, 200, 192, 224 },
				{ 220, 137, 26, 82, 502, 615, 209, 947, 116, 214, 278, 238 },
				{ 103, 203, 276, 308, 172, 246, 354, 118, 123, 310, 146, 152 },
				{ 210, 260, 234, 108, 149, 202, 216, 58, 244, 155, 167, 221 },
				{ 203, 274, 226, 182, 152, 107, 192, 265, 123, 110, 146, 152 },
				{ 223, 184, 236, 234, 167, 121, 208, 201, 186, 109, 141, 176 },
				{ 136, 219, 131, 191, 187, 201, 278, 106, 153, 172, 109, 146 },
				{ 201, 104, 121, 13, 121, 69, 246, 100, 123, 161, 69, 175 },
				{ 100, 235, 106, 222, 175, 143, 208, 157, 163, 141, 208, 189 } };

		String[] cities = { "Ottawa", "Perth", "Pembroke", "Kingston", "Toronto", "Niagara", "London", "Waterloo",
				"Guelph" };

		System.out.println(
				"              Month      Jan      Feb    March    April      May     June     July      Aug     Sept      Oct      Nov      Dec");
		System.out.println();

		/**
		 * TASK: It is important to know the number of spice traders per city. So you
		 * need to print out the number of traders for all cities (content of the array)
		 * for each month. Update the code in this section by using a nested for loop.
		 * 
		 */

		// TO DO: WRITE YOUR CODE FOR THIS SECTION HERE!!!! Check the sample output file
		// (SpiceOutput) to see the expected pattern to print out these details using
		// printf.

		/**
		 * - for loop statement to print the cities.<br>
		 * - use class formatter to align the output as per each column.<br>
		 * - for loop statement to print the traders.<br>
		 * - use class formatter to align the output as per each column.<br>
		 * - {@link java.util.Formatter}<br>
		 * 
		 * <p>
		 * 
		 * <u>instance variables:</u>
		 * 
		 * <p>
		 * 
		 * int index = to keep track of the rows.<br>
		 * indexColumn = to keep track of the columns.<br>
		 * 
		 */
		for (int index = 0; index < ROWS; index++) {

			System.out.printf("%1$19s", cities[index]);

			for (int indexColumn = 0; indexColumn < COLUMNS; indexColumn++) {

				System.out.printf("%1$9s", traders[index][indexColumn]);

			}
			System.out.println();
		}
		/**
		 * TASK: Update the code in this section by writing a nested for loop (for the
		 * columns and rows of the array) to compute the sum (column). Print the column
		 * sum using printf. Check the sample output file (SpiceOutput) to see the
		 * expected pattern.
		 */

		System.out.println();
		System.out.print("            Traders");

		// TO DO: INSERT CODE HERE FOR THIS SECTION!!! Check the sample output file
		// (SpiceOutput) to see the expected pattern.

		/**
		 * - for loop statement to sum up the traders for each month and print them in
		 * their respective columns.<br>
		 * - use class formatter to align the output as per each column.<br>
		 * - {@link java.util.Formatter}<br>
		 * 
		 * <p>
		 * 
		 * <u>instance variables:</u>
		 * 
		 * <p>
		 * 
		 * int indexColumn = to keep track of the columns<br>
		 * int index = to keep track of the rows.<br>
		 * int sumTraders = to add up the traders for each month.<br>
		 * 
		 */
		for (int indexColumn = 0; indexColumn < COLUMNS; indexColumn++) {

			int sumTraders = 0;

			for (int index = 0; index < ROWS; index++) {

				sumTraders += traders[index][indexColumn];

			}

			System.out.printf("%1$9s", sumTraders);

		}

		System.out.println();
		System.out.println();
		System.out.println("               Food spice trading is very lucrative!");
	}
}
