import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Arrays;
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
		recursion(num);
		System.out.println();
//		recursion2(num);

	}

	static int recursion(int num) {
		// int[] binary = { 1, 2, 4, 8, 16, 32, 64, 128 };
		int[] binary = { 128, 64, 32, 16, 8, 4, 2, 1 };
		int[] result = new int[binary.length];

		int num2 = 0;

		for (int i = 0; i < binary.length; i++) {
			if (num / binary[i] == 1) {
				num2 = num % binary[i];
				result[i] = 1;
			}
		}
		System.out.println(Arrays.toString(result));
		if (num2 <= 0) {
			return 0;
		}
		return recursion(num2);
	}

//	static int recursion2(int num) {
//
//		if (num % 2 == 0) {
//			System.out.print(0 + " ");
//		}
//		if (num % 2 == 1) {
//			System.out.print(1 + " ");
//		}
//
//		num = num / 2;
//
//		if (num <= 0) {
//			return 0;
//		}
//		return recursion2(num);
//	}
}