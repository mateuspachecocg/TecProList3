package solutions;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSumAll();
	}
	
	public static void TestSumAll () {
		int vector_test[] = {3, 1, 9, 10, 12};
		int vector_test2[] = {3, 1, 9, 10, 12, 10};
		
		boolean TestResult = true;
		TestResult = TestResult && SumAll(vector_test) == 35;
		TestResult = TestResult && SumAll(vector_test2) == 45;
		
		if (TestResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static int SumAll (int vet[]) {
		int sum = 0;
		for (int i = 0;i < vet.length;i++ ) {
			sum += vet[i];
		}
		return sum;
	}
	
}
