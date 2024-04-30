package kadai1;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("名前：");
		String name = scan.next();

		name.length();

		if (name.length() <= 20) {
			System.out.print("ようこそ" + name + "さん");
		} else {
			System.out.print("エラー：20文字以内で入力してください");
		}
	}
}
