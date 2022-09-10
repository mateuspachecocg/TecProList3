package solutions;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestUnzipVector();
	}
	
	public static void TestUnzipVector() {
		int zipVtr[] = {0, 3, 1, 4, 0, 1};
		
		int result[] = unzipVector(zipVtr);
		int resultCorrect[] = {0, 0, 0, 1,  1, 1, 1, 0};
		
		boolean TestResult = true;
		for(int i =0; i < result.length;i++) {
			TestResult = TestResult && (result[i] == resultCorrect[i]);
		}

		if (TestResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
		
	}
		
	
	public static int[] unzipVector(int vtr[]) {
		int sizeVtr = 0, i, k;
		
		for (i = 1;i < vtr.length/2;i += 2) {
			sizeVtr += vtr[i];
		}
		
		int output[] = new int[sizeVtr];
		
		for (i = 1, k = 0;i < vtr.length/2;i += 2) {
			for (;k < vtr[i];k++) {
				output[k] = vtr[i-1]; 
			}
		}
		
		return output;
	}
}
