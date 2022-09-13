package solutions;

public class Question09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testZipVector();
	}
	
	
	public static void testZipVector() {
		int binaryVtr[] = {0, 0, 0, 1,  1, 1, 1, 0};
		
		int result[] = zipVector(binaryVtr);
		int resultCorrect[] = {0, 3, 1, 4, 0, 1};
		
		boolean testResult = true;
		for(int i =0; i < result.length;i++) {
			testResult = testResult && (result[i] == resultCorrect[i]);
		}

		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static int[] zipVector(int vtr[]) {
		int lengthNewVector = 1;
		int pointer = vtr[0];
		int i;
		
		for (i = 0;i < vtr.length;i++) {
			if (pointer != vtr[i]) {
				lengthNewVector++;
				pointer = vtr[i];
			}
		}
		
		lengthNewVector = lengthNewVector*2;
		
		int output[] = new int[lengthNewVector];
		int cont = 0;
		for (i = i -1;i > -1;i--) {
			if (vtr[i] == pointer && i != 0) {
				cont++;
			} else {
				output[lengthNewVector-1] = i == 0 ? cont+1:cont;
				output[lengthNewVector-2] = pointer;
				lengthNewVector -= 2;
				pointer = vtr[i];
				cont = 1;
			}
		}
		
		return output;
	}
}
