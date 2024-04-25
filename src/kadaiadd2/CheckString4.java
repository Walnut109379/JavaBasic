package kadaiadd2;

import java.util.Scanner;

public class CheckString4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		System.out.print("文字列の個数を入力してください：");
		int n = scan.nextInt();

		String[] mojiList = new String[n];
		String moji = "";

		for (int i = 0; i < mojiList.length; i++) {
			System.out.print((i + 1) + "つ目の文字列を入力してください：");
			mojiList[i] = scan.next();
		}

		for (String m : mojiList) {
			if (moji.length() < m.length()) {
				moji = m;
			}
		}

		System.out.println("最も長い文字列は「" + moji + "」です");
	}
}
