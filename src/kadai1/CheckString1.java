package kadai1;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("パスワード：");
		String pw = scan.next();

		if (pw.equals("himitu")) {
			System.out.print("一致しました");
		} else {
			System.out.print("一致しませんでした");
		}
	}
}
