package kadai7;

import java.util.Scanner;

public class PriceErrorCheck {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int price = 0;
		System.out.print("価格：");

		//整数チェック
		try {
			price = scan.nextInt();
		} catch (Exception e) {
			System.out.println("整数で入力して下さい");
		}

		//範囲チェック
		if (price < 0) {
			System.out.println("マイナスの値です");
		} else {
			System.out.println(price + "円を登録しました");
		}
	}

}
