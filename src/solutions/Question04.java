package solutions;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSumAll();
	}
	
	public static void testSumAll () {
		int vectorTest[] = {3, 1, 9, 10, 12};
		int vectorTest2[] = {3, 1, 9, 10, 12, 10};
		
		boolean testResult = true;
		testResult = testResult && sumAll(vectorTest) == 35;
		testResult = testResult && sumAll(vectorTest2) == 45;
		
		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static int sumAll (int vet[]) {
		int sum = 0;
		for (int i = 0;i < vet.length;i++ ) {
			sum += vet[i];
		}
		return sum;
	}
	
}
