package kadaiadd6;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Human[] list = new Human[3];

		int num;

		System.out.println("===パーティを作成します===");

		for (int i = 0; i < list.length; i++) {
			System.out.print("どちらを（1:市民 2:戦士）を作成しますか：");
			num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.print("名前：");
				String name = scan.next();
				list[i] = new Human(name);
				break;
			case 2:
				System.out.print("名前：");
				name = scan.next();
				System.out.print("種別：");
				String type = scan.next();
				list[i] = new Warrior(type, name);
				break;
			default:
				System.out.println("無効な選択です");
				break;
			}
		}
		System.out.println("===パーティを作成しました===");

		int select;
		do {
			System.out.print("操作（1:一覧表示 2:攻撃 9:終了）を選択してください：");
			select = scan.nextInt();

			switch (select) {
			case 1:
				for (Human h : list) {
					h.info();
				}
				break;
			case 2:
				for (Human w : list) {
					w.attack();
				}
				break;
			}

		} while (select != 9);
		scan.close();
	}
}
