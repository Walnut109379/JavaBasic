package kadai7;

import java.util.Scanner;

public class StringCart2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String[] itemList = new String[3];

		for (int n = 1; n <= 3; n++) {
			System.out.print("商品を追加してください:");
			String item = scan.next();
		}

		for (String i : itemList) {
			System.out.println(itemList);
		}

	}

}
