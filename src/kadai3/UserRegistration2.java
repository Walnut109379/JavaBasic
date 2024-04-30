package kadai3;

import java.util.Scanner;

public class UserRegistration2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("名前を入力してください：");
		String name = scan.next();

		if (hasNameError(name) == true) {
			return;
		}
		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();
		if (hasAgeError(age) == true) {
			return;
		}
		System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
	}

	static boolean hasNameError(String name) {
		boolean judge = false;

		if (name.length() > 20) {
			System.out.println("名前は20文字以内で入力してください");
			judge = true;
		} else if ("admin".equals(name)) {
			System.out.println("利用できない名前です");
			judge = true;
		} else if (name.contains("㌔")) {
			System.out.println("名前に禁止文字が含まれています");
			judge = true;
		}

		return judge;
	}

	static boolean hasAgeError(int age) {
		boolean judge = false;

		if ((age < 0) || (130 < age)) {
			System.out.println("年齢は0以上130以下で入力してください");
			judge = true;
		}
		return judge;
	}

}
