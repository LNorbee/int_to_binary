package Main;

import java.util.Arrays;

public class Methods {
	protected int recursion(int num) {
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

	protected int recursion2(int num) {

		if (num % 2 == 0) {
			System.out.print(0 + " ");
		}
		if (num % 2 == 1) {
			System.out.print(1 + " ");
		}

		num = num / 2;

		if (num <= 0) {
			return 0;
		}
		return recursion2(num);
	}
}
