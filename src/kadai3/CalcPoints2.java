package kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額：");
		int price = scan.nextInt();

		System.out.println("1:プレミア会員, 2:無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();

		int point = getPoints(price, rank);

		if (rank == 1) {
			System.out.println("プレミア会員には" + point + "ポイント付与されます");
		} else {
			System.out.println("無料会員には" + point + "ポイント付与されます");
		}
	}

	static int getPoints(int price, int rank) {
		double per = rank == 1 ? 0.2 : 0.1;

		int point = (int) (price * per);

		return point;
	}

}
