package solutions;
public class Question16{

  public static void main (String[] args) {
    testSortingOddEven();
  }
  
  public static void testSortingOddEven() {
    int vtrTest[]  = { 2, 4, 5, 7, 18, 21};
    int vtrExpected[] = {5, 7, 21, 2, 4, 18};

    int vtrResult[] = sortingOddEven(vtrTest);

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
  
  public static int[] sortingOddEven(int numbers[]) {
    
    int odd = 0;
    int even = 0;
    

    // Counting the number of odd and even numbers
    for(int i = 0;i < numbers.length;i++) {
      if(numbers[i] % 2 == 0) {
        even++;
      } else {
        odd++;
      } 
    }

    int evenVtr[] = new int[even];
    int output[] = new int[even+odd];
    int countOddAdded = 0;
    int countEvenAdded = 0;
    for (int i = 0;i < numbers.length; i++){
      if(numbers[i] % 2 == 0) {
        evenVtr[countEvenAdded] = numbers[i];
        countEvenAdded++;
      } else {
        output[countOddAdded] = numbers[i];
        countOddAdded++;
      }
    }

    for(int k = 0;k < even;k++) {
      output[odd+k] = evenVtr[k];
    }

    return output;
  }

}
