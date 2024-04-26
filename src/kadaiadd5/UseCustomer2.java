package kadaiadd5;

import java.util.Arrays;
import java.util.Scanner;

public class UseCustomer2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Customer[] customerList = new Customer[3];
		Scanner scan = new Scanner(System.in);

		//顧客データの読み込み
		for (int index = 0; index < customerList.length; index++) {
			System.out.println((index + 1) + "人目の顧客情報を入力してください");
			System.out.print("ID：");
			int id = scan.nextInt();
			System.out.print("名前：");
			String name = scan.next();

			Customer customer;
			if (id == -1) {
				customer = new Customer(name);
			} else {
				customer = new Customer(id, name);
			}
			customerList[index] = customer;
		}

		int select;
		do {
			System.out.println("操作（1：一覧表示　2：変更　9：終了）を選択してください：");
			select = scan.nextInt();
			if (select == 1) {
				System.out.println("===顧客データ一覧===");
				for (Customer customer : customerList) {
					customer.showData();
				}
			} else if (select == 2) {
				System.out.print("更新するID：");
				int id = scan.nextInt();
				if (Arrays.asList(customerList).contains(id)) {
					System.out.print("新しいID：");
					int newID = scan.nextInt();
					id = newID;
					System.out.print("新しい名前：");
					String newName = scan.next();
				} else {
					System.out.println("指定したIDは存在しません");
				}
			}
		} while (select != 9);
	}
}
