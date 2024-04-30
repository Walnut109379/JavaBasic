package kadai2;

import java.util.Scanner;

public class Introduce2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		System.out.println("情報を登録します");

		System.out.print("名前：");
		String n = scan.next();

		System.out.print("趣味1：");
		String h1 = scan.next();

		System.out.print("趣味2：");
		String h2 = scan.next();

		System.out.print("趣味3：");
		String h3 = scan.next();

		String hobby[] = new String[] { h1, h2, h3 };

		System.out.println("こんにちは" + n + "です");
		System.out.println("私の趣味は、");
		for (String h : hobby) {
			System.out.println("・" + h + "です");
		}
	}
}
