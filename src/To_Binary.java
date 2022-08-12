import java.util.Arrays;

public class To_Binary {

	public static void main(String[] args) {
		
		
		int [] binary = {1, 2, 4, 8, 16, 32, 64, 128};
		int [] result = new int[binary.length];		

		System.out.println("Alap tömb: ");
		for (int i = 0; i < binary.length; i++) {
			result[i] = binary[i];
			System.out.print(result[i] + ", ");
		}
		System.out.println();
		
		// Fordított alap tömb
		for (int i = binary.length - 1; i >= 0; i--) {
			System.out.print(binary[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Bináris tömb: ");
		int num = 21;
		
		recursion(num);
		System.out.println();
		recursion2(num);
		
	}
	
	static int recursion(int num) {
		int [] binary = {1, 2, 4, 8, 16, 32, 64, 128};
		int [] result = new int[binary.length];
		
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
	  
	static int recursion2(int num) {
	
		if (num % 2 == 0) {
			System.out.print(0);
		}
		if (num % 2 == 1) {
			System.out.print(1);
		}
		
		num = num / 2;
		
		if (num <= 0) {
			return 0;
		}
		return recursion2(num);
	}
}