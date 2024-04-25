package kadai01;

import java.util.Scanner;

public class CheckInteger3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();

		if (0 <= age && age <= 130) {
			System.out.println("正しい年齢です");
		} else if (age < 0 || 130 < age) {
			System.out.println("0～130で入力してください");
		}
	}
}