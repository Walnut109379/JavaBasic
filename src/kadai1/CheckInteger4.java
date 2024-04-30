package kadai1;

import java.util.Scanner;

public class CheckInteger4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力してください：");
		int num = scan.nextInt();

		if ((num >= 0) && ((num % 2) == 0)) {
			System.out.print("正の偶数です");
		} else if ((num >= 0) && ((num % 2) == 1)) {
			System.out.print("正の奇数です");
		} else if ((num < 0) && ((num % 2) == 0)) {
			System.out.print("負の偶数です");
		} else {
			System.out.print("負の奇数です");
		}
	}
}