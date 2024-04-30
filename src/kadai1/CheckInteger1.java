package kadai1;

import java.util.Scanner;

public class CheckInteger1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力してください：");
		int num = scan.nextInt();

		if (num == 7) {
			System.out.println("大当たり！");
		} else {
			System.out.println("ハズレ");
		}
	}

}
