package kadaiadd3;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		int num1 = rand.nextInt(100);

		Scanner scan = new Scanner(System.in);
		int count = 0;
		int num2;
		do {
			System.out.print("数字を入力してください：");
			num2 = scan.nextInt();
			number(num1, num2);
			count += 1;
		} while (!(num1 == num2));

		System.out.println(count + "回で当たりました！");
	}

	static void number(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("**小さすぎます**");
		} else if (num1 < num2) {
			System.out.println("**大きすぎます**");
		} else if (num1 == num2) {
			System.out.println("**当たりです**");
		}
	}
}
