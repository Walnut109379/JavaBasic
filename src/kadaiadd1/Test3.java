package kadaiadd1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int J = scan.nextInt();

		System.out.print("数学の点数を入力してください：");
		int M = scan.nextInt();

		System.out.print("英語の点数を入力してください：");
		int E = scan.nextInt();

		if ((J == M) && (M == E)) {
			System.out.print("全て同じ点数で" + J + "点です");
		} else if ((J == M) && (J > E)) {
			System.out.print("最高点は国語と数学で" + J + "点です");
		} else if ((M == E) && (M > J)) {
			System.out.print("最高点は数学と英語で" + M + "点です");
		} else if ((E == J) && (E > M)) {
			System.out.print("最高点は英語と国語で" + E + "点です");
		} else if ((J > M) && (J > E)) {
			System.out.print("最高点は国語で" + J + "点です");
		} else if ((M > E) && (M > J)) {
			System.out.print("最高点は数学で" + M + "点です");
		} else if ((E > J) && (E > M)) {
			System.out.print("最高点は英語で" + E + "点です");
		}
	}
}
