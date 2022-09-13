package solutions;

public class Question06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAddVector();
	}
	
	public static void testAddVector() {
		int vectorOriginal[] = {-7, -3, 1, 9, 10, -12, 5, 6};
		int vector[] = {6, 5, -12, 10, 9, 1, -3, -7};
		int vectorResult[] = vectorInverter(vectorOriginal);
		
		boolean testResult = true;
		
		for(int i =0; i < vector.length;i++) {
			testResult = testResult && (vectorResult[i] == vector[i]);
		}

		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static int[] vectorInverter(int vet[]) {
		
		int output[] = new int[vet.length];
		
		for (int i = 0; i < vet.length;i++) {
			output[i] = vet[vet.length-1-i];
		}
		
		return output;
	}
}
