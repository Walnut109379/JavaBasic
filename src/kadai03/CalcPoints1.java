package kadai03;

public class CalcPoints1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int price = 1000;
		//プレミア会員のポイント計算
		int p1 = getPoints(price, true);
		System.out.println("プレミア会員には" + p1 + "ポイント付与されます");

		//無料会員のポイント計算
		int p2 = getPoints(price, false);
		System.out.println("無料会員には" + p2 + "ポイント付与されます");
	}

	static int getPoints(int price, boolean premium) {
		double per = premium == true ? 0.2 : 0.1;

		int point = (int) (price * per);

		return point;
	}

}
