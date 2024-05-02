package exam10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exam9 {

	static Scanner scan = new Scanner(System.in);
	static Map<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		String name;
		String tel;
		int select;
		do {
			System.out.println("1：登録　2：削除　3：一覧表示　9：終了");
			System.out.print("操作番号を入力してください：");
			select = scan.nextInt();

			switch (select) {
			case 1:
				addInfo();
				break;
			case 2:
				deleteInfo();
				break;
			case 3:
				showInfo();
				break;
			}

		} while (select != 9);
	}

	public static void addInfo() {
		System.out.print("名前を入力してください：");
		String name = scan.next();
		System.out.print("電話番号を入力してください：");
		String tel = scan.next();
		map.put(name, tel);
	}

	public static void deleteInfo() {
		System.out.print("名前を入力してください：");
		String name = scan.next();

		if (map.containsKey(name)) {
			map.remove(name);
		} else {
			System.out.println("登録されていない名前です");
		}
	}

	public static void showInfo() {
		Set<String> names = map.keySet();
		System.out.println("名前　　　電話番号");
		System.out.println("------------------");
		for (String key : names) {
			System.out.println(key + "\t" + map.get(key));
		}

	}
}
