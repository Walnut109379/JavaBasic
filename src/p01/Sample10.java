package p01;

public class Sample10 {

	public static void main(String[] args) {
		String s1 = "10";
		String s2 = "20";

		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		//文字列としての数字を数値に変換するおまじない

		String s3 = String.valueOf(a);
		String s4 = String.valueOf(b);
		//数値を文字列の数字に変換している

		System.out.println(a + b);

		System.out.println(s3 + s4);
	}
}
