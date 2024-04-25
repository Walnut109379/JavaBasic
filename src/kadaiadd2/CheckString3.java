package kadaiadd2;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		String chainStr = ""; //連結用変数

		System.out.print("繰り返す回数を入力してください：");
		int count = scan.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.print(i + "つ目の文字列を入力してください：");
			String word = scan.next();
			chainStr += word;
			System.out.println(chainStr);
		}
	}
}
