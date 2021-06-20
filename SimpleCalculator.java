/* 
 * Author: LIN KAILAN
 * Date:  21/06/2021
 * 
 */

package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String menu[] = {

				"1. Addition", "2. Substraction", "3. Multiplication", "4. Division" };

		System.out.println("Welcome! Simple Java Calculator \n ");

		for (int i = 0; i < menu.length; i++) {

			System.out.println(menu[i]);
		}

		int option = 0;

		double result = 0;
		String output = "";

		do {

			Scanner scanner = new Scanner(System.in);
			System.out.println("\nPlease enter you choice > ");
			option = scanner.nextInt();
			System.out.println("Please enter your first number > ");
			Double input1 = scanner.nextDouble();
			System.out.println("Please enter your second number > ");
			Double input2 = scanner.nextDouble();
			if (option == 1) {
				result = input1 + input2;
				output = input1 + " + " + input2 + " = " + result;
				System.out.println(output);
			} else if (option == 2) {
				result = input1 - input2;
				output = input1 + " - " + input2 + " = " + result;
				System.out.println(output);
			} else if (option == 3) {
				result = input1 * input2;
				output = input1 + " x " + input2 + " = " + result;
				System.out.println(output);
			} else if (option == 4) {
				result = input1 / input2;
				output = input1 + " / " + input2 + " = " + result;
				System.out.println(output);
			} else {
				System.out.println("Invalid Option!");
			}

		} while (option == 1 || option == 2 || option == 3 || option == 4);

	}

}
