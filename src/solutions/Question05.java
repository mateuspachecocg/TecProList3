package solutions;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAddVector();
	}
	
	public static void testAddVector() {
		int vetorA[] = {6, 5, -12, 10,};
		int vetorB[] = { 9, 1, -3, -7};
		int vetorAB[] = {6, 5, -12, 10, 9, 1, -3, -7};
		int vetorResult[] = addVector(vetorA, vetorB);
		boolean testResult = true;
		
		for(int i =0; i < vetorAB.length;i++) {
			testResult = testResult && (vetorResult[i] == vetorAB[i]);
		}

		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static int[] addVector(int vet1[], int vet2[]) {
		int lengthTotal = vet1.length+vet2.length;
		int output[] = new int[lengthTotal];
		for (int i = 0;i < lengthTotal;i++) {
			if (i < vet1.length) {
				output[i] = vet1[i];
			} else {
				output[i] = vet2[i-vet1.length];
			}
		}
		
		return output;
	}
	

}
