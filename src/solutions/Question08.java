package solutions;

public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPriorizationVector();
	}
	
	
	public static void testPriorizationVector() {
		int vetorA[] = {6, 5, -12, 10};

		int newVector[] = priorizationVector(vetorA);
		int vetorSolution[] = {6, 10};
		
		boolean testResult = true;
		if(vetorSolution.length == newVector.length) {
			for(int i =0; i < newVector.length;i++) {
				testResult = testResult && (newVector[i] == vetorSolution[i]);
			}
		} else {
			testResult = false;
		}

		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
		
		
	}
	
	
	public static int[] priorizationVector(int vet[]) {
		int vetorMed[] = new int[vet.length];
		float media = 0;
		int count = 1;
		for(int i = 0;i < vet.length;i++) {
			if ( (sumAll(vetorMed)+vet[i])/ ((float) count) > media) {
				media = (sumAll(vetorMed)+vet[i])/ ((float) count);
				vetorMed[count-1] = vet[i];
				count++;
			}
		}
		
		int output[] = new int[count-1];
		for (int i = 0;i < count-1;i++) {
			output[i] = vetorMed[i];
		}
		
		return output;
	}
	
	public static int sumAll (int vet[]) {
		int sum = 0;
		for (int i = 0;i < vet.length;i++ ) {
			sum += vet[i];
		}
		return sum;
	}
}
