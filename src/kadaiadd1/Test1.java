package kadaiadd1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("国語の点数を入力してください：");
		int J = scan.nextInt();

		System.out.print("数学の点数を入力してください：");
		int M = scan.nextInt();

		System.out.print("英語の点数を入力してください：");
		int E = scan.nextInt();

		double ave = ((J + M + E) / 3);

		System.out.print("平均は" + ave + "点です");
	}

}
