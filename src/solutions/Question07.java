package solutions;

public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testInterchangeValues();
	}
	
	
	public static void testInterchangeValues() {
		int vetorA[] = {6, 5, -12, 10};
		int vetorB[] = { 9, 1, -3, -7};
		int vetorABackup[] = {6, 5, -12, 10};
		int vetorBBackup[] = { 9, 1, -3, -7};
		
		boolean testResult = true;
		int vetSize1[] = {1};
		int vetSize2[] = {1, 2};
		
		if (interchangeValues(vetSize1, vetSize2) > 0) {
			testResult = testResult && false;
		}
		
		
		interchangeValues(vetorA, vetorB);
		
		for(int i =0; i < vetorA.length;i++) {
			testResult = testResult && (vetorA[i] == vetorBBackup[i]);
			testResult = testResult && (vetorB[i] == vetorABackup[i]);
		}

		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static int interchangeValues(int vet1[], int vet2[]) {
		
		if (vet1.length != vet2.length) {
			return -100;
		}
		int k; // aux variable
		for(int i = 0;i < vet1.length;i++) {
			k = vet1[i];
			vet1[i] = vet2[i];
			vet2[i] = k;
		}
		
		return 100;
		
	}
}
