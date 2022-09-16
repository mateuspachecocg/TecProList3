package solutions;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testExtendsVector();
	}
	
	public static void testExtendsVector() {
		int vtrTest[]  = {2,3,2,4,3};
	    int vtrExpected[] = {2,2,3,3,3,2,2,4,4,4,4,3,3,3};

	    int vtrResult[] = extendsVector(vtrTest);

	    boolean testResult = true;
	    
	    if(vtrResult.length == vtrExpected.length){
	      for (int i = 0;i < vtrExpected.length;i++) {
	        testResult = testResult && (vtrExpected[i] == vtrResult[i]);
	      }
	      
	    } else {
	      testResult = false;
	    }

	    if(testResult) {
	      System.out.println("Test Passed!");
	    } else {
	      System.out.println("Test Fail!");
	    }
	}
	
	public static int[] extendsVector(int input[]) {
		
		int inputSum = 0;
		
		for (int i = 0;i < input.length;i++) { // O(N)
			inputSum += input[i];
		}
		
		int output[] = new int[inputSum];
		int outputIndex = 0;
		
		for (int i = 0;i < input.length;i++) {
			for (int k = 0;k < input[i];k++) {
				output[outputIndex] = input[i];
				outputIndex++;
			}
		}
		
		return output;
	}
	
}
