package kadai01;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("色を入力して下さい：");
		String color = scan.next();

		switch (color) {
		case "red":
			System.out.print("赤です");
			break;
		case "green":
			System.out.print("緑です");
			break;
		case "blue":
			System.out.print("青です");
			break;
		default:
			System.out.print("他の色を入力してください");
		}
	}
}
