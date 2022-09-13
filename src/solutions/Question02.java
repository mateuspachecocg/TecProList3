package solutions;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testReturnByIndex();
	}
	
	public static void testReturnByIndex() {
		int vector_test[] = {3, 1, 9, 10, 12};
		
		boolean testResult = true;
		testResult = testResult && ReturnByIndex(10, vector_test) == -100;
		testResult = testResult && ReturnByIndex(2, vector_test) == 9;
		testResult = testResult && ReturnByIndex(0, vector_test) == 3;
		testResult = testResult && ReturnByIndex(4, vector_test) == 12;
		
		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static int ReturnByIndex(int index, int vet[]) {
		if (index < 0 || index >= vet.length) {
			return -100;
		} else {
			return vet[index];
		}
	}

}
