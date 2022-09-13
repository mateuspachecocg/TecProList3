package solutions;

public class Question12 {

	public static void main(String[] args) {

		testEncondingCipher();
	}

	public static void testEncondingCipher() {
		
		String str = "Hello World in Java";
		String strExpected = "1+447 w7{4- 26 3%$%";
		String strOuput = encondingCipher(str);
		
		boolean testResult = strExpected.equals(strOuput);
		System.out.println(strOuput.toString());
		System.out.println(strExpected.toString());
		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
	
	public static String encondingCipher(String msg) {

		char vtrEncrypter[] = { '%', '*', '(', '-', '+', '@', '#', '1', '2', '3', 'k', '4', '5', '6', '7', '8', '9',
				'{', '}', '!', '&', '$', 'w', '?', 'y', ':' };

		StringBuilder str = new StringBuilder(msg);

		for (int i = 0; i < msg.length(); i++) {

			int asciiValue = (int) msg.charAt(i);

			if (asciiValue >= 97 && asciiValue <= 123) {
				str.setCharAt(i, vtrEncrypter[asciiValue - 97]);
			} else if (asciiValue >= 65 && asciiValue <= 91) {
				str.setCharAt(i, vtrEncrypter[asciiValue - 65]);
			}
		}

		String output = new String(str);
		return output;
	}
}
