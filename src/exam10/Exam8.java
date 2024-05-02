package exam10;

import java.util.Random;
import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		System.out.println("1：グー、2：チョキ、3：パーから選択してください");
		System.out.print("じゃん、けん、、、：");
		int you = scan.nextInt();
		int com = random.nextInt(3) + 1;

		switch (you) {
		case 1:
			System.out.println("あなたはグー！");
			break;
		case 2:
			System.out.println("あなたはチョキ！");
			break;
		case 3:
			System.out.println("あなたはパー！");
			break;
		default:
			System.out.println("1～3で入力してください");
			break;
		}

		switch (com) {
		case 1:
			System.out.println("コンピューターはグー！");
			break;
		case 2:
			System.out.println("コンピューターはチョキ！");
			break;
		case 3:
			System.out.println("コンピューターはパー！");
			break;
		}

		if (you == com) {
			System.out.println("引き分けです");
		} else if (((you == 1) && (com == 2)) || ((you == 2) && (com == 3)) || ((you == 3) && (com == 1))) {
			System.out.println("あなたの勝ち");
		} else if (((you == 1) && (com == 3)) || ((you == 2) && (com == 1)) || ((you == 3) && (com == 2))) {
			System.out.println("あなたの負け");
		}
	}
}