package solutions;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testVectorOrganize();
		
	}
	
	public static void testVectorOrganize() {
		int vtrTest[]  = {1,2,3,1,2,3,4,5};
	    int vtrExpected[] = {1,1,2,2,3,4,5};

	    int vtrResult[] = vectorOrganize(vtrTest);

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
	
	public static int[] vectorOrganize(int input[]) {
		
		int length = input.length;
		int middle = length/2;
		
		if (length == 1) {
			return input;
		}
		
		
		int leftOriginal[] = new int[middle];
		int rigthOriginal[] = new int[length - middle];
		
		for (int i = 0;i < length;i++) {
			if (i < length/2) {
				leftOriginal[i] = input[i];
			} else {
				rigthOriginal[i-middle] = input[i];
			}
		}
		
		int left[] = vectorOrganize(leftOriginal);
		int rigth[] = vectorOrganize(rigthOriginal);
		
		int output[] = new int[length];
		int leftIndex  = 0;
		int rigthIndex = 0;
		int outputIndex = 0;
		while (leftIndex < left.length && rigthIndex < rigth.length) {
			int smaller;
			
			if (left[leftIndex] <= rigth[rigthIndex]) {
				smaller = left[leftIndex];
				leftIndex++;
			} else {
				smaller = rigth[rigthIndex];
				rigthIndex++;
			}
			
			output[outputIndex] = smaller;
			outputIndex++;
		}
		
		if (leftIndex < left.length ) {
			for (int i = leftIndex;i < left.length;i++) {
				output[outputIndex] = left[leftIndex];
				leftIndex++;
				outputIndex++;
			}
		} else {
			for (int i = rigthIndex;i < rigth.length;i++) {
				output[outputIndex] = rigth[rigthIndex];
				rigthIndex++;
				outputIndex++;
			}
		}
		
		return output;

	}

}
