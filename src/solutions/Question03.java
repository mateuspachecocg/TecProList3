package solutions;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = {6, 5, -12, 10, 9, 1, -3, -7};
		int vetor_sorted[] = sortingByZero(vetor);
		printVector(vetor_sorted);
	}
	
	public static void printVector(int vetor[]) {
		System.out.print("Vetor = { ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+", ");
		}
		System.out.println("} ");
		
	}
	
	public static int[] sortingByZero (int input[]) {
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
		
		int left[] = sortingByZero(leftOriginal);
		int rigth[] = sortingByZero(rigthOriginal);
		
		int output[] = new int[length];
		int leftIndex  = 0;
		int rigthIndex = 0;
		int outputIndex = 0;
		while (leftIndex < left.length && rigthIndex < rigth.length) {
			int smaller;
			
			if (left[leftIndex] < rigth[rigthIndex]) {
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
