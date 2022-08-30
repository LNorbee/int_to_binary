package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class To_Binary {

	public static void main(String[] args) {
		
		//TODO add GUI / User surface.
		Methods method = new Methods();

		System.out.print("Adj meg egy számot 1-255 között: ");
		
		boolean inputCorrect;
		Scanner scan = new Scanner(System.in);
		do {
			inputCorrect = true;
			try {
				int num = scan.nextInt();
				
				// Bevitt szám ellenőrzése hogy 1-255 közt legyen
				while (num < 1 || num > 255) {
					System.out.print("1 - 255 közötti számot adj meg: ");
					num = scan.nextInt();
				}
				
				method.toBinary(num);
				
				method.inputNumberToBinary(num);
				
			} catch (InputMismatchException e) {
				System.out.print("Nem megfelelő input, add meg újra: ");
				inputCorrect = false;
			} finally {
				scan.nextLine();
			}
		} while(!inputCorrect);
		scan.close();

		// 1 Byte, és kiíratása
		int[] binary = { 1, 2, 4, 8, 16, 32, 64, 128 };
		
		System.out.println("\n" + "1 byte: ");
		for (int i = binary.length - 1; i >= 0; i--) {
			System.out.print(binary[i] + ", ");
		}
	}
}