package solutions;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searchElementTest();		
	}
	
	public static void searchElementTest() {
		int vetor_teste[] = {3, 1, 9, 10, 12};
		
		boolean testeResult = true;
		testeResult = testeResult && searchElement(10, vetor_teste) == 3;
		testeResult = testeResult && searchElement(99, vetor_teste) == -100;
		testeResult = testeResult && searchElement(3, vetor_teste) == 0;
		if (testeResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static int searchElement(int element, int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == element) {
				return i;
			}
		}
		
		return -100;
	}

}
