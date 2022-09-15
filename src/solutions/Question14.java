package solutions;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCharCount();
	}
	
	public static void testCharCount() {
		char vtrTest[] = {'1', '4', '1','a', 'b', 'c', 'd','a','k','a', 'b', 'c', 'd','a','k', '1'};
		char vtrExpected[] = { '1', '3','4', '1', 'a', '4', 'b', '2', 'c', '2', 'd', '2', 'k', '2'};
	
		char vtrResult[] = charCount(vtrTest);
		
 		boolean testResult = true;
		
		if(vtrResult.length == vtrExpected.length) {
			for(int i =0;i < vtrResult.length;i++) {
				testResult = testResult && (vtrResult[i] == vtrExpected[i]);
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
	
	// Algorithms analog to Question10
	public static char[] charCount(char vtrCh[]) {
		// Sorting the elements of the vector input by ASCII table
		vtrCh = sortingCharVtr(vtrCh);
		
		int lengthNewVector = 1;
		char pointer = vtrCh[0];
		int i;
		
		for (i = 0;i < vtrCh.length;i++) {
			if (pointer != vtrCh[i]) {
				lengthNewVector++;
				pointer = vtrCh[i];
			}
		}
		
		lengthNewVector = lengthNewVector*2;
		
		char output[] = new char[lengthNewVector];
		int cont = 0;
		for (i = i -1;i > -1;i--) {
			if (vtrCh[i] == pointer && i != 0) {
				cont++;
			} else {
				output[lengthNewVector-1] = i == 0 ? (char) (48+cont+1):(char) (48+cont);
				output[lengthNewVector-2] = pointer;
				lengthNewVector -= 2;
				pointer = vtrCh[i];
				cont = 1;
			}
		}
		
		return output;

	}
	
	
	// Merge Sort algorithms from Question03.java
	public static char[] sortingCharVtr(char input[]) {
		int length = input.length;
		int middle = length / 2;

		if (length == 1) {
			return input;
		}

		char leftOriginal[] = new char[middle];
		char rigthOriginal[] = new char[length - middle];

		for (int i = 0; i < length; i++) {
			if (i < length / 2) {
				leftOriginal[i] = input[i];
			} else {
				rigthOriginal[i - middle] = input[i];
			}
		}

		char left[] = sortingCharVtr(leftOriginal);
		char rigth[] = sortingCharVtr(rigthOriginal);

		char output[] = new char[length];
		int leftIndex = 0;
		int rigthIndex = 0;
		int outputIndex = 0;
		while (leftIndex < left.length && rigthIndex < rigth.length) {
			char smaller;

			if ((int) (left[leftIndex]) < (int) (rigth[rigthIndex])) {
				smaller = left[leftIndex];
				leftIndex++;
			} else {
				smaller = rigth[rigthIndex];
				rigthIndex++;
			}

			output[outputIndex] = smaller;
			outputIndex++;
		}

		if (leftIndex < left.length) {
			for (int i = leftIndex; i < left.length; i++) {
				output[outputIndex] = left[leftIndex];
				leftIndex++;
				outputIndex++;
			}
		} else {
			for (int i = rigthIndex; i < rigth.length; i++) {
				output[outputIndex] = rigth[rigthIndex];
				rigthIndex++;
				outputIndex++;
			}
		}

		return output;

	}

}
