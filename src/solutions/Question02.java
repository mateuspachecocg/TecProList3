package solutions;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestReturnByIndex();
	}
	
	public static void TestReturnByIndex() {
		int vector_test[] = {3, 1, 9, 10, 12};
		
		boolean TestResult = true;
		TestResult = TestResult && ReturnByIndex(10, vector_test) == -100;
		TestResult = TestResult && ReturnByIndex(2, vector_test) == 9;
		TestResult = TestResult && ReturnByIndex(0, vector_test) == 3;
		TestResult = TestResult && ReturnByIndex(4, vector_test) == 12;
		
		if (TestResult) {
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
