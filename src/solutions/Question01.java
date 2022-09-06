package solutions;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElementTest();		
	}
	
	public static void SearchElementTest() {
		int vetor_teste[] = {3, 1, 9, 10, 12};
		
		boolean TesteResult = true;
		TesteResult = TesteResult && SearchElement(10, vetor_teste) == 3;
		TesteResult = TesteResult && SearchElement(99, vetor_teste) == -100;
		TesteResult = TesteResult && SearchElement(3, vetor_teste) == 0;
		if (TesteResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static int SearchElement(int element, int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == element) {
				return i;
			}
		}
		
		return -100;
	}

}
