package solutions;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    testDecodingCipher();
	}
	
	public static void testDecodingCipher() {
		
		String str = "1+447 w7{4- 26 3%$%";
		String strExpected = "hello world in java";
		String strOuput = decodingCipher(str);
		
		boolean testResult = strExpected.equals(strOuput);
		
		if (testResult) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}

	public static String decodingCipher (String msg) {
    char vtrEncrypter[] = { '%', '*', '(', '-', '+', '@', '#', '1', '2', '3', 'k', '4', '5', '6', '7', '8', '9',
				'{', '}', '!', '&', '$', 'w', '?', 'y', ':' };

		StringBuilder str = new StringBuilder(msg);

		for (int i = 0; i < msg.length(); i++) {

      char ch = msg.charAt(i);

      for (int k = 0;k < vtrEncrypter.length; k++) {
        if (vtrEncrypter[k] == ch) {
          str.setCharAt(i,(char) (k+97));
        }
      }
		}

		String output = new String(str);

		return output;
  }


}
