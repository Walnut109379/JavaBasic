package kadaiadd2;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		System.out.print("1つ目の文字列を入力してください：");
		String w1 = scan.next();

		System.out.print("2つ目の文字列を入力してください：");
		String w2 = scan.next();

		if (w1.equals(w2)) {
			System.out.print("2つの文字列は同じです");
		} else {
			System.out.print("2つの文字列は異なります");
		}
	}
}
