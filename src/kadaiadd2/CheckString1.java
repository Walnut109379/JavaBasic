package kadaiadd2;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		System.out.print("文字列を入力してください：");
		String w = scan.next();

		int count = w.length();

		System.out.print("文字列の長さは" + count + "です");
	}

}
