package solutions;



public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testDifferenceSets();
	}
	
	public static void testDifferenceSets() {
		int vtrTestA[]  = { 1, 2, 3, 4};	    
		int vtrTestB[]  = { 3, 4, 5, 6};	    
		int vtrExpected[] = {1, 2};

	    int vtrResult[] = differenceSets(vtrTestA, vtrTestB);

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
	
	
	// This functions implements a following operation with sets
	// Difference A-B all elements which are in A but not in B
	public static int[] differenceSets(int vtrA[], int vtrB[]) {
		
		
		int output[] = new int[vtrA.length];
		int outputIndex = 0;
		boolean isNotInBoth= true;
		
		for (int i = 0; i < vtrA.length; i++) {
			
			for (int j = 0; j < vtrB.length && isNotInBoth; j++) {
				isNotInBoth = isNotInBoth && !(vtrA[i] == vtrB[j]);
			}
			
			if (isNotInBoth) {
				output[outputIndex] = vtrA[i];
				outputIndex++;
			}
			
			isNotInBoth = true;
			
		}
		
		int outputResized[] = new int[outputIndex];
		
		for (int i = 0; i < outputResized.length; i++) {
			
			outputResized[i] = output[i];
			
		}
		
		
		return outputResized;
	}

}
