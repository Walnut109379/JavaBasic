package kadaiadd3;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String A1;
		String A2;
		String A3;
		
		for (;;) { //初期化処理、条件など省略
			Random rand = new Random();
			String[] nums = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
			A1 = nums[rand.nextInt(10)];
			A2 = nums[rand.nextInt(10)];
			A3 = nums[rand.nextInt(10)];

			if ((A1 != A2) && (A2 != A3) && (A3 != A1))
				break; //A1とA2とA3がバラバラならbreak
			}
		String a = (A1 + A2 + A3);
		
		//System.out.println(a);
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int B;
		do {
			System.out.print("3桁の数字を入力してください：");
			B = scan.nextInt();
			String b = String.valueOf(B);
			count++;
			
			if (a == b) {
				break;
			}
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
