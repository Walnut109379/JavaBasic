package kadaiadd4;

public class Convert {

	int imput1;
	double imput2;
	String imput3;

	static void reverse(int imput1) {
		String i = String.valueOf(imput1);
		String result = "";
		for (int n = 0; n < i.length(); n++) {
			result = i.charAt(n) + result;
		}
		System.out.println(result);
	}

	static void reverse(double imput2) {
		String d = String.valueOf(imput2);
		String result = "";
		for (int n = 0; n < d.length(); n++) {
			result = d.charAt(n) + result;
		}
		System.out.println(result);
	}

	static void reverse(String imput3) {
		String result = "";
		for (int n = 0; n < imput3.length(); n++) {
			result = imput3.charAt(n) + result;
		}
		System.out.println(result);

		//char[] moji = s.toCharArray();
		//for (int i = moji.length - 1; i >= 0, i--){
		//

	}
}
