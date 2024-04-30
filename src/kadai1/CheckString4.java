package kadai1;

import java.util.Random;

public class CheckString4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();

		int rsp = rand.nextInt(3);

		switch (rsp) {
		case 0:
			System.out.print("グー");
			break;
		case 1:
			System.out.print("チョキ");
			break;
		case 2:
			System.out.print("パー");
			break;
		}
	}
}
