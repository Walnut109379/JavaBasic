package kadai02;

import java.util.Scanner;

public class checkpassword1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i <= 2; i++) {
			System.out.print("パスワードを入力して下さい：");
			String pw = scan.next();
			if (pw.equals("himitu")) {
				System.out.println("ログインできました");
				break;
			} else {
				System.out.println("不正解です");
			}
		}
	}
}
