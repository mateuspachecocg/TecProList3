package solutions;

public class Question15 {

	public static void main(String[] args) {
		
		testLackToTen();
		
	}

	public static void testLackToTen() {

		int vector1[] = { 1, 2, 4, 5, 6 };
		int vector2[] = { 5, 1, 9, 4, 2 };

		int vtrResult[] = lackToTen(vector1, vector2);
		int vtrExpected[] = { 4, 7, -3, 1, 2 };

		boolean testResult = true;

		for (int i = 0; i < vtrResult.length; i++) {
			testResult = testResult && (vtrResult[i] == vtrExpected[i]);
		}

		// Different size vectors!
		testResult = testResult && (lackToTen(vector1, (new int[2])) == null);
		
		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}

	public static int[] lackToTen(int vtrA[], int vtrB[]) {
		if (vtrA.length != vtrB.length) {
			return null;
		}

		int output[] = new int[vtrA.length];

		for (int i = 0; i < vtrA.length; i++) {
			output[i] = 10 - (vtrA[i] + vtrB[i]);
		}

		return output;
	}
}
