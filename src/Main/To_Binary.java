package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class To_Binary {

	public static void main(String[] args) {

		System.out.print("Adj meg egy számot 1-255 között: ");
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			int num = scan.nextInt();

			// Bevitt szám ellenőrzése hogy 1-255 közt legyen
			while (num < 1 || num > 255) {
				System.out.print("Nem megfelelő, add meg újra: ");
				num = scan.nextInt();
			}

			System.out.println("\n" + "Bináris tömbként: ");

			char[] s = Integer.toBinaryString(num).toCharArray();
			System.out.println(s);
			System.out.println();

			Methods method = new Methods();
			method.recursion(num);
			// System.out.println();
			// method.recursion2(num);

			// 1 Byte, és kiíratása
			int[] binary = { 1, 2, 4, 8, 16, 32, 64, 128 };

			System.out.println("\n" + "1 byte: ");
			for (int i = binary.length - 1; i >= 0; i--) {
				System.out.print(binary[i] + ", ");
			}

		} catch (InputMismatchException e) {
			System.out.println("Nem megfelelő input!");

		} finally {
			if (scan != null) {
				scan.close();
			}
		}
		System.out.println(scan);
	}
}