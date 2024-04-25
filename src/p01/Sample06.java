package p01;

public class Sample06 {
	//static int a; //メンバ変数

	public static void main(String[] args) {
		int hit = 1;
		int dasu = 3;

		double ave = (double) hit / dasu;
		//暗黙的型変換がされないように、キャストを明示する

		//float ave = (float) hit / dasu;
		//floatだと0.33333337

		System.out.println(ave);
	}
}
