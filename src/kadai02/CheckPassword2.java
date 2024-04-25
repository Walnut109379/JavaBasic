package kadai02;

import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("パスワードを入力して下さい：");
		String pw = scan.next();
		while (!("himitu".equals(pw))) {
			System.out.print("再入力してください：");
			pw = scan.next();
			if ("himitu".equals(pw)) {
				System.out.print("ログインできました");
			}
		}
	}
}