package exam10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("年齢を入力してください：");
		int age = 0;

		try {
			age = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("整数で入力してください");
			return;
		}

		if (age < 0 || 130 < age) {
			System.out.println("0以上130以下で入力してください");
			//System.exit(1);
			return;
		}

		System.out.println(age + "歳で登録しました");

		scan.close();
	}

}
