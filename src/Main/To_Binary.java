package Main;

import java.util.Scanner;

public class To_Binary {

	public static void main(String[] args) {
		System.out.print("Adj meg egy számot 0-255 között: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		int[] binary = { 1, 2, 4, 8, 16, 32, 64, 128 };

		// 1 Byte
		System.out.println("\n" + "1 byte: ");
		for (int i = binary.length - 1; i >= 0; i--) {
			System.out.print(binary[i] + ", ");
		}
		System.out.println();
		System.out.println();


		System.out.println("Bináris tömbként: ");

		char[] s = Integer.toBinaryString(num).toCharArray();
		System.out.println(s);

		System.out.println();
		
		Methods method = new Methods();
		method.recursion(num);
		System.out.println();
		//method.recursion2(num);

	}
}